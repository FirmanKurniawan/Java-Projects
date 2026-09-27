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
public interface BangunRuang {
    public static final double PI = Math.PI;
    public abstract double volume();
    public abstract double luasSelimut();
    public abstract double panjangRusuk();
}

class PrismaSegiEmpat implements BangunRuang{
    private double p, l, t, s;
    PersegiPanjang segiEmpat = new PersegiPanjang();

    public PrismaSegiEmpat() {
    }

    public PrismaSegiEmpat(double panjang, double lebar, double tinggi) {
        p = panjang;
        l = lebar;
        t = tinggi;
    }

    @Override
    public double volume() {
        return segiEmpat.luas(p, l) * t;
    }
    
    public double volume(double panjang, double lebar, double tinggi) {
        p = panjang;
        l = lebar;
        t = tinggi;
        
        return segiEmpat.luas(p, l) * t;
    }

    @Override
    public double luasSelimut() {
        return 2 * (segiEmpat.luas(p, l) + segiEmpat.luas(l, t) + segiEmpat.luas(p, t));
    }
    
    public double luasSelimut(double panjang, double lebar, double tinggi) {
        p = panjang;
        l = lebar;
        t = tinggi;
        
        return 2 * (segiEmpat.luas(p, l) + segiEmpat.luas(l, t) + segiEmpat.luas(p, t));
    }

    @Override
    public double panjangRusuk() {
        return 2 * segiEmpat.keliling(p, l) + 4 * t;
    }
    
    public double panjangRusuk(double panjang, double lebar, double tinggi) {
        p = panjang;
        l = lebar;
        t = tinggi;
        
        return 2 * segiEmpat.keliling(p, l) + 4 * t;
    }

}

class PrismaSegitigaSisi implements BangunRuang{
    private double a, t;
    SegitigaSamaSisi segiTiga = new SegitigaSamaSisi();
    PersegiPanjang segiEmpat = new PersegiPanjang();

    public PrismaSegitigaSisi() {
    }

    public PrismaSegitigaSisi(double sisiAlas, double tinggi) {
        a = sisiAlas;
        t = tinggi;
    }

    @Override
    public double volume() {
        return segiTiga.luas(a) * t;
    }
    
    public double volume(double sisiAlas, double tinggi) {
        a = sisiAlas;
        t = tinggi;
        
        return segiTiga.luas(a) * t;
    }

    @Override
    public double luasSelimut() {
        return 2 * segiTiga.luas(a) + 3 * segiEmpat.luas(a, t);
    }
    
    public double luasSelimut(double sisiAlas, double tinggi) {
        a = sisiAlas;
        t = tinggi;
        
        return 2 * segiTiga.luas(a) + 3 * segiEmpat.luas(a, t);
    }

    @Override
    public double panjangRusuk() {
        return 2 * segiTiga.keliling(a) + 3 * t;
    }
    
    public double panjangRusuk(double sisiAlas, double tinggi) {
        a = sisiAlas;
        t = tinggi;
        
        return 2 * segiTiga.keliling(a) + 3 * t;
    }
        
}

class PrismaSegitigaKaki implements BangunRuang{
    private double a, t, at;
    SegitigaSamaKaki segiTiga = new SegitigaSamaKaki();
    PersegiPanjang segiEmpat = new PersegiPanjang();

    public PrismaSegitigaKaki() {
    }

    public PrismaSegitigaKaki(double sisiAlas, double tinggiAlas, double tinggi) {
        a = sisiAlas;
        at = tinggiAlas;
        t = tinggi;
    }

    @Override
    public double volume() {
        return segiTiga.luas(a, at) * t;
    }
    
    public double volume(double sisiAlas, double tinggiAlas) {
        a = sisiAlas;
        at = tinggiAlas;
        
        return segiTiga.luas(a, at) * t;
    }

    @Override
    public double luasSelimut() {
        return 2 * segiTiga.luas(a, at) + segiEmpat.luas(a, t) + 2 * segiEmpat.luas(segiTiga.getSisi(), t);
    }
    
    public double luasSelimut(double sisiAlas, double tinggiAlas, double tinggi) {
        a = sisiAlas;
        at = tinggiAlas;
        t = tinggi;
        
        return 2 * segiTiga.luas(a, at) + segiEmpat.luas(a, t) + 2 * segiEmpat.luas(segiTiga.getSisi(), t);
    }

    @Override
    public double panjangRusuk() {
        return 2 * segiTiga.keliling(a, at) + 3 * t;
    }
    
    public double panjangRusuk(double sisiAlas, double tinggiAlas, double tinggi) {
        a = sisiAlas;
        at = tinggiAlas;
        t = tinggi;
        
        return 2 * segiTiga.keliling(a, at) + 3 * t;
    }
        
}

class PrismaSegitigaSikuSiku implements BangunRuang{
    private double a1, a2, a3, t;
    SegitigaSikuSiku segiTiga = new SegitigaSikuSiku();
    PersegiPanjang segiEmpat = new PersegiPanjang();

    public PrismaSegitigaSikuSiku() {
    }

    public PrismaSegitigaSikuSiku(double sisiAlas1, double sisiAlas2, double sisiAlas3, double tinggi) {
        a1 = sisiAlas1;
        a2 = sisiAlas2;
        a3 = sisiAlas3;
        t = tinggi;
    }

