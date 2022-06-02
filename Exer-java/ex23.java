Exercício 1:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		System.out.println("Digite o valor A");
		a = scan.nextDouble();
		
		System.out.println("Digite o valor B");
		b = scan.nextDouble();
		
		System.out.println("Digite o valor C");
		c = scan.nextDouble();
		
		if((a+b)<c){
		    System.out.println("A soma dos números A e B É menor que C");
		    
		}else{
		    System.out.println("A soma dos números A e B não é menor que C");
		    
		}		
	}
}

Exercicio 2:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
        String nome = ("");
        String sexo = ("");
        String estadoCivil = ("");
        
        System.out.println("Qual o seu nome");
        nome = leia.nextLine();
        System.out.println("Qual o seu sexo F ou M?");
        sexo = leia.nextLine();
		System.out.println("Estado Civil casada/o ou solteira/o");
        estadoCivil = leia.nextLine();
        
        if(estadoCivil.equals("CASADA")){
            System.out.println("Quantos Anos? ");
        }
     

	}
}


Exercicios 3:
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		System.out.println("Digite o valor A");
		a = scan.nextDouble();
		
		System.out.println("Digite o valor B");
		b = scan.nextDouble();

		if(a == b){
		    c = a+b;
		    System.out.println("A + B é igual a " + c);
		    
		}else{
		    c = a*b;
		    System.out.println("A vezes B é igual a "+ c);
		    
		}		
	}
}

Exercicio 4:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
		
		double a = 0;
		
		System.out.println("Digite o valor A");
		a = scan.nextDouble();
		
		if(a >= 0){
		    a= a*2;
		    
		    System.out.println("é igual a " + a);
		    
		}else{
		    a = a*3;
		    System.out.println("é igual a "+ a);
		    
		}		
	}
}

Exercicio 5:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leiaString = new Scanner(System.in);
	    Scanner leiaDouble = new Scanner(System.in);
	    
		
        double altura = 0;
        String sexo = ("");
        double pesoIdeal = 0;
        
        System.out.println("Qual o sua altura");
        altura = leiaDouble.nextDouble();
        
        System.out.println("Qual o seu sexo F ou M?");
        sexo = leiaString.nextLine();
        
        if(sexo.equals("F")){
            pesoIdeal = ((62.1*altura)-44.7);
            
            System.out.println("Seu peso ideal é " + pesoIdeal+"KG");
        }else{
            pesoIdeal = ((72.7*altura)-58);
            System.out.println("Seu peso ideal é " + pesoIdeal+"KG");
        }
     

	}
}

Exercicio 6:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leiaString = new Scanner(System.in);
	    Scanner leiaDouble = new Scanner(System.in);
	    
		
        double valor = 0;
        double pagamento = 0;
        double valorComDesconto = 0;
        
        
        System.out.println("Digite o Valor do Item");
        valor = leiaDouble.nextDouble();
        System.out.println("Digite a Forma de pagamento");
        System.out.println("1 - A vista");
        System.out.println("2 - A vista no crédito");
        System.out.println("3 - Parcelado até 2 Vezes");
        System.out.println("4 - Parcelado mais que 2 Vezes");
        pagamento = leiaDouble.nextDouble();
        
        if(pagamento == 1){
            valorComDesconto = valor * 0.9;
            System.out.println("O Valor ficou " + valorComDesconto);
        }
        
         if(pagamento == 2 ){
            valorComDesconto = valor * 0.85;
             System.out.println("O Valor ficou " + valorComDesconto);
        }
        
         if(pagamento == 3 ){
              System.out.println("O Valor ficou " + valorComDesconto);
          
        }
        
         if(pagamento == 4 ){
            valorComDesconto = valor + (valor*0.1);
             System.out.println("O Valor ficou " + valorComDesconto);
        }
        
	}
}

