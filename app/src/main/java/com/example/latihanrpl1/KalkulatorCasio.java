package com.example.latihanrpl1;

public class KalkulatorCasio extends AbstactKalkulator {
    @Override
    public int penjumlahan(int angka1, int angka2) {
        int hasil = angka1+angka2;
        return hasil;
    }

    @Override
    public int pengurangan(int angka1, int angka2) {
        return 0;
    }

    @Override
    public int perkalian(int angka1, int angka2) {
        return 0;
    }

    @Override
    public int pembagian(double angka1, double angka2) {
        return 0;
    }
}