    @Override
    public double volume() {
        return segiTiga.luas(a1, a2, a3) * t;
    }
    
    public double volume(double sisiAlas1, double sisiAlas2, double sisiAlas3) {
        a1 = sisiAlas1;
        a2 = sisiAlas2;
        a3 = sisiAlas3;
        
        return segiTiga.luas(a1, a2, a3) * t;
    }

    @Override
    public double luasSelimut() {
        return 2 * segiTiga.keliling(a1, a2, a3) + segiEmpat.luas(a1, t) + segiEmpat.luas(a2, t) + segiEmpat.luas(a3, t);
    }
    
    public double luasSelimut(double sisiAlas1, double sisiAlas2, double sisiAlas3, double tinggi) {
        a1 = sisiAlas1;
        a2 = sisiAlas2;
        a3 = sisiAlas3;
        t = tinggi;
        
        return 2 * segiTiga.keliling(a1, a2, a3) + segiEmpat.keliling(a1, t) + segiEmpat.luas(a2, t) + segiEmpat.luas(a3, t);
    }

    @Override
    public double panjangRusuk() {
        return 2 * segiTiga.keliling(a1, a2, a3) + 3 * t;
    }
    
    public double panjangRusuk(double sisiAlas1, double sisiAlas2, double sisiAlas3, double tinggi) {
        a1 = sisiAlas1;
        a2 = sisiAlas2;
        a3 = sisiAlas3;
        t = tinggi;
        
        return 2 * segiTiga.keliling(a1, a2, a3) + 3 * t;
    }
        
}

class Tabung implements BangunRuang{
    private double r, d, t;
    Lingkaran alas = new Lingkaran();

    public Tabung() {
    }

    public Tabung(double diameter, double tinggi) {
        d = diameter;
        r = diameter / 2;
        t = tinggi;
    }
            
    @Override
    public double volume() {
        return alas.luas(d) * t;
    }
    
    public double volume(double jarijari, double tinggi) {
        r = jarijari;
        t = tinggi;
        
        return alas.luas(d) * t;
    }

    @Override
    public double luasSelimut() {
        return (2 * alas.luas(d)) + (2 * alas.keliling(r) * t);
    }
    
    public double luasSelimut(double diameter) {
        d = diameter;
        r = diameter / 2;
        
        return (2 * alas.luas(d)) + (alas.keliling(r) * t);
    }

    @Override
    public double panjangRusuk() {
        return 2 * alas.keliling(r);
    }
    
    public double panjangRusuk(double  jarijari) {
        r = jarijari;
        
        return 2 * alas.keliling(r);
    }
    
}

class LimasSegitiga implements BangunRuang{
    private double a, t;
    PrismaSegitigaSisi prisma = new PrismaSegitigaSisi();
    SegitigaSamaSisi segiTiga = new SegitigaSamaSisi();

    public LimasSegitiga() {
    }

    public LimasSegitiga(double sisiAlas, double tinggi) {
        a = sisiAlas;
        t = tinggi;
    }

    @Override
    public double volume() {
        return 0.33 * prisma.volume(a, t);
    }

    @Override
    public double luasSelimut() {
        return 4 * segiTiga.luas(a);
    }

    @Override
    public double panjangRusuk() {
        return 4 * segiTiga.keliling(a);
    }
}

class LimasSegiEmpat implements BangunRuang{
    private double a, b, t;
    PrismaSegiEmpat prisma = new PrismaSegiEmpat();
    PersegiPanjang segiEmpat = new PersegiPanjang();

    public LimasSegiEmpat() {
    }

    public LimasSegiEmpat(double panjangAlas, double lebarAlas, double tinggi) {
        a = panjangAlas;
        b = lebarAlas;
        t = tinggi;
    }

    @Override
    public double volume() {
        return 0.33 * prisma.volume(a, b, t);
    }

    @Override
    public double luasSelimut() {
        return 4 * segiEmpat.luas(a, b);
    }

    @Override
    public double panjangRusuk() {
        return 4 * segiEmpat.keliling(a, b);
    }
}

class Kerucut implements BangunRuang{
    private double r, d, t, s;
    Lingkaran alas = new Lingkaran();
    Tabung tabung = new Tabung();

    public Kerucut() {
    }

    public Kerucut(double diameter, double tinggi) {
        d = diameter;
        r = diameter / 2;
        t = tinggi;
        s = Math.sqrt(Math.pow(r/2, 2) + Math.pow(t, 2));
    }

    @Override
    public double volume() {
        return 0.33 * tabung.volume(r, t);
    }

    @Override
    public double luasSelimut() {
        return PI * r * s;
    }

    @Override
    public double panjangRusuk() {
        return alas.keliling(r);
    }
}

class Bola implements BangunRuang{
    private double d, r;
    Lingkaran lingkaran = new Lingkaran();

    public Bola() {
    }

    public Bola(double diameter) {
        d = diameter;
        r = diameter / 2;
    }

    @Override
    public double volume() {
        return 1.33 * lingkaran.keliling(r) * PI;
    }

    @Override
    public double luasSelimut() {
        return 4 * lingkaran.keliling(r);
    }

    @Override
    public double panjangRusuk() {
        return 0;
    }
    
}