/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangungeometri;

/**
 *
 * @author elbo
 */
public interface BangunDatar {
    public static final double PI = Math.PI;
    public abstract double keliling();
    public abstract double luas();
}

class Lingkaran implements BangunDatar{
    private double d, r;

    public Lingkaran() {
    }

    public Lingkaran(double diameter) {
        d = diameter;
        r = diameter / 2;
    }
    
    @Override
    public double keliling() {
        return PI * Math.pow(r, 2);
    }
    
    public double keliling(double jarijari) {
        r = jarijari;
        return PI * Math.pow(r, 2);
    }

    @Override
    public double luas() {
        return PI * d;
    }
    
    public double luas(double diameter) {
        d = diameter;
        return PI * d;
    }
    
}

class Elips implements BangunDatar{
    private double a, b;

    public Elips() {
    }

    public Elips(double jarijari1, double jarijari2) {
        a = jarijari1;
        b = jarijari2;
    }
    
    @Override
    public double keliling() {
        return PI/2 * (a + b);
    }
    
    public double keliling(double jarijari1, double jarijari2) {
        a = jarijari1;
        b = jarijari2;
        return PI/2 * (a + b);
    }

    @Override
    public double luas() {
        return PI/4 * a * b;
    }
    
    public double luas(double jarijari1, double jarijari2) {
        a = jarijari1;
        b = jarijari2;
        return PI/4 * a * b;
    }
    
}

class SegitigaSamaSisi implements BangunDatar{
   /*
    Karena sama sisi maka panjang semua sisi sama dan panjang alas = panjang sisi
    */    
    private double s, t;

    public SegitigaSamaSisi() {
    }

   /*
    Mencari tinggi dengan pythagoras
    */
    public SegitigaSamaSisi(double sisi) {
        s = sisi;
        t = Math.sqrt(Math.pow(s, 2) + Math.pow(s/2, 2));
    }
       
    @Override
    public double keliling() {
        return s * 3;
    }
    
    public double keliling(double sisi) {
        s = sisi;
        return s * 3;
    }

    @Override
    public double luas() {
        return 0.5 * s * t;
    }
    
    public double luas(double sisi) {
        s = sisi;
        t = Math.sqrt(Math.pow(s, 2) + Math.pow(s/2, 2));
        return 0.5 * s * t;
    }
    
}

class SegitigaSamaKaki implements BangunDatar{
   /*
    Karena sama kaki maka kedua sisi kaki panjangnya sama sedangkan panjang alas berbeda
    */
    private double a, s, t;

    public SegitigaSamaKaki() {
    }

   /*
    Mencari panjang kaki dengan pythagoras
    */
    public SegitigaSamaKaki(double alas, double tinggi) {
        a = alas;
        t = tinggi;
        s = Math.sqrt(Math.pow(a/2, 2) + Math.pow(t, 2));
    }
    
    public double getSisi(){
        return s;
    }
    
    @Override
    public double keliling() {
        return a + (2 * s);
    }
    
    public double keliling(double alas, double sisi) {
        a = alas;
        s = sisi;
        return a + (2 * s);
    }

    @Override
    public double luas() {
        return 0.5 * a * t;
    }
    
    public double luas(double alas, double tinggi) {
        a = alas;
        t = tinggi;
        return 0.5 * a * t;
    }
    
}

class SegitigaSikuSiku implements BangunDatar{
    private double a, b, c, hasil;

    public SegitigaSikuSiku() {
    }

    public SegitigaSikuSiku(double sisiA, double sisiB, double sisiC) {
        a = sisiA;
        b = sisiB;
        c = sisiC;
    }
    
    @Override
    public double keliling() {
        return a + b + c;
    }
    
    public double keliling(double sisiA, double sisiB, double sisiC) {
        a = sisiA;
        b = sisiB;
        c = sisiC;
        return a + b + c;
    }

    @Override
    public double luas() {
        
        // jika C terpanjang maka siku siku berada diantara sisi A dan sisi B
        if (c>a && c>b){
            hasil = 0.5 * a * b;
        }
        // jika B terpanjang maka siku siku berada diantara sisi A dan sisi C
        else if (b>a && b>c){
            hasil = 0.5 * a * c;
        }
        // jika A terpanjang maka siku siku berada diantara sisi B dan sisi C
        else{
            hasil = 0.5 * b * c;
        }
        return hasil;
    }
    
    public double luas(double sisiA, double sisiB, double sisiC) {
        a = sisiA;
        b = sisiB;
        c = sisiC;
        
        // jika C terpanjang maka siku siku berada diantara sisi A dan sisi B
        if (c>a && c>b){
            hasil = 0.5 * a * b;
        }
        // jika B terpanjang maka siku siku berada diantara sisi A dan sisi C
        else if (b>a && b>c){
            hasil = 0.5 * a * c;
        }
        // jika A terpanjang maka siku siku berada diantara sisi B dan sisi C
        else{
            hasil = 0.5 * b * c;
        }
        return hasil;
    }
    
}

class Persegi implements BangunDatar{
    private double s;

    public Persegi() {
    }

    public Persegi(double sisi) {
        s = sisi;
    }

    @Override
    public double keliling() {
        return 4 * s;
    }
    
    public double keliling(double sisi) {
        s = sisi;
        return 4 * s;
    }

    @Override
    public double luas() {
        return s * s;
    }
    
    public double luas(double sisi) {
        s = sisi;
        return s * s;
    }
    
}

class PersegiPanjang implements BangunDatar{
    private double p, l;

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        p = panjang;
        l = lebar;
    }

    @Override
    public double keliling() {
        return (2 * p) + (2 * l);
    }
    
    public double keliling(double panjang, double lebar) {
        p = panjang;
        l = lebar;
        return (2 * p) + (2 * l);
    }

    @Override
    public double luas() {
        return p * l;
    }
    
    public double luas(double panjang, double lebar) {
        p = panjang;
        l = lebar;
        return p * l;
    }

}

class JajarGenjang implements BangunDatar{
    private double a, t, s;

    public JajarGenjang() {
    }

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        a = alas;
        t = tinggi;
        s = sisiMiring;
    }

    @Override
    public double keliling() {
        return (2 * a) + (2 * s);
    }
    
    public double keliling(double alas, double sisiMiring) {
        a = alas;
        s = sisiMiring;
        return (2 * a) + (2 * s);
    }
    
    @Override
    public double luas() {
        return a * t;
    }

    public double luas(double alas, double tinggi) {
        a = alas;
        t = tinggi;
        return a * t;
    }

}

class BelahKetupat implements BangunDatar{
    private double d1, d2, s;

    public BelahKetupat() {
    }

    public BelahKetupat(double diameter1, double diameter2, double sisi) {
        d1 = diameter1;
        d2 = diameter2;
        s = sisi;
    }

    @Override
    public double keliling() {
        return 4 * s;
    }
    
    public double keliling(double sisi) {
        s = sisi;
        return 4 * s;
    }

    @Override
    public double luas() {
        return 0.5 * d1 * d2;
    }
    
    public double luas(double diameter1, double diameter2) {
        d1 = diameter1;
        d2 = diameter2;
        return 0.5 * d1 * d2;
    }

}