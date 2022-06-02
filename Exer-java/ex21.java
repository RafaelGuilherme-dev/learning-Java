import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner leiaString = new Scanner(System.in);
	    Scanner leiaDouble = new Scanner(System.in);
	    Scanner leiaInt = new Scanner(System.in);
	    
	     int x = 100;
	     int[] vet_idade = new int [x];
	     String[] vet_nome = new String [x];
	     double[] vet_nota1 = new double [x];
	     double[] vet_nota2 = new double [x];
	     double[] vet_nota3 = new double [x];
	     int qntdInformada = 0 ;
	     int y = 0;

	     
	     System.out.println("Digite quantas pessoas quer cadastrar: ");
	          qntdInformada = leiaInt.nextInt();
	            if (qntdInformada > x){
	         x = qntdInformada;
	     }

	     
	     for (int i = 0; i < qntdInformada ; i++ ){
	         
	         System.out.println("Digite o nome do "  + (i+1) + "° Aluno");
	         vet_nome[i] = leiaString.nextLine();
	         
	         System.out.println("Digite a Idade do " + (i+1) + "° Aluno");
	         vet_idade[i] = leiaInt.nextInt();
	         
	         System.out.println("Digite a Primeira do " + (i+1) + "° Aluno");
	         vet_nota1[i] = leiaDouble.nextDouble();
	         
	         System.out.println("Digite a Segunda Nota do " + (i+1) + "° Aluno");
	         vet_nota2[i] = leiaDouble.nextDouble();
	         
	         System.out.println("Digite a Terceira Nota: do " + (i+1) + "° Aluno");
	         vet_nota3[i] = leiaDouble.nextDouble();
	     }
	     
	    
	    
	    System.out.println("Qual Aluno deseja ver as Informações");
	    y = leiaInt.nextInt();
	    
	    System.out.println("Nome: " + vet_nome[y]);
	    System.out.println("Idade: " + vet_idade[y]);
	    System.out.println("Primeira Nota: " + vet_nota1[y]);
	    System.out.println("Segunda Nota: " + vet_nota2[y]);
	    System.out.println("Terceira Nota: " + vet_nota3[y]);
	    
	    
	    
	    
	    
	    
	}
}