/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author PH22349
 */
public class CTHopDongVM {
    private String idChiTietSp;
    private String idHopDong;
    private int donGia;

    public CTHopDongVM() {
    }

    public CTHopDongVM(String idChiTietSp, String idHopDong, int donGia) {
        this.idChiTietSp = idChiTietSp;
        this.idHopDong = idHopDong;
        this.donGia = donGia;
    }

    public String getIdChiTietSp() {
        return idChiTietSp;
    }

    public void setIdChiTietSp(String idChiTietSp) {
        this.idChiTietSp = idChiTietSp;
    }

    public String getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(String idHopDong) {
        this.idHopDong = idHopDong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "CTHopDongVM{" + "idChiTietSp=" + idChiTietSp + ", idHopDong=" + idHopDong + ", donGia=" + donGia + '}';
    }
    
    
}
