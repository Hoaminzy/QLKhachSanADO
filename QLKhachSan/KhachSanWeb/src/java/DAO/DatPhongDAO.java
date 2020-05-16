/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Phong.Phong;
import java.util.ArrayList;

/**
 *
 * @author vhc
 */
public class DatPhongDAO {
    public ArrayList<Phong> arrPhong = new ArrayList<>();
     public ArrayList<Phong> arrDatPhong = new ArrayList<>();
	public void AddCart(Phong p)
	{
		boolean isSpExistInCart = false;
		for(Phong objPhong:arrPhong)
				if( objPhong.getPK_iMaPhong().equals(p.getPK_iMaPhong()))
				{
					int soluong = objPhong.getiSoLuong();
					objPhong.setiSoLuong(soluong+1);
					isSpExistInCart = true;
					break;
				}
		if(!isSpExistInCart)
			arrPhong.add(p);
	}
        
	public void UpdateQuantity(String[] arrSoLuong)
	{
		for(int i=0;i<arrPhong.size();i++)
			arrPhong.get(i).setiSoLuong(Integer.valueOf(arrSoLuong[i]));
	}
        
        public boolean themVaoDSDatPhong(String PK_iMaPhong){
            for(int i=0; i<arrPhong.size(); i++){
               if(arrPhong.get(i).getPK_iMaPhong().equals(PK_iMaPhong)){
                   arrPhong.add(arrPhong.get(i));
                   return true;
               }
        }
            return false;
        }
        public boolean xoaDatPhong( String PK_iMaPhong){
            for(int i=0; i<arrDatPhong.size(); i++){
                if(arrDatPhong.get(i).getPK_iMaPhong().equals(PK_iMaPhong)){
                   arrDatPhong.add(arrDatPhong.get(i));
                   return true;
               }
            
            }
        return false;
        }
}
