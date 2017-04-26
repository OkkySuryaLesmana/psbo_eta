/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.model;

/**
 *
 * @author Multiverse
 * Develop by E.T.A
 */
public class Pemohon {
    
    private int     no;
    private String  id;
    private String  nama_pemohon;
    private String  pekerjaan;
    private String  kewarganegaraan;
    private String  dob;
    private String  alamat;
    private String  gender;
    private String  agama;

    public Pemohon() {
    }

    public Pemohon(String id) {
        this.id = id;
    }

    public Pemohon(int no, String id, String nama_pemohon, String pekerjaan, String kewarganegaraan, String dob, String alamat, String gender, String agama) {
        this.no = no;
        this.id = id;
        this.nama_pemohon = nama_pemohon;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.dob = dob;
        this.alamat = alamat;
        this.gender = gender;
        this.agama = agama;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama_pemohon() {
        return nama_pemohon;
    }

    public void setNama_pemohon(String nama_pemohon) {
        this.nama_pemohon = nama_pemohon;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
    
    
    
}
