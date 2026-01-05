package com.codegnan.controller;

import java.util.List;

import com.codegnan.Exception.WarrantyNotFoundException;
import com.codegnan.model.Warranty;
import com.codegnan.service.WarrantyService;
import com.codegnan.service.WarrantyServiceImpl;

public class ControllerClass {

    public static void main(String[] args) {

        WarrantyService service = new WarrantyServiceImpl();

        // Insert records
        service.addWarranty(new Warranty(201, "Laptop", "Dell", 3, "Rahul"));
        service.addWarranty(new Warranty(202, "Mobile", "Samsung", 2, "Arjun"));
        service.addWarranty(new Warranty(203, "Smart TV", "LG", 4, "Kiran"));

        System.out.println("Warranty records inserted successfully");

        // Fetch all records
        System.out.println("ID\tProduct\tBrand\tYears\tOwner");
        List<Warranty> list = service.getAllWarranties();
        for (Warranty w : list) {
            System.out.println(w);
        }

        // Find by ID
        
        try {
            Warranty w = service.getWarrantyById(202);
            System.out.println("Found: " + w);
        } catch (WarrantyNotFoundException e) {
            e.printStackTrace();
        }
        

        // Update record
        
        try {
            service.updateWarranty(
                new Warranty(202, "Mobile", "Samsung", 3, "Arjun R"));
        } catch (WarrantyNotFoundException e) {
            e.printStackTrace();
        }
        

        // Delete record
        
        try {
            service.deleteWarranty(203);
        } catch (WarrantyNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}


