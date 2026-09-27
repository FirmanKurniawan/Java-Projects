import java.util.Scanner;

public class Hailstone {
    public static int count=0; // static variable (class variable)
    public static String Seq="";

    //class method 1 : cheching if number is even
    public static boolean isEven(int n){
        return n%2==0;
    }

    //class method 2 : generating sequence
    public static void hail(int n){
        
        System.out.println(n);
        if (n==1){
            return;
        }
        else if (isEven(n)){
            count++;
            hail(n/2);
        }
        else{
            count++;
            hail(3*n+1);
        }
        
    }

    public static String hailstone_Str(int n){
        
        while (n>1){
            Seq+=String.valueOf(n)+", ";
            if (isEven(n)){                
                n=n/2;
            }
            else{
                n=3*n+1;
            }
        }
        Seq+="1";
        return Seq;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number:");
        int num= in.nextInt();
        int num_ini=num;
        System.out.println("Hail stone sequence for "+num+" is;");
        hail(num);
        System.out.println("it took "+Hailstone.count+" moves to go from "+num_ini+" to 1");
        in.close();

        String seq_out=hailstone_Str(num);
        System.out.println(seq_out);

    }
}



