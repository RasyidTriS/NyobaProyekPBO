package benda_geometri.tiga_dimensi.prisma;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.Trapesium;

public class PrismaTrapesium extends BentukTigaDimensi {

    private Trapesium alas;
    private double tinggiPrisma;

    public PrismaTrapesium(double alasAtas, double alasBawah, double sisiMiring, double tinggiAlas, double tinggiPrisma) {
        this.alas = new Trapesium(alasAtas, alasBawah, sisiMiring, tinggiAlas);
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