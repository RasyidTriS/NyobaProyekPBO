package benda_geometri.dua_dimensi;

import benda_geometri.BentukDuaDimensi;

public class LayangLayang extends BentukDuaDimensi {

    private double diagonal1;
    private double diagonal2;
    private double sisiPendek;
    private double sisiPanjang;


    public LayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * this.diagonal1 * this.diagonal2;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.sisiPendek + this.sisiPanjang);
    }

    public double getSisiPendek(){
        return sisiPendek;
    }

    public double getSisiPanjang(){
        return sisiPanjang;
    }
}