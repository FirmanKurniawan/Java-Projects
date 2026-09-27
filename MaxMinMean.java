import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int angka , i ,  jumlah_bil=0;
        float mean=0 , bilangan , max , min ;
        ArrayList<Float> arr = new ArrayList<Float>();
        System.out.println("masukan jumlah angka yang akan di input :");
        angka = keyboard.nextInt();

//memasukan data ke array dan menjumlhkan data
        for(i=0; i< angka; i++){
            System.out.println("masukan bilangan ke :" +i);
            bilangan = keyboard.nextInt();
            arr.add(bilangan);
            jumlah_bil +=bilangan;
        }
//mencari rata rata
        mean = (float) jumlah_bil/ arr.size();

//mencari max
        max = arr.get(0);
        for(i=0; i<angka; i++){
            if(arr.get(i) > max || arr.get(i)==max){
                max = arr.get(i);
                System.out.println(max);
            }
        }

//mencari min
        min= arr.get(0);
        for(i=0; i<angka; i++){
            if(arr.get(i) < min || arr.get(i)< min){
                min = arr.get(i);
            }
        }
        System.out.println("jumlah bil : :"+jumlah_bil);
        System.out.println("ukuran array : :"+arr.size());
        System.out.println("nilai rata ratanya adalah : :"+ mean);
        System.out.println("nilai maximunya adalah  : :" + max);
        System.out.println("nilai minimumnya adalah : :"+min);

    }
}
