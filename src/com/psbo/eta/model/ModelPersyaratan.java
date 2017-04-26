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
public class ModelPersyaratan {
    private int no;
    private String id_persyaratan;
    private String akta_nikah;
    private String akta_lahir;
    private String ktp;
    private String pendidikan_terakhir;
    private String status_persyaratan;

    public ModelPersyaratan() {
    }

    public ModelPersyaratan(int no, String id_persyaratan, String akta_nikah, String akta_lahir, String ktp, String pendidikan_terakhir, String status_persyaratan) {
        this.no = no;
        this.id_persyaratan = id_persyaratan;
        this.akta_nikah = akta_nikah;
        this.akta_lahir = akta_lahir;
        this.ktp = ktp;
        this.pendidikan_terakhir = pendidikan_terakhir;
        this.status_persyaratan = status_persyaratan;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId_persyaratan() {
        return id_persyaratan;
    }

    public void setId_persyaratan(String id_persyaratan) {
        this.id_persyaratan = id_persyaratan;
    }

    public String getAkta_nikah() {
        return akta_nikah;
    }

    public void setAkta_nikah(String akta_nikah) {
        this.akta_nikah = akta_nikah;
    }

    public String getAkta_lahir() {
        return akta_lahir;
    }

    public void setAkta_lahir(String akta_lahir) {
        this.akta_lahir = akta_lahir;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getPendidikan_terakhir() {
        return pendidikan_terakhir;
    }

    public void setPendidikan_terakhir(String pendidikan_terakhir) {
        this.pendidikan_terakhir = pendidikan_terakhir;
    }

    public String getStatus_persyaratan() {
        return status_persyaratan;
    }

    public void setStatus_persyaratan(String status_persyaratan) {
        this.status_persyaratan = status_persyaratan;
    }

    
}
