/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.MauSac;

/**
 *
 * @author PH22349
 */
public class MauSacRepository {

    public List<MauSac> getAll() {
        String query = "SELECT * FROM MAUSAC";
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<MauSac> listsp = new ArrayList<>();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listsp.add(ms);
            }
            return listsp;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public MauSac getOne(String ma) {
        String query = "SELECT * FROM MAUSAC WHERE ma = ?";

        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);  ResultSet rs = ps.executeQuery();) {
            List<MauSac> listsp = new ArrayList<>();
            ps.setObject(1, ma);
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                return ms;
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(MauSac ms) {
        String query = "INSERT INTO [dbo].[MAUSAC]\n"
                + "           ([ma]\n"
                + "           ,[ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[MAUSAC]\n"
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

    public boolean update(MauSac ms, String ma) {
        String query = "UPDATE [dbo].[MAUSAC]\n"
                + "   SET [ma] = ?\n"
                + "      ,[ten] = ?\n"
                + " WHERE ma = ?";

        int check = 0;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ms.getMa());
            ps.setObject(2, ms.getTen());
            ps.setObject(3, ma);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        List<MauSac> lisst = new MauSacRepository().getAll();
        for (MauSac x : lisst) {
            System.out.println(x.toString());
        }
//        MauSac ms = new MauSac("maMs3", "Ten2");
//        System.out.println(new MauSacRepository().add(ms));
//        System.out.println(new MauSacRepository().update(new MauSac("maMs2", "Ten2"), "maMs2"));
    }
}
