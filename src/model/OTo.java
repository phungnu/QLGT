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
public class OTo extends PTGT{
    private String kieuDongCo;
    private int choNgoi;

    public OTo() {
    }

    public OTo(String kieuDongCo, int choNgoi, String ma, String hangSX, String mau, int nam, float giaBan) {
        super(ma, hangSX, mau, nam, giaBan);
        this.kieuDongCo = kieuDongCo;
        this.choNgoi = choNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    @Override
    public String toString() {
        return getMa()+" "+getHangSX()+" "+getMau()+" "+getNam()+" "+getKieuDongCo()+" "+getChoNgoi()+" "+getGiaBan();
    }

    
}
