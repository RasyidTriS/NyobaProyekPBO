package benda_geometri.tiga_dimensi.prisma;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.Segitiga;

public class PrismaSegitiga extends BentukTigaDimensi {

    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(double alasSegitiga, double tinggiAlas, double tinggiPrisma) {
        this.alas = new Segitiga(alasSegitiga, tinggiAlas);
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