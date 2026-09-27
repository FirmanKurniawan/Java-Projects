public class TipeData {
    public static void main(String[] args) { // method atau fungsi
        // Byte (-128 - 127)
        byte angka = 0;
        byte angkaByte = 5;
        byte angka1 = 2, angka2 = 3;

        byte angka129 = (byte)129;

        System.out.println("Nilai angkaByte: " + angkaByte);
        System.out.println("Nilai angka: " + angka);
        System.out.println("Nilai angka1: " + angka1);
        System.out.println("Nilai angka2: " + angka2);
        System.out.println("Nilai angkaByte: " + angkaByte);
        System.out.println("Nilai angka129: " + angka129);

        // re assign
        angkaByte = 11;
        System.out.println("Nilai angkaByte: " + angkaByte); // append string

        // Int (-2,147,583,684 ke 2,147,483,647)
        int angkaInt = 0;
        System.out.println("Nilai angkaInt: " + angkaInt);
        System.out.println("Nilai angkaInt: " + (angkaInt + angkaByte));

        // float (menyimpan bilangan pecahan, cukup untuk menyimpan 6 sampai 7 digit desimal)
        float angkaFloat = 2.43f; // (float) 2.43
        System.out.println("Nilai angkaFloat: " + angkaFloat);

        // double (menyimpan bilangan pecahan, cukup untuk mentimpan 15 digit desimal)
        double angkaDouble = 23.45d; // (float) 23.45
        System.out.println("Nilai angkaDouble: " + angkaDouble);

        // boolean (value antara true = 1 atau false = 0)
        boolean booleanTrue = true;
        boolean booleanFalse = false;

        System.out.println("Nilai booleanTrue: " + booleanTrue);
        System.out.println("Nilai booleanFalse: " + booleanFalse);

        // char (Value dari ascii)
        char karakter = 'G';
        System.out.println("Nilai karakter: " + karakter);
        System.out.println("Kode karakter: " + (int)karakter);

        // String (kumpulan char)
        String kata1 = "Nilai kata: ";
        String kata2 = "cindol";
        System.out.println(kata1 + kata2);
//        System.out.println("Nilai kata: " + "cindol");
    }
}
