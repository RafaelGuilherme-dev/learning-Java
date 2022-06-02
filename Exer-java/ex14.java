import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner l = new Scanner(System.in);
	   
	    System.out.println("Digite o Menor");
    	double x = l.nextDouble();
    	
    	System.out.println("Digite o Maior");
    	double y = l.nextDouble();
	   
	    while (x <= y){
	        x++; 
    	 if(x%2==1)
    	     System.out.println(x);
	    }
	    
	}
}