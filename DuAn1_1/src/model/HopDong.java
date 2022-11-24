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
public class HopDong {
    private String id;
    private String maHD;
    private String tenHD;
    private String tenXe;
    private String tenNV;
    private String tenKH;
    private String ngayTao;
    private String ngayThanhToan;
    private String ngayGiao;
    private String ngayNhan;
    private int soLuong;
    private String sCCCD;
    private Double donGia; 
    private String sdt;
    private String diaChi;

    public HopDong() {
    }

    public HopDong(String id, String maHD, String tenHD, String tenXe, String tenNV, String tenKH, String ngayTao, String ngayThanhToan, String ngayGiao, String ngayNhan, int soLuong, String sCCCD, Double donGia, String sdt, String diaChi) {
        this.id = id;
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.tenXe = tenXe;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayGiao = ngayGiao;
        this.ngayNhan = ngayNhan;
        this.soLuong = soLuong;
        this.sCCCD = sCCCD;
        this.donGia = donGia;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(String ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getsCCCD() {
        return sCCCD;
    }

    public void setsCCCD(String sCCCD) {
        this.sCCCD = sCCCD;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    

    public double tongtien(){
        return soLuong*donGia;
    }

    
    
    public Object[] toRowData(){
        return new Object[]{id, maHD, tenHD, tenXe, tenNV, tenKH, ngayTao, ngayThanhToan, ngayGiao, ngayNhan, sCCCD, sdt, diaChi};
    }
    
}
