package com.codegnan.WarrantyDao;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.Exception.WarrantyNotFoundException;
import com.codegnan.model.Warranty;

public class WarrantyDaoImpl implements WarrantyDao {

    List<Warranty> warrantyList = new ArrayList<>();

    public void save(Warranty warranty) {
        warrantyList.add(warranty);
    }

    public List<Warranty> findAll() {
        return warrantyList;
    }

    public Warranty findById(int id) throws WarrantyNotFoundException {
        for (Warranty w : warrantyList) {
            if (w.getId() == id) {
                return w;
            }
        }
        throw new WarrantyNotFoundException("Warranty ID " + id + " not found");
    }

    public Warranty update(Warranty warranty) throws WarrantyNotFoundException {
        for (int i = 0; i < warrantyList.size(); i++) {
            if (warrantyList.get(i).getId() == warranty.getId()) {
                warrantyList.set(i, warranty);
                return warranty;
            }
        }
        throw new WarrantyNotFoundException("Cannot update. ID not found");
    }

    public void deleteById(int id) throws WarrantyNotFoundException {
        boolean removed = false;

        for (int i = 0; i < warrantyList.size(); i++) {
            if (warrantyList.get(i).getId() == id) {
                warrantyList.remove(i);
                removed = true;
                break;
            }
        }

        if (!removed) {
            throw new WarrantyNotFoundException("Cannot delete. ID not found");
        }
    }
}

