import java.util.*;
public class Main{
    
public static void main(String[] args){
Scanner leia = new Scanner (System.in);

System.out.println ("Digite a Primeira medida:");
double lado1 = leia.nextDouble();

System.out.println ("Digite a Segunda medida:");
double lado2 = leia.nextDouble();

System.out.println ("Digite a Terceira medida:");
double lado3 = leia.nextDouble();

    if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2)
    {
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilatero");
        }else{
            if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
                System.out.println("Escaleno");
            }else{
                 System.out.println("Isosceles");
                }
            }       
        
    }else{
        System.out.println("Não é um Triangulo");
        }
    }
}
