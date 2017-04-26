/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Multiverse
 * Develop by E.T.A
 * 
 */
public class SettingToDatabaseTemplate {
    
    public Vector<Setting> executeSelectSettingTemplate() throws SQLException{
        String login = "rt-01";
        Connection conn = MyConnection.getConnection();
        Vector<Setting> vSetting;
        try{
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery("Select * from tb_setting where id_login = '"+login+"'");
                vSetting = new Vector<>();
                while(rs.next()){
                    Setting st = new Setting();
                    st.setId_setting    (rs.getString("id_setting"));
                    st.setNo_rt         (rs.getString("no_rt"));
                    st.setNo_rw         (rs.getString("no_rw"));
                    st.setNama_rt       (rs.getString("nama_rt"));
                    st.setNama_rw       (rs.getString("nama_rw"));
                    st.setDesa          (rs.getString("nama_desa"));
                    st.setKecamatan     (rs.getString("nama_kecamatan"));
                    st.setKabupaten     (rs.getString("nama_kabupaten"));
                    st.setProvinsi      (rs.getString("nama_provinsi"));
                    vSetting.add(st);
                }
        }finally{
            if (conn != null) {
                conn.close();
            }
        }
        
        return vSetting;
    }
    public Vector<Setting> executeSaveSettingTemplate(Setting st) throws SQLException{
        Connection conn = MyConnection.getConnection();
        Vector<Setting> vSetting = null;
        String login = "rt-01";
        try {
                vSetting = new Vector<>();
                Statement statement = conn.createStatement();
                System.out.println("Statement Berhasil di Create");
                String query = "Update tb_setting set no_rt = '"      + st.getNo_rt()     +
                        "', no_rw           = '"                      + st.getNo_rw()     +
                        "', nama_rt         = '"                      + st.getNama_rt()   +
                        "', nama_rw         = '"                      + st.getNama_rw()   +
                        "', nama_desa       = '"                      + st.getDesa()      +
                        "', nama_kecamatan  = '"                      + st.getKecamatan() +
                        "', nama_kabupaten  = '"                      + st.getKabupaten() +
                        "', nama_provinsi   = '"                      + st.getProvinsi()  +
                        "'  where id_login   = '"                     + login             +   "'"
                        ; 
               
                statement.execute(query);
                System.out.println("Database berubah");
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vSetting;
    }
    
}
