 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.model;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Multiverse
 * Develop by E.T.A
 */
public class CRUD {
    
    public Vector<Pemohon> executeSelect() throws SQLException{
            Vector<Pemohon> vPmn;
            Connection conn = MyConnection.getConnection();
            try {
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery("Select * from tb_pemohon order by no asc");
                vPmn = new Vector<>();
                while(rs.next()){
                    Pemohon pmn = new Pemohon();
                    pmn.setNo               (rs.getInt      ("no"));
                    pmn.setId               (rs.getString   ("id"));
                    pmn.setNama_pemohon     (rs.getString   ("nama_pemohon"));
                    pmn.setPekerjaan        (rs.getString   ("pekerjaan"));
                    pmn.setKewarganegaraan  (rs.getString   ("kewarganegaraan"));
                    pmn.setDob              (rs.getString   ("dob"));
                    pmn.setAlamat           (rs.getString   ("alamat"));
                    pmn.setGender           (rs.getString   ("gender"));
                    pmn.setAgama            (rs.getString   ("agama"));
                    vPmn.add(pmn);
                }
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vPmn;
        }
    
    public Vector<Pemohon> executeInsertPemohon(Pemohon pmn) throws SQLException{
            Connection conn = MyConnection.getConnection();
            Vector<Pemohon> vPmn;
            String id_login = "rt-01";
            try {
                vPmn = new Vector<>();
                Statement statement = conn.createStatement();
                System.out.println("Statement Berhasil di Create");
                String query = "insert into tb_pemohon set no = '"  + pmn.getNo()               + 
                        "', id              = '"                    + pmn.getId()               +
                        "', nama_pemohon    = '"                    + pmn.getNama_pemohon()     +
                        "', pekerjaan       = '"                    + pmn.getPekerjaan()        +
                        "', kewarganegaraan = '"                    + pmn.getKewarganegaraan()  +
                        "', dob             = '"                    + pmn.getDob()              +
                        "', alamat          = '"                    + pmn.getAlamat()           +
                        "', gender          = '"                    + pmn.getGender()           +
                        "', agama           = '"                    + pmn.getAgama()            +
                        "', id_login        = '"                    + id_login                  +
                        "'";
                statement.execute(query);
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vPmn;
        }
    public Vector<Pemohon> executeUpdatePemohon(Pemohon pmn) throws SQLException{
        Connection conn = MyConnection.getConnection();
        Vector<Pemohon> vPmn;
        try{
            vPmn = new Vector<>();
            Statement statement = conn.createStatement();
            System.out.println("statement berhasil di create");
            String query = "Update tb_pemohon set nama_pemohon = '" + pmn.getNama_pemohon()     +
                            "', pekerjaan       = '"                + pmn.getPekerjaan()        +
                            "', kewarganegaraan = '"                + pmn.getKewarganegaraan()  +
                            "', dob             = '"                + pmn.getDob()              +
                            "', alamat          = '"                + pmn.getAlamat()           +
                            "', gender          = '"                + pmn.getGender()           +
                            "', agama           = '"                + pmn.getAgama()            +
                            "' where id         = '"                + pmn.getId()               + "'";
            statement.execute(query);
        }finally{
            if (conn != null) {
                conn.close();
            }
        }
        return vPmn;
    }
    public Vector<Pemohon> executeDeletePemohon(Pemohon pmn) throws SQLException{
        Connection conn = MyConnection.getConnection();
        Vector<Pemohon> vPmn;
        try{
            vPmn = new Vector<>();
            Statement statement = conn.createStatement();
            System.out.println("statement berhasil di create");
            String query = "Delete from tb_pemohon where id = '" + pmn.getId() + "'";
            statement.execute(query);
        }finally{
            if (conn != null) {
                conn.close();
            }
        }
        return vPmn;
    }
    public Vector<Pemohon> executeResetTable() throws SQLException{
        Connection conn = MyConnection.getConnection();
        Vector<Pemohon> vPmn;
        try{
            vPmn = new Vector<>();
            Statement statement = conn.createStatement();
            System.out.println("statement berhasil di create");
            String query = "truncate table tb_pemohon";
            statement.execute(query);
        }finally{
            if (conn != null) {
                conn.close();
            }
        }
        return vPmn;
    }
    public Vector<Pemohon> searchingDataPemohon(String a) throws SQLException{
        Vector<Pemohon> vPmn;
            Connection conn = MyConnection.getConnection();
            try {
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery("Select * from tb_pemohon where nama_pemohon like '%"+a+"%' order by no asc");
                vPmn = new Vector<>();
                while(rs.next()){
                    Pemohon pmn = new Pemohon();
                    pmn.setNo               (rs.getInt      ("no"));
                    pmn.setId               (rs.getString   ("id"));
                    pmn.setNama_pemohon     (rs.getString   ("nama_pemohon"));
                    pmn.setPekerjaan        (rs.getString   ("pekerjaan"));
                    pmn.setKewarganegaraan  (rs.getString   ("kewarganegaraan"));
                    pmn.setDob              (rs.getString   ("dob"));
                    pmn.setAlamat           (rs.getString   ("alamat"));
                    pmn.setGender           (rs.getString   ("gender"));
                    pmn.setAgama            (rs.getString   ("agama"));
                    vPmn.add(pmn);
                }
            } finally{
                if (conn != null) {
                    conn.close();
                }
            }
            return vPmn;
    }
}
