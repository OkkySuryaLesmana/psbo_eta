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
public class Setting {
    private String id_setting;
    private String no_rt;
    private String no_rw;
    private String nama_rt;
    private String nama_rw;
    private String desa;
    private String kecamatan;
    private String kabupaten;
    private String provinsi;

    public Setting() {
    }

    public Setting(String id_setting, String no_rt, String no_rw, String nama_rt, String nama_rw, String desa, String kecamatan, String kabupaten, String provinsi) {
        this.id_setting = id_setting;
        this.no_rt = no_rt;
        this.no_rw = no_rw;
        this.nama_rt = nama_rt;
        this.nama_rw = nama_rw;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
    }

    public String getId_setting() {
        return id_setting;
    }

    public void setId_setting(String id_setting) {
        this.id_setting = id_setting;
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
