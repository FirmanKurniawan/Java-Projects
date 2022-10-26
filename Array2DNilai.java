import java.util.Scanner;

public class Array2DNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initisial array dan variabel
        String nama[][];
        short nilaiTeori[][], nilaiPraktikum[][];
        float rataRata[], jumlah[];

        System.out.print("Jumlah Data      : ");
        short jumlahData = input.nextShort();

        nama = new String[jumlahData][3];
        nilaiTeori = new short[jumlahData][3];
        nilaiPraktikum = new short[jumlahData][3];
        rataRata = new float[jumlahData];
        jumlah = new float[jumlahData];

        System.out.println();

        //Input Nilai
        for (int a = 0; a < jumlahData; a++) {
            // Input matakuliah
            System.out.print("Matakuliah      : ");
            nama[a][0] = input.next();

            // Input nilai teori  
            System.out.print("Nilai Teori     : ");
            nilaiTeori[a][1] = input.nextShort();

            // Input Nilai Praktikum
            System.out.print("Nilai Praktikum : ");
            nilaiPraktikum[a][2] = input.nextShort();

            //Hitung Jumlah Nilai
            jumlah[a] = nilaiTeori[a][1] + nilaiPraktikum[a][2];
            
            //Hitung rata-rata nilai
            rataRata[a] = jumlah[a] / 2;
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Matakuliah\t Nilai Teori\t Nilai Praktek\t Nilai Rata-Rata\t");
        System.out.println("------------------------------------------------------------");

        for (int a = 0; a < jumlahData; a++) {
            System.out.print(nama[a][0] + "\t\t   " + nilaiTeori[a][1] + "\t\t   " + nilaiPraktikum[a][2] + "\t\t   " + rataRata[a]);
            System.out.println();
        }
    }
}
