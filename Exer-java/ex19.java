import java.util.*;
public class Main
{
  public static void main (String[]args)
    {
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite 1 Para Romã");
        System.out.println("Digite 1 Para Maracuja");
        System.out.println("Digite 1 Para Manga");
        System.out.println("Digite 1 Para Morango");
        System.out.println("Digite 1 Para Melão");
        
        int escolherFruta = leia.nextInt();

        String [] vet_frutas  = new String [6];
        
        vet_frutas[1] = "Romã";
        vet_frutas[2] = "Maracuja";
        vet_frutas[3] = "Manga";
        vet_frutas[4] = "Morango";
        vet_frutas[5] = "Melão";
    
        switch(escolherFruta){
        
            case 1:
            System.out.println(vet_frutas[1]);
            break;
                        
            case 2:
            System.out.println(vet_frutas[2]);
            break;
                        
            case 3:
            System.out.println(vet_frutas[3]);
            break;
                        
            case 4:
            System.out.println(vet_frutas[4]);
            break;
                        
            case 5:
            System.out.println(vet_frutas[5]);
            break;
        }

    }
  }
