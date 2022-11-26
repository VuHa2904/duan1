/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vha74
 */
public class ThongKe {

    private String maSP;
    private String tenSP;

    private int namSX;
    private int soLuonTon;
    private Double giaNhap;
    private Double giaBan;
    private int soLuongBan;

    public ThongKe() {
    }

    public ThongKe(String maSP, String tenSP, int namSX, int soLuonTon, Double giaNhap, Double giaBan, int soLuongBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.namSX = namSX;
        this.soLuonTon = soLuonTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getSoLuonTon() {
        return soLuonTon;
    }

    public void setSoLuonTon(int soLuonTon) {
        this.soLuonTon = soLuonTon;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", namSX=" + namSX + ", soLuonTon=" + soLuonTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", soLuongBan=" + soLuongBan + '}';
    }
public Double doanhThu(){
    return giaBan*soLuongBan;
}
}
