/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.model;

/**
 *
 * @author Andjey
 * Develop by E.T.A
 */
public class Preview {
    private int no;
    private String id;
    private String nama_pemohon;
    private String pekerjaan;
    private String kewarganegaraan;
    private String dob;
    private String alamat;
    private String gender;
    private String agama;
    private String no_rt;
    private String no_rw;
    private String nama_rt;
    private String nama_rw;
    private String desa;
    private String kecamatan;
    private String kabupaten;
    private String provinsi;

    public Preview() {
    }

    public Preview(int no, String id, String nama_pemohon, String pekerjaan, String kewarganegaraan, String dob, String alamat, String gender, String agama, String no_rt, String no_rw, String nama_rt, String nama_rw, String desa, String kecamatan, String kabupaten, String provinsi) {
        this.no = no;
        this.id = id;
        this.nama_pemohon = nama_pemohon;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.dob = dob;
        this.alamat = alamat;
        this.gender = gender;
        this.agama = agama;
        this.no_rt = no_rt;
        this.no_rw = no_rw;
        this.nama_rt = nama_rt;
        this.nama_rw = nama_rw;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
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

    public String getNo_rt() {
        return no_rt;
    }

    public void setNo_rt(String no_rt) {
        this.no_rt = no_rt;
    }

    public String getNo_rw() {
        return no_rw;
    }

    public void setNo_rw(String no_rw) {
        this.no_rw = no_rw;
    }

    public String getNama_rt() {
        return nama_rt;
    }

    public void setNama_rt(String nama_rt) {
        this.nama_rt = nama_rt;
    }

    public String getNama_rw() {
        return nama_rw;
    }

    public void setNama_rw(String nama_rw) {
        this.nama_rw = nama_rw;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

   
}
