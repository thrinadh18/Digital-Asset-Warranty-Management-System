package com.codegnan.service;

import java.util.List;

import com.codegnan.Exception.WarrantyNotFoundException;
import com.codegnan.model.Warranty;

public interface WarrantyService {
    void addWarranty(Warranty warranty);
    List<Warranty> getAllWarranties();
    Warranty getWarrantyById(int id) throws WarrantyNotFoundException;
    Warranty updateWarranty(Warranty warranty) throws WarrantyNotFoundException;
    void deleteWarranty(int id) throws WarrantyNotFoundException;
}

