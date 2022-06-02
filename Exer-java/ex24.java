import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		String copoA = "";
		String copoB = "";
		String copoC = "";
		int numEmba = 0;
		int contador = 1;
		int numAle1 = 0;
		int numAle2 = 0;
		
		
		boolean bolaCopoA = false;
		boolean bolaCopoB = false;
		boolean bolaCopoC = false;
		
		int aposta = 0;
		
		
		Random aleatorio = new Random(); 
		
		System.out.println("Digite a numero de embaralhamentos");
		numEmba = scan.nextInt();
		
		System.out.println("Em qual copo acha que vai estar?");
		System.out.println("1 para COPO A");
		System.out.println("2 Para COPO B");
		System.out.println("3 Para COPO C");
		
		aposta = scan.nextInt();
		
		while(numEmba<=contador){
		    contador++;
		    numAle1 = aleatorio.nextInt();
		    numAle1 = aleatorio.nextInt();
		}
		
		if (numAle1>numAle2){
    		 copoA = "BOLA!!!!";
    		 copoB = "Vazio";
    		 copoC = "Vazio";
		 }
		
		if (numAle1<numAle2){
		    copoA = "Vazio";
		    copoB = "BOLA!!!";
		    copoC = "Vazio";
		}
		
		if (numAle1 == numAle2){
		    copoA = "Vazio";
		    copoB = "Vazio";
		    copoC = "BOLA!!!";
		}
		
		if (aposta == 1 ){
		    bolaCopoA = true;
    		   if(bolaCopoA){
        		    System.out.println("Acertou");
        		    System.out.println("Copo A: " + copoA);
        		    System.out.println("Copo B: " + copoB);
        		    System.out.println("Copo C: " + copoC);
        		    }else{
            		    System.out.println("Errou");
            		    System.out.println("Copo A: " + copoA);
            		    System.out.println("Copo B: " + copoB);
            		    System.out.println("Copo C: " + copoC);
        		} 
		}
		    
			if (aposta == 2 ){
    		    bolaCopoB = true;
        			if(bolaCopoB){
            		    System.out.println("Acertou");
            		    System.out.println("Copo A: " + copoA);
            		    System.out.println("Copo B: " + copoB);
            		    System.out.println("Copo C: " + copoC);
        		        }else{
                		    System.out.println("Errou");
                		    System.out.println("Copo A: " + copoA);
                		    System.out.println("Copo B: " + copoB);
                		    System.out.println("Copo C: " + copoC);
            		}
    			}
		    
		
			if (aposta == 3 ){
		        bolaCopoC = true;
    			  if(bolaCopoC){
        		    System.out.println("Acertou");
        		    System.out.println("Copo A: " + copoA);
        		    System.out.println("Copo B: " + copoB);
        		    System.out.println("Copo C: " + copoC);
    		        }else{
            		    System.out.println("Errou");
            		    System.out.println("Copo A: " + copoA);
            		    System.out.println("Copo B: " + copoB);
            		    System.out.println("Copo C: " + copoC);
            		}  
			}
		    
		    
		
		
		
		
		
		
		
	}
}
