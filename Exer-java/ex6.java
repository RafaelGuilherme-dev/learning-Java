
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	System.out.println ("Digite um Numero");
	    int numero_semana = leia.nextInt();
	    
	    if (numero_semana == 1){
	        System.out.println("Domingo");
	            }else if (numero_semana == 2){
	            System.out.println ("Segunda");
	                } else if (numero_semana == 3){
	                System.out.println ("Terça");
	                    } else if (numero_semana == 4){
	                    System.out.println ("Quarta");
	                        } else if (numero_semana == 5){
	                        System.out.println ("Quinta");
	                            }else if (numero_semana == 6){
	                            System.out.println ("Sexta");
	                                } else if (numero_semana == 7){
	                                    System.out.println ("Sabado");
                                        } else {
                                            System.out.println ("erro");
                                            }

	                    }

    
            }
