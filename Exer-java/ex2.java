import java.util.*;
public class Main
{
    public static void main(String[] args){
        
        Scanner leia = new Scanner (System.in);
        System.out.println ("Digite sua Idade :" );
        double idade = leia.nextDouble();


        if (idade <= 12){
            System.out.println ("Você é Criança" );    
            }else{
                if (idade <= 16){
                    System.out.println ("Você é Adolescente" );    
                    }else{
                        if (idade <= 30){
                            System.out.println ("Você é Jovem" );    
                            }else{
                                if (idade <= 60){
                                    System.out.println ("Você é Adulto" );    
                                    }else{
                                        if (idade >= 60){
                                            System.out.println ("Você é Velho" );    
                                        }   
                                    }
                                }
                        }
            }
    }
}