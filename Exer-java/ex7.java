import java.util.*;
public class Main
{
	public static void main(String[] args) {
    
    String copo1 = "vazio";
    String copo2 = "fanta";
    String copo3 = "coca";
    
    copo1 = copo3;
    copo3 = copo2;
    copo2 = copo1;
    
        System.out.println ("O copo 1 é " + copo2 );
            System.out.println ("O copo 2 é " + copo3 );

    
    

	}
}
