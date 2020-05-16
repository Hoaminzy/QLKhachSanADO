/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.DichVu.DichVu;
import Models.DichVu.LoaiDV;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoaiDichVuDAO extends Connection.BDConnection {

    public static LoaiDichVuDAO instance() {
        return new LoaiDichVuDAO();
    }

    public Vector<LoaiDV> getAllDichVu() {
        Vector<LoaiDV> vtdv = new Vector<>();

        try {
            String strSelect = "select * from tbl_DichVu";
            ResultSet rs = get(strSelect);
            while(rs.next()){
                LoaiDV dv = new LoaiDV();
                LoadData(rs, dv);
                vtdv.add(dv);
            }
            CloseConnect();
        } catch (Exception ex) {
            System.out.println("Connect Database Error!");
        }
        return vtdv;

    }
    private void LoadData(ResultSet rs, LoaiDV dv) throws SQLException{
     dv.setPK_iMaDV(rs.getString("PK_iMaDV"));
     dv.setsTenLoaiDV(rs.getString("sTenLoaiDV"));
    }
}
