package benda_geometri;

/**
 * Level 2: Abstract class untuk semua bangun dua dimensi.
 * Kelas ini menyediakan dasar untuk semua bentuk 2D seperti Persegi, Lingkaran, dll.
 */
public abstract class BentukDuaDimensi implements Geometris {

    // Metode abstrak khusus untuk bangun 2D yang harus diimplementasikan oleh turunan.
    
    /**
     * Menghitung dan mengembalikan luas dari bangun datar.
     * @return luas dalam satuan kuadrat.
     */
    public abstract double calculateArea();
    
    /**
     * Menghitung dan mengembalikan keliling dari bangun datar.
     * @return keliling dalam satuan.
     */
    public abstract double calculatePerimeter();

    /**
     * Implementasi default untuk menampilkan informasi.
     * Kelas turunan bisa meng-override ini untuk menambahkan detail lebih spesifik.
     */
    @Override
    public void displayInfo() {
        System.out.println("Luas: " + calculateArea());
        System.out.println("Keliling: " + calculatePerimeter());
    }
}