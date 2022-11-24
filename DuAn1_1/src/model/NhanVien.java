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
public class NhanVien {
    private String id;
    private String maNV;
    private String ho;
    private String tenDem;
    private String ten;
    private String vaiTro;
    private String ngaySinh;
    private boolean gioiTinh;
    private String sdt;
    private String email;
    private String diaChi;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String id, String maNV, String ho, String tenDem, String ten, String vaiTro, String ngaySinh, boolean gioiTinh, String sdt, String email, String diaChi, int trangThai) {
        this.id = id;
        this.maNV = maNV;
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.vaiTro = vaiTro;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
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

    

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", maNV=" + maNV + ", ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", vaiTro=" + vaiTro + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", email=" + email + ", diaChi=" + diaChi + ", trangThai=" + trangThai + '}';
    }

    
    public Object[] toRowData(){
        return new Object[]{id, maNV, ho + " " + tenDem + " " + ten, ngaySinh, vaiTro,gioiTinh == true ? "Nam" : "Nữ" , sdt, email, diaChi, trangThai == 0 ? "Đang làm việc" : "Nghỉ việc"};
    }
    
}
