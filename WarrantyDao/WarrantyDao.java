package com.codegnan.WarrantyDao;

import java.util.List;

import com.codegnan.Exception.WarrantyNotFoundException;
import com.codegnan.model.Warranty;

public interface WarrantyDao {
    void save(Warranty warranty);
    List<Warranty> findAll();
    Warranty findById(int id) throws WarrantyNotFoundException;
    Warranty update(Warranty warranty) throws WarrantyNotFoundException;
    void deleteById(int id) throws WarrantyNotFoundException;
}

