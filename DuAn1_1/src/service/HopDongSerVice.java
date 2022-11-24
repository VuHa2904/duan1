/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;

import model.HopDong;
import viewmodel.HopDongVD;

/**
 *
 * @author vha74
 */
public interface HopDongSerVice {
    List<HopDongVD> getAll();

    String Add(HopDongVD hd);

    String delete(String ma);

    String update(HopDong hd, String ma);

    HopDongVD getOne(String ma);
}
