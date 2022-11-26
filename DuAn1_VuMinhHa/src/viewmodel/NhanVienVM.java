/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.util.Date;

/**
 *
 * @author PH22349
 */
public class NhanVienVM {
    private String id;
    private String idChuVu;
    private String maNV;
    private String ho;
    private String tenDem;
    private String ten;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String sdt;
    private String email;
    private String diaChi;
    private int trangThai;

    public NhanVienVM() {
    }

    public NhanVienVM(String id, String idChuVu, String maNV, String ho, String tenDem, String ten, Date ngaySinh, boolean gioiTinh, String sdt, String email, String diaChi, int trangThai) {
        this.id = id;
        this.idChuVu = idChuVu;
        this.maNV = maNV;
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
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

    public String getIdChuVu() {
        return idChuVu;
    }

    public void setIdChuVu(String idChuVu) {
        this.idChuVu = idChuVu;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVienVM{" + "id=" + id + ", idChuVu=" + idChuVu + ", maNV=" + maNV + ", ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", email=" + email + ", diaChi=" + diaChi + ", trangThai=" + trangThai + '}';
    }
    
    public Object[] toRowData() {
        return new Object[]{id,idChuVu, maNV, ho + " " + tenDem + " " + ten, ngaySinh, gioiTinh == true ? "Nam" : "Nữ", sdt, email, diaChi, trangThai == 0 ? "Online" : "Offline"};
    }
}
