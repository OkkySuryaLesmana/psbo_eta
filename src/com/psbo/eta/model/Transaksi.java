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
public class Transaksi {
    public Vector<Preview> executeSelect() throws SQLException{
            Vector<Preview> vPrev;
            Connection conn = MyConnection.getConnection();
            try {
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery("Select * from tb_preview");
                vPrev = new Vector<>();
                while(rs.next()){
                    Preview prev = new Preview();
                    prev.setNo               (rs.getInt     ("no"));
                    prev.setId               (rs.getString  ("id_preview"));
                    prev.setNama_pemohon     (rs.getString  ("nama_pemohon"));
                    prev.setPekerjaan        (rs.getString  ("pekerjaan"));
                    prev.setKewarganegaraan  (rs.getString  ("kewarganegaraan"));
                    prev.setDob              (rs.getString  ("dob"));
                    prev.setAlamat           (rs.getString  ("alamat"));
                    prev.setGender           (rs.getString  ("gender"));
                    prev.setAgama            (rs.getString  ("agama"));
                    prev.setNo_rt            (rs.getString  ("no_rt"));
                    prev.setNo_rw            (rs.getString  ("no_rw"));
                    prev.setNama_rt          (rs.getString  ("nama_rt"));
                    prev.setNama_rw          (rs.getString  ("nama_rw"));
                    prev.setDesa             (rs.getString  ("nama_desa"));
                    prev.setKecamatan        (rs.getString  ("nama_kecamatan"));
                    prev.setKabupaten        (rs.getString  ("nama_kabupaten"));
                    prev.setProvinsi         (rs.getString  ("nama_provinsi"));
                    vPrev.add(prev);
                    for (Preview preview : vPrev) {
                        System.out.println(preview.getNama_pemohon());
                    }
                }
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vPrev;
        }
    
    public Vector<Preview> executeInsertTransaksi(Preview prev) throws SQLException{
            Connection conn = MyConnection.getConnection();
            Vector<Preview> vPrev;
            try {
                vPrev = new Vector<>();
                Statement statement = conn.createStatement();
                System.out.println("Statement Berhasil di Create");
                String query = "insert into tb_preview set no = '"  + prev.getNo()                +
                        "', id_preview      = '"                    + prev.getId()                +
                        "', nama_pemohon    = '"                    + prev.getNama_pemohon()      +
                        "', pekerjaan       = '"                    + prev.getPekerjaan()         +
                        "', kewarganegaraan = '"                    + prev.getKewarganegaraan()   +
                        "', dob             = '"                    + prev.getDob()               +
                        "', alamat          = '"                    + prev.getAlamat()            +
                        "', gender          = '"                    + prev.getGender()            +
                        "', agama           = '"                    + prev.getAgama()             +
                        "', no_rt           = '"                    + prev.getNo_rt()             +
                        "', no_rw           = '"                    + prev.getNo_rw()             +
                        "', nama_rt         = '"                    + prev.getNama_rt()           +
                        "', nama_rw         = '"                    + prev.getNama_rw()           +
                        "', nama_desa       = '"                    + prev.getDesa()              +
                        "', nama_kecamatan  = '"                    + prev.getKecamatan()         +
                        "', nama_kabupaten  = '"                    + prev.getKabupaten()         +
                        "', nama_provinsi   = '"                    + prev.getProvinsi()          + "'"
                        ;
                statement.execute(query);
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vPrev;
        }
    public static Vector<Preview> executeTruncate() throws SQLException {
        Connection conn = MyConnection.getConnection();
        Statement statement = conn.createStatement();
        String query = "TRUNCATE TABLE `tb_preview`";
        statement.execute(query);
        
        System.out.println("Tabel berhasil dikosongkan");
        
        return null;
        
    }
}
