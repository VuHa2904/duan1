/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PH22349
 */
public class LoaiXe {
    private String id;
    private String ma;
    private String ten;

    public LoaiXe() {
    }

    public LoaiXe(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
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

    @Override
    public String toString() {
        return "LoaiXe{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{id, ma, ten};
    }
}
