/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author PH22349
 */
public class KhuyenMai {
    private String id;
    private String ma;
    private String ten;
    private int giamGia;
    private String ngayBD;
    private String ngayKT;
    private boolean trangThai;

    public KhuyenMai(String id, String ma, String ten, int giamGia, String ngayBD, String ngayKT, boolean trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.giamGia = giamGia;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.trangThai = trangThai;
    }


    public KhuyenMai() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    

    @Override
    public String toString() {
        return "KhuyenMai{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", giamGia=" + giamGia + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + ", trangThai=" + trangThai + '}';
    }

    
    
    public Object[] toRowData(){
        return new Object[]{id, ma, ten, giamGia, ngayBD, ngayKT, trangThai == true ? "Còn KM" :"Hết KM"};
    }
}
