/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;

import model.ThongKe;

import repository.ThongKeRepository;

import service.ThongKeService;

/**
 *
 * @author vha74
 */
public class ThongKeImpl implements  ThongKeService{
 private ThongKeRepository thongkeRp = new ThongKeRepository();
    @Override
    public List<ThongKe> getAll() {
       return thongkeRp.getAll();
    }
    
}
