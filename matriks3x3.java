import java.io.*;
class Matrix3x3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader BR=new BufferedReader(new InputStreamReader (System.in));
        int Number[][]=new int[3][3];
        int i,j;
        String m;
        System.out.println("Enter Elements for Matrix 3x3 :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                m=BR.readLine();
                Number[i][j]=Integer.parseInt(m);
            }
        }
        System.out.println("Elements in Matrix are : ");
                                System.out.println("");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(Number[i][j]+"\t");
            }
            System.out.println();
        }
    }
} 
