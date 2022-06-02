import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
    	Scanner leiaString = new Scanner(System.in);
    	Scanner leiaDouble = new Scanner(System.in);
    	
    	boolean continuar = true;
    	double vlRecebido = 0;
    	String resposta = "";
    	double somatoria= 0;
    	
    	while(continuar){
    	        System.out.println("Digite o Numero que quer somar: ");
    	         vlRecebido = leiaDouble.nextDouble();
    	    
    	        System.out.println("Deseja continuar (S ou N)?");
    	        resposta = leiaString.nextLine();
    	    
    	        somatoria = somatoria + vlRecebido;
    	    
            	if (resposta.equals("S")){ 
            	    continuar = true;
            	        
                    }else{
                    continuar = false;
                    System.out.println("Valor total é " + somatoria);
                        }
    	    }
    	}
	
	}