package benda_geometri.tiga_dimensi.prisma;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.BelahKetupat;

public class PrismaBelahKetupat extends BentukTigaDimensi {

    private BelahKetupat alas;
    private double tinggi;

    public PrismaBelahKetupat(double diagonal1, double diagonal2, double sisi, double tinggi) {
        this.alas = new BelahKetupat(diagonal1, diagonal2, sisi);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Prisma = Luas Alas * Tinggi
        return this.alas.hitungLuas() * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Prisma = (2 * Luas Alas) + (Keliling Alas * Tinggi)
        double luasAlas = this.alas.hitungLuas();
        double kelilingAlas = this.alas.hitungKeliling();
        return (2 * luasAlas) + (kelilingAlas * this.tinggi);
    }
}