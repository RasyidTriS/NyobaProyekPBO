// File: PBOKelompok5/src/benda_geometri/dua_dimensi/Persegi.java
package benda_geometri.dua_dimensi;

import benda_geometri.BentukDuaDimensi; // Jangan lupa import

public class Persegi extends BentukDuaDimensi { // 1. Ubah ini
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
        // Panggilan ini sekarang tidak diperlukan karena tidak ada properti luas/keliling di induk
    }
 
    @Override // 2. Tambahkan ini
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override // 2. Tambahkan ini
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double getSisi() {
        return sisi;
    }
}