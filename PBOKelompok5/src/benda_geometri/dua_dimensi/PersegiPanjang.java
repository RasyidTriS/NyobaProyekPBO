package benda_geometri.dua_dimensi;

import benda_geometri.BentukDuaDimensi;

public class PersegiPanjang extends BentukDuaDimensi {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {   
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);   
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}