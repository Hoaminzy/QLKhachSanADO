/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Phong;

import java.sql.Date;

/**
 *
 * @author vhc
 */
public class Phong {
    String PK_iMaPhong;
    String sTenPhong;
    float fGiaPhong;
    String sMota;
    String sHinhanh;
    String PK_iMaLoaiPhong;
    String PK_iMaNV;
    int iMaxPeople;
    int iSoLuong;
    String dNgayDen;
    String dNgayDi; 
    public Phong() {
        super();
    }

    public Phong(String PK_iMaPhong, String sTenPhong, float fGiaPhong, String sMota, String sHinhanh, String PK_iMaLoaiPhong, String PK_iMaNV) {
        this.PK_iMaPhong = PK_iMaPhong;
        this.sTenPhong = sTenPhong;
        this.fGiaPhong = fGiaPhong;
        this.sMota = sMota;
        this.sHinhanh = sHinhanh;
        this.PK_iMaLoaiPhong = PK_iMaLoaiPhong;
        this.PK_iMaNV = PK_iMaNV;
    }

    public Phong(String PK_iMaPhong, float fGiaPhong, String sHinhanh, String PK_iMaLoaiPhong, int iMaxPeople, int iSoLuong, String dNgayDen, String dNgayDi) {
        this.PK_iMaPhong = PK_iMaPhong;
        this.fGiaPhong = fGiaPhong;
        this.sHinhanh = sHinhanh;
        this.PK_iMaLoaiPhong = PK_iMaLoaiPhong;
        this.iMaxPeople = iMaxPeople;
        this.iSoLuong = iSoLuong;
        this.dNgayDen = dNgayDen;
        this.dNgayDi = dNgayDi;
    }


    public String getPK_iMaPhong() {
        return PK_iMaPhong;
    }

    public void setPK_iMaPhong(String PK_iMaPhong) {
        this.PK_iMaPhong = PK_iMaPhong;
    }

    public String getsTenPhong() {
        return sTenPhong;
    }

    public void setsTenPhong(String sTenPhong) {
        this.sTenPhong = sTenPhong;
    }

    public float getfGiaPhong() {
        return fGiaPhong;
    }

    public void setfGiaPhong(float fGiaPhong) {
        this.fGiaPhong = fGiaPhong;
    }

    public String getsMota() {
        return sMota;
    }

    public void setsMota(String sMota) {
        this.sMota = sMota;
    }

    public String getsHinhanh() {
        return sHinhanh;
    }

    public void setsHinhanh(String sHinhanh) {
        this.sHinhanh = sHinhanh;
    }

    public String getPK_iMaLoaiPhong() {
        return PK_iMaLoaiPhong;
    }

    public void setPK_iMaLoaiPhong(String PK_iMaLoaiPhong) {
        this.PK_iMaLoaiPhong = PK_iMaLoaiPhong;
    }

    public String getPK_iMaNV() {
        return PK_iMaNV;
    }

    public void setPK_iMaNV(String PK_iMaNV) {
        this.PK_iMaNV = PK_iMaNV;
    }

    public int getiMaxPeople() {
        return iMaxPeople;
    }

    public void setiMaxPeople(int iMaxPeople) {
        this.iMaxPeople = iMaxPeople;
    }

    public int getiSoLuong() {
        return iSoLuong;
    }

    public void setiSoLuong(int iSoLuong) {
        this.iSoLuong = iSoLuong;
    }

    public String getdNgayDen() {
        return dNgayDen;
    }

    public void setdNgayDen(String dNgayDen) {
        this.dNgayDen = dNgayDen;
    }

    public String getdNgayDi() {
        return dNgayDi;
    }

    public void setdNgayDi(String dNgayDi) {
        this.dNgayDi = dNgayDi;
    }
    
    
            
}
