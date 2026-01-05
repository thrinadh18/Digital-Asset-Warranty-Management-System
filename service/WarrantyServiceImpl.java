package com.codegnan.service;

import java.util.List;

import com.codegnan.Exception.WarrantyNotFoundException;
import com.codegnan.WarrantyDao.WarrantyDao;
import com.codegnan.WarrantyDao.WarrantyDaoImpl;
import com.codegnan.model.Warranty;

public class WarrantyServiceImpl implements WarrantyService {

    WarrantyDao dao = new WarrantyDaoImpl();

    public void addWarranty(Warranty warranty) {
        dao.save(warranty);
    }

    public List<Warranty> getAllWarranties() {
        return dao.findAll();
    }

    public Warranty getWarrantyById(int id) throws WarrantyNotFoundException {
        return dao.findById(id);
    }

    public Warranty updateWarranty(Warranty warranty) throws WarrantyNotFoundException {
        return dao.update(warranty);
    }

    public void deleteWarranty(int id) throws WarrantyNotFoundException {
        dao.deleteById(id);
    }
}

