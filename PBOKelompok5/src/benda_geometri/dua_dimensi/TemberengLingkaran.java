package benda_geometri.dua_dimensi;

// TemberengLingkaran tetap extends Lingkaran.
// Pastikan file Lingkaran.java sudah Anda perbaiki agar extends BentukDuaDimensi.
public class TemberengLingkaran extends Lingkaran {
    private double sudut; 

    public TemberengLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }

    @Override
    public double hitungLuas() {
        // Luas Tembereng = Luas Juring - Luas Segitiga
        double sudutRadian = Math.toRadians(this.sudut);
        double luasJuring = (this.sudut / 360.0) * super.hitungLuas();
        double luasSegitiga = 0.5 * super.getJariJari() * super.getJariJari() * Math.sin(sudutRadian);
        
        return luasJuring - luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        // Keliling Tembereng = Panjang Busur + Panjang Tali Busur
        double sudutRadian = Math.toRadians(this.sudut);
        double panjangBusur = (this.sudut / 360.0) * super.hitungKeliling();
        double taliBusur = 2 * super.getJariJari() * Math.sin(sudutRadian / 2);
        
        return panjangBusur + taliBusur;
    }
}