import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner (System.in);
	        System.out.println ("Coloque a cor");
            String Ver = leia.nextLine ();
            
            if (Ver.equals("Vermelho")){
                System.out.println("Pare");
            }else if (Ver.equals("Amarelo")){
                System.out.println("Reduza");
            }else if (Ver.equals("Verde")){
                System.out.println("Siga");
            }

	    }
    }
