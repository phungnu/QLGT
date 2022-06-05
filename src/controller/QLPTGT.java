/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.OTo;
import model.PTGT;
import model.XeMay;

/**
 *
 * @author hp
 */
public class QLPTGT implements ChucNang {

    List<PTGT> list;
    Scanner sc = new Scanner(System.in);
    private Iterable<PTGT> PTGT;

    public QLPTGT() {
        list = new ArrayList<>();
        list.add((OTo) new OTo("150cc", 7, "AB123", "HuynDai", "Do", 2022, 160000));
        list.add((OTo) new OTo("150cc", 4, "AB134", "HonDa", "Den", 2021, 170000));
        list.add((OTo) new OTo("150cc", 20, "AB145", "ToYoTa", "Trang", 2020, 130000));
        list.add((XeMay) new XeMay(150, "DE123", "Suzuki", "Trang", 2022, 23000));
        list.add((XeMay) new XeMay(150, "DE134", "HonDa", "Vang", 2022, 25000));
    }

    public PTGT nhapPTGT() {
        PTGT p = new PTGT();
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap hang san xuat: ");
        String hang = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia ban: ");
        float gb = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap mau");
        String mau = sc.nextLine();
        p = new PTGT(ma, hang, mau, nam, gb);
        return p;
    }

    @Override
    public void nhapOTo() {
        PTGT p = nhapPTGT();
        System.out.println("Nhap kieu dong co: ");
        String dc = sc.nextLine();
        System.out.println("Nhap so cho Ngoi: ");
        int cn = Integer.parseInt(sc.nextLine());
        OTo ot = new OTo(dc, cn, p.getMa(), p.getHangSX(), p.getMau(), p.getNam(), p.getGiaBan());
        list.add(ot);
    }

    @Override
    public void nhapXeMay() {
        PTGT p = nhapPTGT();
        System.out.println("Nhap cong suat: ");
        float cs = Float.parseFloat(sc.nextLine());
        XeMay xm = new XeMay(cs, p.getMa(), p.getHangSX(), p.getMau(), p.getNam(), p.getGiaBan());
        list.add(xm);
    }

    @Override
    public void dSachPTGT() {
        System.out.println("Danh sach o to: ");
        for (PTGT i : list) {
            if (i instanceof OTo) {
                System.out.println(i.toString());
            }
        }
        System.out.println("Danh sach xe may: ");
        for (PTGT i : list) {
            if (i instanceof XeMay) {
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void suaPTGTTheoMa(String ma) {
        for (PTGT i : list) {
            if (i.getMa().equals(ma)) {
                System.out.println("Sua hang san xuat: ");
                String hang = sc.nextLine();
                System.out.println("Sua mau: ");
                String mau = sc.nextLine();
                System.out.println("Sua nam: ");
                int nam = Integer.parseInt(sc.nextLine());
                System.out.println("Sua gia ban: ");
                float gb = Float.parseFloat(sc.nextLine());
                i.setHangSX(hang);
                i.setMau(mau);
                i.setNam(nam);
                i.setGiaBan(gb);
                if (i instanceof OTo) {
                    System.out.println("Sua kieu dong co: ");
                    String dc = sc.nextLine();
                    System.out.println("Sua so cho ngoi: ");
                    int cn = Integer.parseInt(sc.nextLine());
                    ((OTo) i).setKieuDongCo(dc);
                    ((OTo) i).setChoNgoi(cn);
                } else if (i instanceof XeMay) {
                    System.out.println("Sua cong suat: ");
                    float cs = Float.parseFloat(sc.nextLine());
                    ((XeMay) i).setCongSuat(cs);
                }
            }
        }
    }

    private int getViTriTheoMa(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equals(ma)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void xoaPTGTTheoMa(String ma) {
        int viTri = getViTriTheoMa(ma);
        list.remove(viTri);
    }

    @Override
    public void soChoNgoiCuaOTo() {
        int sum = 0;
        for (PTGT i : list) {
            if (i instanceof OTo) {
                sum += ((OTo) i).getChoNgoi();
            }
        }
        System.out.println("Tong so cho ngoi: " + sum);
    }

    @Override
    public void sapXepOToTheoChoNgoi() {

        List<OTo> oT = new ArrayList<>();
        for (PTGT i : list) {
            if (i instanceof OTo) {
                oT.add((OTo) i);
            }
        }
        Collections.sort(oT, new Comparator<OTo>() {
            @Override
            public int compare(OTo o1, OTo o2) {
                return o1.getChoNgoi() - o2.getChoNgoi();
            }
        });

        System.out.println("Danh sach o to sap xep theo cho ngoi: ");
        for (OTo i : oT) {
            System.out.println(i.toString());
        }
    }

    @Override
    public void sapXepXeMayTheoTen() {
        List<XeMay> xm = new ArrayList<>();
        for (PTGT i : list) {
            if (i instanceof XeMay) {
                xm.add((XeMay) i);
            }
        }
        Collections.sort(xm, new Comparator<XeMay>() {
            @Override
            public int compare(XeMay x1, XeMay x2) {
                return x1.getHangSX().compareTo(x2.getHangSX());
            }
        });

        System.out.println("Danh sach xe may sap xep theo hang san xuat: ");
        for (XeMay i : xm) {
            System.out.println(i.toString());
        }
    }

}
