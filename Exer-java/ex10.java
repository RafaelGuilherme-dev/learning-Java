import java.util.*;
public class Main
{
public static void main(String[] args){
    
Scanner leia = new Scanner (System.in);
System.out.println ("Digite sua Altura :" );
double altura = leia.nextDouble();

System.out.println ("Digite seu Peso :" );
double peso = leia.nextDouble();

double imc = peso/(altura*altura);

if (imc < 18){
    System.out.println ("Magreza!");    
    }else{
             if (imc < 24.9){
        System.out.println ("Saudável!");    
        }else{
                 if (imc < 29.9){
            System.out.println ("Sobrepeso!");    
            }else{
                        if (imc <= 30){
                    System.out.println ("Obsidade!");    
                    }else   {
                            }   
                
                }
            }
        }
        
        
        
    }
}