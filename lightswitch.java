public class Switch {
    public static void main(String[] args) {
        // statement switch merupakan salah satu dari statement
        //  logika yang dapat digunakan untuk menentukan kondisi
        //  yang akan dijalankan

        // syarat khusus pada java meliputi
        //  - tidak menerima sistem duplikasi case
        //  - harus mengandung value yang konstan dan tidak menggunakan variabel
        //  - jika semua case tidak terpenuhi maka lanjut ke default case sebagai
        //      default case yang akan dijalankan


        String pilihan = "kamar";

        switch (pilihan) {
            case "depan":
                System.out.println("Idupin lampu depan");
                break;
            case "kamar":
                System.out.println("Idupin lampu kamar");
                break;
            case "bawah":
                System.out.println("Idupin lampu bawah");
                break;
            case "belakang":
                System.out.println("idupin lampu belakang");
                break;
            default:
                System.out.println("Lampunya tidak ditemukan");
                break;
        }

        int angka = 30;

        System.out.println("==== switch");

        switch (angka) {
            case 20:
                System.out.println("angkanya adalah 20");
                break;
            case 30:
                System.out.println("angkanya adalah 30");
                break;
            default:
                System.out.println("Ini adalah default case");
                break;
        }

        System.out.println("==== if else");

        if(angka == 20) { // case 20:
            System.out.println("angkanya adalah 20");
        } else if (angka == 30) { // case 30:
            System.out.println("angkanya adalah 30");
        } else { // default:
            System.out.println("Ini adalah default case");
        }
    }
}
