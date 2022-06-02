import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner leia = new Scanner (System.in);
    
    int idade = 0;
    int maiorIdade = -10000;
    int menorIdade = +10000;
    int qntdPessoas = 0;
    int qntdFeminino = 0;
    int idadeMenor = 0;
    
    double salarioMenor = 0;
    double menorSalario = +10000000; 
    double salario = 0;
    double totalSalario = 0;
    
    String sexoMenor = "";
    String sexo = "";

    while (true)
          {System.out.println("Digite a Idade");
          idade = leia.nextInt();
          if (idade < 0){
              break;
            }else{
                qntdPessoas++;
            }
            
            if (idade > maiorIdade){
                    maiorIdade = idade;
            }
            
            if (idade < menorIdade){
                    menorIdade = idade;
            }
            
          System.out.println("Digite o Salário");
          salario = leia.nextDouble();
          totalSalario = totalSalario + salario;
          
           if (salario < menorSalario){
                menorSalario = salario;
                salarioMenor = salario;
                idadeMenor = idade;
                sexoMenor = sexo;
            }
          
          System.out.println("Digite o Sexo (M/F)");
          leia.nextLine();
          sexo = leia.nextLine();
          
          if (sexo.equals("F")){
              qntdFeminino++;
              
            }
    }
      System.out.println("Media Salarial é " + (totalSalario/qntdPessoas));
      System.out.println("Menor Idade é " + (menorIdade));
      System.out.println("Maior Idade é " + (maiorIdade));
      System.out.println("Quantidade de Mulheres é" + (qntdFeminino));
      System.out.println(" O Menor salario é: " + salarioMenor + " é da pessoa de idade de " + idadeMenor);
        
        
        
        
    }
  }
