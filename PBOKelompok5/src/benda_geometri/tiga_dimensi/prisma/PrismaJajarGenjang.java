package benda_geometri.tiga_dimensi.prisma;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.JajarGenjang;

public class PrismaJajarGenjang extends BentukTigaDimensi {

    private JajarGenjang alas;
    private double tinggiPrisma;

    public PrismaJajarGenjang(double alasJajarGenjang, double tinggiAlas, double sisiA, double sisiB, double tinggiPrisma) {
        this.alas = new JajarGenjang(alasJajarGenjang, tinggiAlas, sisiA, sisiB);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Prisma = Luas Alas * Tinggi
        return this.alas.hitungLuas() * this.tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Prisma = (2 * Luas Alas) + (Keliling Alas * Tinggi)
        double luasAlas = this.alas.hitungLuas();
        double kelilingAlas = this.alas.hitungKeliling();
        return (2 * luasAlas) + (kelilingAlas * this.tinggiPrisma);
    }
}