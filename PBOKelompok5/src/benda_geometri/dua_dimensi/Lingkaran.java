package benda_geometri.dua_dimensi;

import benda_geometri.BentukDuaDimensi;

public class Lingkaran extends BentukDuaDimensi {
    private double jariJari;
    protected final double PI = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return this.PI * this.jariJari * this.jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * this.PI * this.jariJari;
    }
    
    public double hitungLuas(double jariJariBaru) {
        return this.PI * jariJariBaru * jariJariBaru;
    }

    public double hitungKeliling(double jariJariBaru) {
        return 2 * this.PI * jariJariBaru;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getPI(){
        return PI; 
    }
    
}