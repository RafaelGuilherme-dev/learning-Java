import java.util.*;
public class Main
{
        public static void main(String[] args){
            
            Scanner leia = new Scanner (System.in);
            System.out.println ("Cadastre seu código PIN:" );
            
            double codCad = leia.nextDouble();
            
            System.out.println ("Cadastre sua senha PIN:" );
            
            double senCad = leia.nextDouble();
            
            System.out.println ("Informe seu código PIN Cadastrado:" );
            
            double codInf = leia.nextDouble();
            
            System.out.println("Informe sua senha PIN:");
            
            double senInf = leia.nextDouble();
            
            if (codInf == codCad & senInf == senCad){
                System.out.println("Acesso Concedido");
                }else{
                    System.out.println("Senha ou código incorreto - ACESSO NEGADO");
                }
            
        }
    }