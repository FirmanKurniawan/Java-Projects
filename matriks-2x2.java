public class Program
{
	public static void main(String[] args) {
		int matrik1[][] = {{9, 9},
        {1, 5}};
        int matrik2[][] = {{5, 7},
        {10, 4}};
        int jumlah_matrik1[][] = new int[2][2];
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0 ;

        System.out.println("Matrik 1");
        for (a = 0; a < matrik1.length; a++) {
            for (b = 0; b < matrik1[0].length; b++) {

                System.out.print(matrik1[a][b] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Matrik 2");
        for (c = 0; c < matrik2.length; c++) {
            for (d = 0; d < matrik2[0].length; d++) {
                System.out.print(matrik2[c][d] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Hasil Penjumlahan Matrik 1 dan Matrik 2");
        for (e = 0; e < jumlah_matrik1.length; e++) {
            for (f = 0; f < jumlah_matrik1[0].length; f++) {
                jumlah_matrik1[e][f] = matrik1[e][f] + matrik2[e][f];
                System.out.print(jumlah_matrik1[e][f] + " ");
            }
            System.out.println();
        }
	}
}
