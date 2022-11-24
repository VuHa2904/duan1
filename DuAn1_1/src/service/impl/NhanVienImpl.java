/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.NhanVien;
import repository.NhanVienRepository;
import service.NhanVienService;

/**
 *
 * @author PH22349
 */
public class NhanVienImpl implements NhanVienService{

    NhanVienRepository nhanVienRp = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRp.getAll();
    }
    
}
