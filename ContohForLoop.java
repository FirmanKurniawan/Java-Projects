public class ForLoop {
    // looping adalah perulangan yang mengulangi
    // suatu kode sebanyak kali yang ditentukan
    // contoh:
    // for(statement_pertama; statement_kedua; statement_ketiga){
    //     kode_yang_mau_diulangi;
    // }

    // statement_pertama akan menginilialisasi nilai awal variabel
    // statement_kedua akan mengecek kondisi apakah masih bisa diulangi
    // statement_ketiga akan menambahkan nilai variabel

    public static void main(String[] args) {
        // looping dari angka 0 - 9

        // programmer biasanya pakai variabel
        // i,j,k

        for (int i = 0; i < 10; i++) { // i = 10
            System.out.println("Angka: " + i);
        }

        System.out.println();

        // Nesting Loop
        // membuat segitiga dengan ukuran 5
        int size = 5;
        for (int i = 1; i <= size; i++) { // 1 - 5 (5 kali looping)
            for (int j = 1; j <= i; j++) { // 1-i (i kali looping)
                System.out.printf("%d ", j);
            }
            System.out.println(); // new line
        }

        /*
        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5
         */

        System.out.println();

        // 5-1
        for (int i = 1; i <= 5; i++) { // 1-5
            //  5-i
            for(int j = 5; j >= i; j--) { // 5-i (5-5)
                System.out.printf("%d ", j);
            }
            System.out.println();
        }


        System.out.println();

        size = 5;
        for (int i = 5; i >= 1; i--) { // 5 - 1
            for (int j = 5; j >= i; j--) {
                System.out.printf("%d ", j);
            }
            System.out.println(); // new line
//        }
        }

        System.out.println();

        for(int i = 5; i >= 1; i--) { // 5-1
            for(int j = 1; j <= i; j++) { // 1-i (1-1)
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
        size = 5

         */

        /*
            *
           **
          ***
         ****
        *****
         */

        for(int i = 1; i <= 5; i++) { // 1-5
            // spasi
            for (int j = 5; j >= (i + 1); j--) { // 5-(i+1) 5-3
                System.out.printf(" ");
            }

            // bintang
            for(int k = 1; k <= i; k++) { // 1-i 1-5
                System.out.printf("*");
            }

            System.out.println();
        }

        System.out.println();

        for(int i = 5; i >= 1; i--) {
            System.out.println("ini loop i ke-" + i);
            for(int j = 1; j <= i; j++) {
                System.out.printf("\tini loop j ke-%d pada loop i ke-%d\n",j,i);
            }

            for(int anjay = 1; anjay <= 3; anjay++) {
                System.out.printf("\tini loop anjay ke-%d pada loop i ke-%d\n",anjay,i);
            }

            System.out.println();
        }

        /*
        1 2 3 4 5 6 7
        1 2 3 _ 5 6 7
        1 2 _ _ _ 6 7
        1 _ _ _ _ _ 7
        1 2 _ _ _ 6 7
        1 2 3 - 5 6 7
        1 2 3 4 5 6 7
         */

        System.out.println();
        size = 11;
        int a = 1, b = size / 2; // 3
        boolean balik = false;
        for (int i = 1; i <= size; i++) {
            // untuk print 1-7 pada baris pertama dan terakhir
            if(i == 1 || i == size) {
                for(int j = 1; j <= size; j++) {
                    System.out.printf("* ", j);
                }
            } else {
                for(int j = 1; j <= b; j++) {
                    System.out.printf("* ", j);
                }
                for(int j = 1; j <= a; j++) {
                    System.out.printf("  ");
                }
                for(int j = a + b + 1; j <= size; j++) {
                    System.out.printf("* ");
                }
            }

            System.out.println();
            if(i != 1 && i != size) {
                if((a + 2 >= size) || balik) {
                    a-=2;
                    b++;
                    balik = true;
                } else {
                    b--;
                    a+=2;
                }
            }
        }

        /*
        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5
        */

        System.out.println();

        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] matrix = {{1,2,3},{55,4,2},{4,6,3}};

        for(int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for(int j = 0; j < matrix[i].length;j++) {
                System.out.printf("%d,",matrix[i][j]);
            }
            System.out.println("]");
        }
    }
}
