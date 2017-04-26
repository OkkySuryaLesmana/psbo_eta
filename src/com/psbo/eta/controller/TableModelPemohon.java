/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.controller;

import com.psbo.eta.model.CRUD;
import com.psbo.eta.model.MyConnection;
import com.psbo.eta.model.Pemohon;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Multiverse
 * Develop by E.T.A
 */
public class TableModelPemohon extends AbstractTableModel{
    CRUD mycon;
    Connection conn = MyConnection.getConnection();
    private Vector<Pemohon> vPmn = null;

    public TableModelPemohon() throws SQLException {
        mycon = new CRUD();
        vPmn =  mycon.executeSelect();
    }
    
    public Vector<Pemohon> getListPemohon(){
        return vPmn;
    }
    
    public void setListPemohon(Vector<Pemohon> vPmn){
        this.vPmn = vPmn;
    }
    
    public int getRowCount() {
        return vPmn.size();
    }

    public int getColumnCount() {
        return ColumnPemohon.COLUMN_SETTING.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Pemohon pmn = vPmn.elementAt(rowIndex);
        switch(columnIndex){
            case 0 :
                return pmn.getNo();
            case 1 :
                return pmn.getId();
            case 2 :
                return pmn.getNama_pemohon();
            case 3 :
                return pmn.getPekerjaan();
            case 4 :
                return pmn.getKewarganegaraan();
            case 5 :
                return pmn.getDob();
            case 6 :
                return pmn.getAlamat();
            case 7 :
                return pmn.getGender();
            case 8 :
                return pmn.getAgama();
            default :
                return null;
        }
    }
    public String getColumnName(int column){
        return ColumnPemohon.COLUMN_SETTING[column].getName();
    }
}
