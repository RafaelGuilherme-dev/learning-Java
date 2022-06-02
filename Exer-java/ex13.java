import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner l = new Scanner(System.in);
	   
	    int qtdperg =0;
	    double num;
	    double somaPar =0;
	    double somaImpar =0;
	    
	    while (qtdperg <=9){
    	    System.out.println("Digite o Numero");
    	    num = l.nextDouble();
    	    
    	    qtdperg++;
    	    
    	   if(num %2 ==0)
    	     somaPar += num;
    	  else
    	    somaImpar += num; 
	    }
	    
	    System.out.println(somaImpar);
	    System.out.println(somaPar);
	    
	    
	    
	}
} 