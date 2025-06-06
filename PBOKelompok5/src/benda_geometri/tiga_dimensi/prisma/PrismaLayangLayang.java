package benda_geometri.tiga_dimensi.prisma;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.LayangLayang;

public class PrismaLayangLayang extends BentukTigaDimensi {

    private LayangLayang alas;
    private double tinggi;

    public PrismaLayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang, double tinggi) {
        this.alas = new LayangLayang(diagonal1, diagonal2, sisiPendek, sisiPanjang);
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