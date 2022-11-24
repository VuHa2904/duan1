/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PH22349
 */
public class SPKhuyenMai {
    private String idSanPham;
    private String idVoucher;

    public SPKhuyenMai() {
    }

    public SPKhuyenMai(String idSanPham, String idVoucher) {
        this.idSanPham = idSanPham;
        this.idVoucher = idVoucher;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(String idVoucher) {
        this.idVoucher = idVoucher;
    }

    @Override
    public String toString() {
        return "SanPhamKMVM{" + "idSanPham=" + idSanPham + ", idVoucher=" + idVoucher + '}';
    }
}
