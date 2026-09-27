/*
 * Code by @hexaorzo
 */
import java.util.*;
public class CaesarCipher
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to cipher:");
        String str = sc.nextLine();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        String encrypted = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch = (char)(ch+key);
                if(ch>'z')
                {
                    ch = (char)(ch-'z'+'a'-1);
                }
                encrypted += ch;
            }
            else if(ch>='A' && ch<='Z')
            {
                ch = (char)(ch+key);
                if(ch>'Z')
                {
                    ch = (char)(ch-'Z'+'A'-1);
                }
                encrypted += ch;
            }
            else
            {
                encrypted += ch;
            }
        }
        System.out.println("Encrypted string :");
        System.out.println(encrypted);
    }
}
