package br.ufg.poo.g8;
import java.util.Scanner;
/**
/**
 * classe que faz o uso da ação
 * 
 * @jeovane2001
 * 15/07/2024
 */

public class main
{
    /**
/**
 * metodo principal
 * 
 * @para analise da insulina
 * 15/07/2024
 */
 public void Calcular_Insulina(){
    // CalculadoraInsulina calcular = new CalculadoraInsulina();
    Scanner entrada = new Scanner(System.in);
        CalculadoraInsulina calcular = new CalculadoraInsulina(); 
        
        System.out.print("Digite o valor da glicose (mg/dL): ");
        double glicose = entrada.nextDouble();
        calcular.getCalculararInsulina(glicose);
        entrada.close();
 }
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculadoraInsulina calcular = new CalculadoraInsulina(); 
        
        System.out.print("Digite o valor da glicose (mg/dL): ");
        double glicose = entrada.nextDouble();
        calcular.getCalculararInsulina(glicose);
        entrada.close();
    }
}
