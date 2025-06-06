package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;

// JuringBola adalah BentukTigaDimensi, jadi seharusnya extends BentukTigaDimensi
public class JuringBola extends BentukTigaDimensi {
    private double jariJari;
    private double sudutDerajat;
    private final double PI = 3.14;

    public JuringBola(double jariJari, double sudutDerajat) {
        this.jariJari = jariJari;
        this.sudutDerajat = sudutDerajat;
    }

    @Override
    public double hitungVolume() {
        // Menggunakan logika asli dari kode Anda: Volume Penuh Bola * (sudut/360)
        double volumeBolaPenuh = (4.0 / 3.0) * this.PI * Math.pow(this.jariJari, 3);
        return (this.sudutDerajat / 360.0) * volumeBolaPenuh;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Menggunakan logika asli dari kode Anda: Luas Penuh Bola * (sudut/360)
        // Catatan: Ini adalah penyederhanaan. Rumus luas permukaan juring bola sesungguhnya lebih kompleks.
        double luasBolaPenuh = 4 * this.PI * Math.pow(this.jariJari, 2);
        return (this.sudutDerajat / 360.0) * luasBolaPenuh;
    }

    public double getJariJari() {
        return this.jariJari;
    }

    public double getSudutDerajat() {
        return this.sudutDerajat;
    }
}