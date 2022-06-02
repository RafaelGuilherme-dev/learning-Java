import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     
	    Scanner l = new Scanner(System.in);
	    
	    float altura = 0;
	    Double maiorAltura = -10000000;
	    Double menorAltura = 10000000;
	    
     for(int i; i <=15; i++){
          System.out.println("Digite sua Altura");
          altura = l.nextDouble();
          
          if(altura > maiorAltura){
               maiorAltura = altura;
          }
          
          if(altura < menorAltura){
               menorAltura = altura;
          }
     }
	    
	}
}