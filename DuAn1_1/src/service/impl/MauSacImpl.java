/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.MauSac;
import repository.MauSacRepository;
import service.MauSacService;

/**
 *
 * @author PH22349
 */
public class MauSacImpl implements MauSacService{
    
    private MauSacRepository mauSacRp = new MauSacRepository();
    
    @Override
    public List<MauSac> getAll() {
        return mauSacRp.getAll();
    }

    @Override
    public String Add(MauSac ms) {
         boolean add = mauSacRp.add(ms);
        if(add){
            return "Add thành công";
        }else{
            return "Add lỗi";
        }
    }

    @Override
    public String delete(String ma) {
         boolean delete = mauSacRp.delete(ma);
        if(delete){
            return "delete thành công";
        }else{
            return "delete lỗi";
        }
    }

    @Override
    public String update(MauSac ms, String ma) {
         boolean update = mauSacRp.update(ms, ma);
        if(update){
            return "update thành công";
        }else{
            return "update lỗi";
        }
    }

    @Override
    public MauSac getOne(String ma) {
        return mauSacRp.getOne(ma);
    }
}
