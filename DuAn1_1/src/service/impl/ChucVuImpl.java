/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.ChucVu;
import repository.ChucVuRepository;
import service.ChucVuService;

/**
 *
 * @author PH22349
 */
public class ChucVuImpl implements ChucVuService {

    private ChucVuRepository chucVuRp = new ChucVuRepository();

    @Override
    public List<ChucVu> getAll() {
        return chucVuRp.getAll();
    }

    @Override
    public String Add(ChucVu cv) {
        boolean add = chucVuRp.add(cv);
        if (add) {
            return "Add thành công";
        } else {
            return "Add lỗi";
        }
    }

    @Override
    public String delete(String ma) {
          boolean delete = chucVuRp.delete(ma);
        if(delete){
            return "delete thành công";
        }else{
            return "delete lỗi";
        }
    }

    @Override
    public String update(ChucVu cv, String ma) {
          boolean update = chucVuRp.update(cv, ma);
        if(update){
            return "update thành công";
        }else{
            return "update lỗi";
        }
    }

    @Override
    public ChucVu getOne(String ma) {
        return chucVuRp.getOne(ma);
    }

}
