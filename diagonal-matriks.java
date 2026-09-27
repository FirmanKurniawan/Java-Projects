public class Program
{
  static void diagonalMatrix(int size){
      int i,j,k;
      
      for(i=0; i<size; i++){
          for(j=0; j<i; j++){
              System.out.print("0");
          }
          System.out.print("1");
          
          for(k=0; k<(size-(j+1));k++){
              System.out.print("0");
          }
          
          System.out.println();
      }
  }
    public static void main(String[] args) {
        diagonalMatrix(10);
    }
}
