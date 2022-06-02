import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner leia = new Scanner (System.in);
   
    double [] vet_num = new double [10];
    double soma = 0;
    double menorNum = 100000;
    int qntdNumeros = 0;
 
    for (int x = 0; x < 10; x++){
        System.out.println("Digite o Numero");
        vet_num[x] = leia.nextDouble();}
        
    for (int x = 0; x < 10; x++){
        soma = soma + vet_num[x];
        qntdNumeros++;}
        
            
    for (int x = 0; x < 10; x++){
        if(vet_num[x]<menorNum){
            menorNum = vet_num[x];
            
        }
        
    }

        System.out.println("A soma é " + soma);
        System.out.println("A média é " + (soma/qntdNumeros));
        System.out.println("O Menor número foi " + menorNum);
        


    }
  }