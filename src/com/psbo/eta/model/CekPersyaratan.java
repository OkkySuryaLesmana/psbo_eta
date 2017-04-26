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
 */
public class CekPersyaratan {
    public Vector<ModelPersyaratan> executeSelect() throws SQLException{
            Vector<ModelPersyaratan> vModelPersyaratan;
            Connection conn = MyConnection.getConnection();
            try {
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery("Select * from tb_persyaratan");
                vModelPersyaratan = new Vector<>();
                while(rs.next()){
                    ModelPersyaratan mp = new ModelPersyaratan();
                    mp.setNo               (rs.getInt       ("no"));
                    mp.setId_persyaratan   (rs.getString    ("id_persyaratan"));
                    mp.setAkta_nikah       (rs.getString    ("akta_nikah"));
                    mp.setAkta_lahir       (rs.getString    ("akta_lahir"));
                    mp.setKtp              (rs.getString("ktp"));
                    mp.setPendidikan_terakhir(rs.getString("pendidikan_terakhir"));
                    mp.setStatus_persyaratan(rs.getString("status_persyaratan"));
                    vModelPersyaratan.add(mp);
                }
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vModelPersyaratan;
        }
    public Vector<ModelPersyaratan> executeCheck(ModelPersyaratan pr) throws SQLException{
        Connection conn = MyConnection.getConnection();
        Vector<ModelPersyaratan> vPersyartan;
        String pemohon= "pm-01";
        try{
            vPersyartan = new Vector<>();
            Statement statement = conn.createStatement();
            String query = "Insert into tb_persyaratan set no = '"              +pr.getNo()+
                            "', id_persyaratan = '"                             +pr.getId_persyaratan()+
                            "', akta_nikah = '"                                 +pr.getAkta_nikah()+
                            "', akta_lahir = '"                                 +pr.getAkta_lahir()+
                            "', ktp = '"                                        +pr.getKtp()+
                            "', pendidikan_terakhir = '"                        +pr.getPendidikan_terakhir()+
                            "', status_persyaratan = '"                         +pr.getStatus_persyaratan()+
                            "', id_pemohon = '"                                 +pemohon
                            +"'";
            statement.execute(query);
        }
        finally{
                if (conn != null) {
                conn.close();
            }
        }
        return vPersyartan;
    }
     public Vector<ModelPersyaratan> executeIdentifikasiPemohon() throws SQLException{
            String id_pemohon = "pm-01";
            Vector<ModelPersyaratan> vModelPersyaratan;
            Connection conn = MyConnection.getConnection();
            try {
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery("Select * from tb_persyaratan where id_pemohon = "+id_pemohon);
                vModelPersyaratan = new Vector<>();
                while(rs.next()){
                    ModelPersyaratan mp = new ModelPersyaratan();
                    mp.setNo               (rs.getInt       ("no"));
                    mp.setId_persyaratan   (rs.getString    ("id_persyaratan"));
                    mp.setAkta_nikah       (rs.getString    ("akta_nikah"));
                    mp.setAkta_lahir       (rs.getString    ("akta_lahir"));
                    mp.setKtp              (rs.getString    ("ktp"));
                    mp.setPendidikan_terakhir   (rs.getString("pendidikan_terakhir"));
                    mp.setStatus_persyaratan    (rs.getString("status_persyaratan"));
                    vModelPersyaratan.add(mp);
                }
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vModelPersyaratan;
        }
}
