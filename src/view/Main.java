/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.QLPTGT;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        QLPTGT s = new QLPTGT();
        while(true){
            System.out.println("1 Nhap o to");
            System.out.println("2 Nhap xe may");
            System.out.println("3 In ds PTGT");
            System.out.println("4 Sua PTGT theo ma");
            System.out.println("5 Xoa PTGT theo ma");
            System.out.println("6 Tinh tong so cho ngoi cua o to");
            System.out.println("7 Sap xep o to theo cho ngoi va in ds sap xep cua o to theo cho ngoi");
            System.out.println("8 Sap xep xe may theo hang san xuat va in ds sap xep cua xe may theo hang san xuat");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap n: ");
            int n = Integer.parseInt(sc.nextLine());
            switch(n){
                case 1:
                    s.nhapOTo();
                    break;
                case 2:
                    s.nhapXeMay();
                    break;
                case 3:
                    s.dSachPTGT();
                    break;
                case 4:
                    System.out.println("Nhap ma de sua: ");
                    String maSua = sc.nextLine();
                    s.suaPTGTTheoMa(maSua);
                    break;
                case 5:
                    System.out.println("Nhap ma de xoa: ");
                    String maXoa = sc.nextLine();
                    s.xoaPTGTTheoMa(maXoa);
                    break;
                case 6:
                    s.soChoNgoiCuaOTo();
                    break;
                case 7:
                    s.sapXepOToTheoChoNgoi();
                    break;
                case 8:
                    s.sapXepXeMayTheoTen();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
