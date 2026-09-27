package pbo_m04_5210411082;

import java.util.Scanner;

public class SOAL01_PBO_M04_5210411082 {

    public static void main(String[] args) {
        int[] arrInt = new int[]{55,31,92,36,73};
        do {
            System.out.println("==== PILIHAN MENU ARRAY ====");
            System.out.println("1. Tampil data di dalam Array ");
            System.out.println("2. Memangkatkan setiap nilai di dalam array dengan suatu bilangan  ");
            System.out.println("3. Mencari 2 bilangan di dalam array ");
            System.out.println("4. Keluar Program ");
            Scanner sc = new Scanner(System.in);
            int menu;
            System.out.println("Masukan Pilihan Menu : ");
            menu = sc.nextInt();
        
            switch (menu){
            case 1:
                System.out.println("Bilangan di dalam Array : ");
                for (int i=0;i<arrInt.length;i++){
                    System.out.println(arrInt[i]);
                }        
                break;
            case 2:
                int pangkat, hasilpangkat;
                System.out.println("Masukan Pangkat : ");
                pangkat = sc.nextInt();
                for (int i=0;i<arrInt.length;i++){
                    hasilpangkat = (int) Math.pow(arrInt[i], pangkat);
                    System.out.println("Hasil Pangkat Indeks ke-" + i + " : " + hasilpangkat);
                }
                break;
            case 3:
                int cari1,cari2,z;
                boolean found = false;
                System.out.print("Input Data 1 yang ingin dicari: ");
                cari1 = sc.nextInt();
                System.out.println("Input Data 2 yang ingin dicari: ");
                cari2 = sc.nextInt();
        
                for(int index=0; index<arrInt.length; index++){
                    if(arrInt[index] == cari1){
                        found = true;
                        z=index;
                        System.out.println("Data 1 yang Anda cari ditemukan di dalam Array dan berada pada indeks ke-"+ z);
                        break;
                    }
                    else if(found == false){
                        System.out.println("Data 1 yang Anda cari TIDAK ditemukan di dalam Array");
                        break;
                    }
                }
                for(int index=0; index<arrInt.length; index++) {
                    if(arrInt[index] == cari2){
                        found = true;
                        z = index;
                        System.out.println("Data 2 yang Anda cari ditemukan di dalam Array dan berada pada indeks ke-" + z);
                        break;
                    }
                    else if(found == false){
                        System.out.println("Data 2 yang Anda cari TIDAK ditemukan di dalam Array");
                    }
                }
                break;      
            case 4:
                System.out.println("Sampai Jumpa Lagi… :-)");
                System.exit(0);
                    
            default:
                System.out.println("Menu Tidak Ada");
            }
        } while (true);
    }
    
}
