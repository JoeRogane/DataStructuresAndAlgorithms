import java.util.*;

class JavaDemo {
	public static void main (String[] args) {
	    int[] priceOfPen= new int[5];
	    Scanner in=new Scanner(System.in);
	    for(int i=0;i<priceOfPen.length;i++)
	        priceOfPen[i]=in.nextInt();

	    for(int i=0;i<priceOfPen.length;i++)
		    System.out.print(priceOfPen[i]+" ");
	}
}