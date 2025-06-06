package benda_geometri;

/**
 * Level 2: Abstract class untuk semua bangun tiga dimensi.
 * Kelas ini menyediakan dasar untuk semua bentuk 3D seperti Kubus, Bola, dll.
 */
public abstract class BentukTigaDimensi implements Geometris {

    // Metode abstrak khusus untuk bangun 3D yang harus diimplementasikan oleh turunan.

    /**
     * Menghitung dan mengembalikan volume dari bangun ruang.
     * @return volume dalam satuan kubik.
     */
    public abstract double calculateVolume();
    
    /**
     * Menghitung dan mengembalikan luas permukaan dari bangun ruang.
     * @return luas permukaan dalam satuan kuadrat.
     */
    public abstract double calculateSurfaceArea();

    /**
     * Implementasi default untuk menampilkan informasi.
     * Kelas turunan bisa meng-override ini untuk menambahkan detail lebih spesifik.
     */
    @Override
    public void displayInfo() {
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Luas Permukaan: " + calculateSurfaceArea());
    }
}