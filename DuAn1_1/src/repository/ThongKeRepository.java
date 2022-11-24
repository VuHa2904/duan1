/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import model.ThongKe;
import utilities.DBConnect;

/**
 *
 * @author vha74
 */
public class ThongKeRepository {
    public List<ThongKe> getAll() {
        String query = "select a.ma, a.ten, b.NamSX,b.SoLuongTon,b.GiaNhap,b.GiaBan, c.soLuong  from SANPHAM a join  CHITIETSP b on a.id = b.idSP join HOADONCT c on b.id = c.idCTSanPham ";
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<ThongKe> listtk = new ArrayList<>();
            while (rs.next()) {
                ThongKe tk = new ThongKe(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getInt(7));
                listtk.add(tk);
            }
            return listtk;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
