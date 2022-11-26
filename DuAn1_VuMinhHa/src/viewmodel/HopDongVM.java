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
public class HopDongVM {
    private String id;
    private String idNhanVien;
    private String idHTTT;
    private String idKhachHang;
    private String maHD;
    private String tenHD;
    private String tenXe;
    private String tenNV;
    private String tenKH;
    private Date ngayTao;
    private Date ngayThanhToan;
    private Date ngayGiao;
    private Date ngayNhan;
    private String sCCCD;
    private String sdt;
    private String diaChi;

    public HopDongVM() {
    }

    public HopDongVM(String id, String idNhanVien, String idHTTT, String idKhachHang, String maHD, String tenHD, String tenXe, String tenNV, String tenKH, Date ngayTao, Date ngayThanhToan, Date ngayGiao, Date ngayNhan, String sCCCD, String sdt, String diaChi) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.idHTTT = idHTTT;
        this.idKhachHang = idKhachHang;
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.tenXe = tenXe;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayGiao = ngayGiao;
        this.ngayNhan = ngayNhan;
        this.sCCCD = sCCCD;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdHTTT() {
        return idHTTT;
    }

    public void setIdHTTT(String idHTTT) {
        this.idHTTT = idHTTT;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
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

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getsCCCD() {
        return sCCCD;
    }

    public void setsCCCD(String sCCCD) {
        this.sCCCD = sCCCD;
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

    @Override
    public String toString() {
        return "HopDongVM{" + "id=" + id + ", idNhanVien=" + idNhanVien + ", idHTTT=" + idHTTT + ", idKhachHang=" + idKhachHang + ", maHD=" + maHD + ", tenHD=" + tenHD + ", tenXe=" + tenXe + ", tenNV=" + tenNV + ", tenKH=" + tenKH + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", ngayGiao=" + ngayGiao + ", ngayNhan=" + ngayNhan + ", sCCCD=" + sCCCD + ", sdt=" + sdt + ", diaChi=" + diaChi + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{id, idNhanVien, idHTTT, idKhachHang, maHD, tenHD, tenXe, tenNV, tenKH, ngayTao, ngayThanhToan, ngayGiao, ngayNhan, sCCCD, sdt, diaChi};
    }

}
