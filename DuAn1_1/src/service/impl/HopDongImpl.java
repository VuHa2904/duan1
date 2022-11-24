/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.HopDong;
import repository.HopDongRepository;
import service.HopDongSerVice;
import viewmodel.HopDongVD;

/**
 *
 * @author vha74
 */
public class HopDongImpl implements HopDongSerVice{
private HopDongRepository hopdongRepo = new HopDongRepository();
    @Override
    public List<HopDongVD> getAll() {
        return hopdongRepo.getAll();
    }

    public String Add(HopDongVD hd) {
        return hopdongRepo.add(hd);
        
    }

    @Override
    public String delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(HopDong hd, String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HopDongVD getOne(String ma) {
        return hopdongRepo.getOne(ma);
    }

//    @Override
//    public String Add(HopDongVD hd) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

   
    
}
