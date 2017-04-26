/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.controller;

import javax.swing.JLabel;

/**
 *
 * @author Multiverse
 * Develop by E.T.A
 */
public class ColumnPemohon {
    
    private final String name;
    private final int width;
    private final int aligment;
    
    public static final ColumnPemohon[] COLUMN_SETTING = {
        new ColumnPemohon("No", 28, JLabel.CENTER),
        new ColumnPemohon("ID", 70, JLabel.CENTER),
        new ColumnPemohon("Nama Pemohon", 200, JLabel.LEFT),
        new ColumnPemohon("Pekerjaan", 150, JLabel.CENTER),
        new ColumnPemohon("kewarganegaraan", 150, JLabel.CENTER),
        new ColumnPemohon("Tempat, Tanggal Lahir", 200, JLabel.LEFT),
        new ColumnPemohon("Alamat", 300, JLabel.LEFT),
        new ColumnPemohon("Jenis Kelamin", 130, JLabel.CENTER),
        new ColumnPemohon("Agama", 80, JLabel.CENTER)
        
    };

    public ColumnPemohon(String name, int width, int aligment) {
        this.name = name;
        this.width = width;
        this.aligment = aligment;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getAligment() {
        return aligment;
    }
    
    
}
