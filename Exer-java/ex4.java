import java.util.*;
public class Main
{
public static void main(String[] args){
    
Scanner leia = new Scanner (System.in);
System.out.println ("Digite o primeiro número:" );
double n1 = leia.nextDouble();

System.out.println ("Digite o segundo número :" );
double n2 = leia.nextDouble();

System.out.println ("Digite o terceiro número:" );
double n3 = leia.nextDouble();


    if (n1>n2 & n1>n3){
        System.out.println("O numero maior é " + n1);
        }
        else{
         if (n2>n1 & n2>n3){
        System.out.println("O numero maior é " + n2);
        }else{
            if (n3>n2 & n3>n1){
        System.out.println("O numero maior é " + n3);
        }else{
            
        }
        }   
        }
        
        
    
    if (n1<n2 & n1<n3){
        System.out.println("O numero menor é " + n1);
        }
        else{
         if (n2<n1 & n2<n3){
        System.out.println("O numero menor é " + n2);
        }else{
            if (n3<n2 & n3<n1){
        System.out.println("O numero menor é " + n3);
        }else{
            
        }
        }   
        }

    
    
}
}