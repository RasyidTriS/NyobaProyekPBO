// File: PBOKelompok5/src/benda_geometri/BentukTigaDimensi.java
package benda_geometri;

public abstract class BentukTigaDimensi implements Geometris {

    // Metode abstrak yang HARUS diimplementasikan oleh kelas anak
    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();

    /**
     * Implementasi default untuk menampilkan informasi.
     * Kelas turunan bisa meng-override ini untuk menambahkan detail lebih spesifik.
     */
    @Override
    public void displayInfo() {
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}