/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp
 */
public class PTGT {
    private String ma, hangSX, mau;
    private int nam;
    private float giaBan;

    public PTGT() {
    }

    public PTGT(String ma, String hangSX, String mau, int nam, float giaBan) {
        this.ma = ma;
        this.hangSX = hangSX;
        this.mau = mau;
        this.nam = nam;
        this.giaBan = giaBan;
    }

    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
