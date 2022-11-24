/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PH22349
 */
public class SanPham {
    private String id;
    private String ma;
    private String ten;
    private int gia;
    private int giamGia;
    private boolean trangThai;

    public SanPham(String id, String ma, String ten, int gia, int giamGia, boolean trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giamGia;
        this.trangThai = trangThai;
    }


    public SanPham() {
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

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    
    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", giamGia=" + giamGia + ", trangThai=" + trangThai + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{id, ma, ten, gia, giamGia, trangThai == true ? "Còn xe" : "Hết xe"};
    }
}
