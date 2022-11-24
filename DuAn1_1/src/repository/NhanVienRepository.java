/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author PH22349
 */
public class NhanVienRepository {

    public List<NhanVien> getAll() {
        String query = "SELECT [id]\n"
                + "      ,[maNV]\n"
                + "      ,[ho]\n"
                + "      ,[tenDem]\n"
                + "      ,[ten]\n"
                + "      ,[vaiTro]\n"
                + "      ,[ngaySinh]\n"
                + "      ,[gioiTinh]\n"
                + "      ,[SĐT]\n"
                + "      ,[email]\n"
                + "      ,[diaChi]\n"
                + "      ,[trangThai]\n"
                + "  FROM [dbo].[NHANVIEN]";
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> listNv = new ArrayList<>();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12));
                listNv.add(nv);
            }
            return listNv;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<NhanVien> lisst = new NhanVienRepository().getAll();
        for (NhanVien x : lisst) {
            System.out.println(x.toString());
        }
    }
}
