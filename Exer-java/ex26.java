import java.util.*;
public class Main
{
    public static void main(String[] args){
        
    Scanner leia = new Scanner (System.in);
    Scanner leia2 = new Scanner (System.in);
    
    int escolherPrograma = 0;

    System.out.println("Digite (1) para IMC.");
    System.out.println("Digite (2) para Area do Circulo.");
    System.out.println("Digite (3) para Volume do Quadrado.");
    
    escolherPrograma = leia2.nextInt();
    
    switch(escolherPrograma)
	{
        case 1:
            
               System.out.println ("Digite sua Altura :" );
                double altura = leia.nextDouble();
                
                System.out.println ("Digite seu Peso :" );
                double peso = leia.nextDouble();
                
                double resp = imc(altura,peso);
                
                if (resp < 18){
                    System.out.println ("Magreza!");    
                    }else{
                        if (resp < 24.9){
                        System.out.println ("Saudável!");    
                        }else{
                            if (resp < 29.9){
                            System.out.println ("Sobrepeso!");    
                            }else{
                                if (resp <= 30){
                                System.out.println ("Obsidade!");    
                                }else{
                                    }   
                                }
                            }
                        }
                    
        break;
            
        case 2:
            
            double raioRecebido = 0;
            double resultadoArea = 0;
            System.out.println("Digite o raio do Circulo: ");
            
            raioRecebido = leia.nextDouble();
            
            resultadoArea = areaCirculo(raioRecebido);
            
            System.out.println("A Area é: " + resultadoArea);
            
            break;
            
        case 3:
            
            double alturaRecebida = 0;
            double resultadoVolume = 0;
            System.out.println("Digite a Altura de um dos lados do cubo: ");
            alturaRecebida =  leia.nextDouble();
            
            resultadoVolume = volumeCubo(alturaRecebida);
            
            System.out.println("O Volume do cubo é: " + resultadoVolume);

        break;
       
       default : 
             
            System.out.println("Numero Invalida - Rode novamente ");

        	        
	}
    
        }
    
    public static double imc(double a, double b){
        return a/(b*b);
    }
    
    public static double areaCirculo(double a){
        return (3.14*(a*a));
    }
    
    public static double volumeCubo(double a){
        return (a*a*a);
    }
    
}