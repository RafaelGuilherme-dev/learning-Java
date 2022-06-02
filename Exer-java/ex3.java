import java.util.*;
public class Main
{
        public static void main(String[] args){
            
            Scanner leia = new Scanner (System.in);
            System.out.println ("Digite seu mes :" );
            
            double mes = leia.nextDouble();
            
            if (mes == 1){
            System.out.println ("Seu mês é Janeiro" );
                }else{
                if (mes == 2){
                    System.out.println ("Seu mês é Fevereiro");
                    }else{
                    if (mes ==3){
                        System.out.println ("Seu mês é Março");
                        }else{
                        if (mes == 4){
                            System.out.println ("Seu mês é Abril");
                            }else{
                            if (mes == 5){
                                System.out.println ("Seu mês é Maio");
                                }else{
                                if (mes == 6){
                                     System.out.println ("Seu mês é Junho");
                                    }else{
                                    if (mes == 7){
                                         System.out.println ("Seu mês é Julho");
                                        }else{
                                        if (mes == 8){
                                             System.out.println ("Seu mês é Agosto");
                                            }else{
                                            if (mes == 9){
                                                System.out.println ("Seu mês é Setembro");
                                                }else{
                                                if (mes == 10){
                                                     System.out.println ("Seu mês é Outubro");
                                                    }else{
                                                    if (mes == 11){
                                                        System.out.println ("Seu mês é Novembro");
                                                        }else{
                                                        if (mes == 12){
                                                            System.out.println ("Seu mês é Dezembro");
                                                            }else{
                                                            if (mes < 1 || mes >12){
                                                                System.out.println ("Mês Invalido");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
    }