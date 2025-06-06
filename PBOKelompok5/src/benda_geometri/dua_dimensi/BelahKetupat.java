package benda_geometri.dua_dimensi;

import benda_geometri.BentukDuaDimensi; // Perubahan 1: Import yang benar

public class BelahKetupat extends BentukDuaDimensi { // Perubahan 1: Pewarisan yang benar
    protected double sisi;
    protected double diagonal1;
    protected double diagonal2;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        this.sisi = sisi;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        // Perubahan 3: Panggilan metode di constructor dihapus
    }

    @Override
    public double hitungKeliling() {
        return 4 * this.sisi; // Perubahan 2 & 3: Rumus benar dan disederhanakan
    }

    @Override
    public double hitungLuas() {
        return (this.diagonal1 * this.diagonal2) / 2; // Perubahan 3: Kode disederhanakan
    }

    public double getSisi() {
        return sisi;
    }
    
    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }
}