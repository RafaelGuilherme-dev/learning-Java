import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite um lanche de 1 a 5");
	
	int numLanche = leia.nextInt();
	
	switch(numLanche)
	{
        	    case 1:
        	        System.out.println("Big Mac");
        	        break;
        	        
        	    case 2:
        	        System.out.println("Quarteirão");
        	        break;
        	        
        	    case 3:
        	        System.out.println("Mc Chicken");
        	        break;
        	        
        	    case 4:
        	        System.out.println("Cheddar Mc Melt");
        	        break;
        	        
        	    case 5:
        	        System.out.println("Mc Max");
        	        break;
        	        
        	   
        	   default : 
        	         System.out.println("Escolha um lanche de 1 a 5");
        	        
        	        
	}
	
	
	
	
	
	
	}
}