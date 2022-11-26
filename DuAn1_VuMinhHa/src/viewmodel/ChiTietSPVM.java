/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author PH22349
 */
public class ChiTietSPVM {
    private String id;
    private String idSP;
    private String idHang;
    private String idLoai;
    private String idMau;
    private int namSX;
    private String moTa;
    private int soLuongTon;
    private int giaNhap;
    private int giaBan;

    public ChiTietSPVM(String id, String idSP, String idHang, String idLoai, String idMau, int namSX, String moTa, int soLuongTon, int giaNhap, int giaBan) {
        this.id = id;
        this.idSP = idSP;
        this.idHang = idHang;
        this.idLoai = idLoai;
        this.idMau = idMau;
        this.namSX = namSX;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSPVM() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdHang() {
        return idHang;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public String getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(String idLoai) {
        this.idLoai = idLoai;
    }

    public String getIdMau() {
        return idMau;
    }

    public void setIdMau(String idMau) {
        this.idMau = idMau;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", idSP=" + idSP + ", idHang=" + idHang + ", idLoai=" + idLoai + ", idMau=" + idMau + ", namSX=" + namSX + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }
    
    public Object[] toRowData(){
        return new Object[] {id, idSP, idHang, idLoai, idMau, namSX, moTa, soLuongTon, giaNhap, giaBan};
    }
}
