/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vhc
 */
public class BDConnection {
      String driverType ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url="jdbc:sqlserver://HC:1433;databasename=QLKhachSan";
    String user = "sa";
    String pass="12345678";
    Connection con = null;
    protected ResultSet get(String strSelect) throws Exception{
       Class.forName(driverType);
       con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(strSelect);
        return rs;
    }
    protected  void exeNonQuery(String strQuery) throws Exception{
    Class.forName(driverType);
    con = DriverManager.getConnection(url,user, pass);
    Statement st = con.createStatement();
    st.executeUpdate(strQuery);
    con.close();
    }
    protected void CloseConnect() throws SQLException{
       con.close();
    }
   
}
