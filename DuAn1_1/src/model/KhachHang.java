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
public class KhachHang {
    private String id;
    private String maKh;
    private String ho;
    private String tenDem;
    private String ten;
    private String ngaySinh;
    private boolean gioiTinh;
    private String sdt;
    private String diaChi;
    private String quocGia;
    private int trangThai;

    public KhachHang() {
    }

    public KhachHang(String id, String maKh, String ho, String tenDem, String ten, String ngaySinh, boolean gioiTinh, String sdt, String diaChi, String quocGia, int trangThai) {
        this.id = id;
        this.maKh = maKh;
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
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

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "id=" + id + ", maKh=" + maKh + ", ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", diaChi=" + diaChi + ", quocGia=" + quocGia + ", trangThai=" + trangThai + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{id, maKh, ho + " " + tenDem + " " + ten,ngaySinh, gioiTinh == true ? "Nam":"Nữ", sdt, diaChi, quocGia, trangThai};
    }
}
