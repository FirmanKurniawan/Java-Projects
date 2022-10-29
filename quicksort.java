import java.util.ArrayList;
import java.util.Random;

public class Program {
	static ArrayList <Integer>list=new ArrayList<Integer>();
	static boolean swapped=true;
 static ArrayList <Integer> ii=new ArrayList<Integer>();
	static	 ArrayList <Integer> jj=new ArrayList<Integer>();
	static int temp;
	static long count=0;
	
	
	
	 public static void main(String[] args) {
		 
		 int i=0;
		 
		 while (i<300) {
			 
		 list.add(new Random().nextInt(500));
	 
	 i++;
	 }
		 
		 System.out.println(list);
		int loi=0;
		int  hii=list.size();
	
sort(list,0,hii-1);

		 System.out.println(list);
	 System.out.println("sort was done "+count+" times");}
	        
		 
		 
		
		 
	 
	 
	 public static void sort(ArrayList<Integer> sorte,int lo,int hi) {
		
		int x=sorte.get(lo+(hi-lo)/2);

		int i=lo;
		int j= hi;
	// System.out.println(list+"begin i= "+i+"wert "+list.get(i)+"j= "+j+"wert "+list.get(j)+"x= "+x+" lo="+lo+" hi= "+hi);
		
		count++;
	
		 while(i<=j) {
			 
			while(sorte.get(i)<x) {i++;if(i>hi)i=lo;}
				while(sorte.get(j)>x) {j--; if(j<lo) j=hi;  }
			 
			// System.out.println(list+"mid i= "+i+"wert "+list.get(i)+"j= "+j+"wert "+list.get(j)+"x= "+x+" lo="+lo+" hi= "+hi);
			 
			 
			 
			 
			 
			 if(i<=j) {temp=sorte.get(i);
			 			sorte.set(i,sorte.get(j));
			 			sorte.set(j, temp);
			 			//System.out.println(list+"end i= "+i+"wert "+list.get(i)+"j= "+j+"wert "+list.get(j)+"x= "+x+" lo="+lo+" hi= "+hi);
			 			i++;if(i>hi)i=lo;
			 			j--; if(j<lo) j=hi;
			 
			 			
			 
			 
			 
			 
		 }//else System.out.println(list+"end i= "+i+"wert "+list.get(i)+"j= "+j+"wert "+list.get(j)+"x= "+x+" lo="+lo+" hi= "+hi);
			 }
		// System.out.println(list+"end i= "+i+"wert "+list.get(i)+"j= "+j+"wert "+list.get(j)+"x= "+x+" lo="+lo+" hi= "+hi);
		 if(lo<j) {
			
			 
			 
			 
			 sort(sorte,lo,j);}
		 
		 if(i<hi) {
			
			 sort(sorte,i,hi);}
		 

		list=sorte;
		
		 
		
		 
	 }
	 
	 
	
				

}
