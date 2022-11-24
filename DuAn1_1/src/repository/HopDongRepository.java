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
import java.util.Date;

import model.HopDong;
import model.ThongKe;
import utilities.DBConnect;
import viewmodel.HopDongVD;

/**
 *
 * @author vha74
 */
public class HopDongRepository {

    public List<HopDongVD> getAll() {
        String query = "select HOADON.ma,HOADON.tenXe,HOADON.tenNV,HOADON.tenKH,HOADON.ngayTao,HOADON.ngayThanhToan,HOADONCT.soLuong,HOADONCT.donGia,HOADON.SĐT,HOADON.diaChi  from HoaDon join HOADONCT on HOADON.id = HOADONCT.idHoaDon ";
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HopDongVD> listhd = new ArrayList<>();
            while (rs.next()) {
                HopDongVD hd = new HopDongVD(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10)
                );
                listhd.add(hd);
            }
            return listhd;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public HopDongVD getOne(String ma) {
        String query = "select HOADON.ma,HOADON.tenXe,HOADON.tenNV,HOADON.tenKH,HOADON.ngayTao,HOADON.ngayThanhToan,HOADONCT.soLuong,HOADONCT.donGia,HOADON.SĐT,HOADON.diaChi  from HoaDon join HOADONCT on HOADON.id = HOADONCT.idHoaDon where ma = ?";

        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);  ResultSet rs = ps.executeQuery();) {
            List<HopDongVD> listhd = new ArrayList<>();
            ps.setObject(1, ma);
            while (rs.next()) {
                HopDongVD hdvd = new HopDongVD(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10)
                );
                return hdvd;
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public String add(HopDongVD hd) {
        String query = "insert into HOADON (HOADON.ma,HOADON.tenXe,HOADON.tenNV,HOADON.tenKH,HOADON.ngayTao,HOADON.ngayThanhToan,HOADON.SĐT,HOADON.diaChi) values (?,?,?,?,?,?,?,?)"
                + "insert into HOADONCT(soLuong,donGia) values (?,?)" ;
        
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hd.getMaHD());
            ps.setObject(2, hd.getTenXe());
            ps.setObject(3, hd.getTenNV());
            ps.setObject(4, hd.getTenKH());
          
            ps.setObject(5, hd.getNgayTao());
            ps.setObject(6, hd.getNgayThanhToan());
            ps.setObject(7, hd.getDiaChi());
            ps.setObject(8, hd.getSdt());
            ps.setObject(9, hd.getDonGia());
            ps.setObject(10, hd.getSoLuong());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return "Thêm thành công";
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[CHUCVU]\n"
                + "      WHERE ma = ?";
        int check = 0;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

//    public boolean update(ChucVu cv, String ma) {
//        String query = "UPDATE [dbo].[CHUCVU]\n"
//                + "   SET [ma] = ?\n"
//                + "      ,[ten] = ?\n"
//                + " WHERE ma = ?";
//
//        int check = 0;
//        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
//            ps.setObject(1, cv.getMa());
//            ps.setObject(2, cv.getTen());
//            ps.setObject(3, ma);
//            check = ps.executeUpdate();
//
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return check > 0;
//    }

    public static void main(String[] args) {
        List<HopDongVD> lisst = new HopDongRepository().getAll();
        for (HopDongVD x : lisst) {
            System.out.println(x.toString());
        }
    }

    
}
