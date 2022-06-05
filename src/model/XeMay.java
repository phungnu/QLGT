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
public class XeMay extends PTGT{
    private float congSuat;

    public XeMay() {
    }

    public XeMay(float congSuat, String ma, String hangSX, String mau, int nam, float giaBan) {
        super(ma, hangSX, mau, nam, giaBan);
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public String toString() {
        return getMa()+" "+getHangSX()+" "+getMau()+" "+getNam()+" "+getCongSuat()+" "+getGiaBan();
    }
}
