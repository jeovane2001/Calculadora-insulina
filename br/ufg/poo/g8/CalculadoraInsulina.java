package br.ufg.poo.g8;
/**
/**
 * analise de isulina
 * 
 * @jeovane2001
 * 15/07/2024
 */

public class CalculadoraInsulina {
    /**
/**
 * metodo pricipal
 * 
 * @armazena e organiza os valores de insulina e glicose
 * 15/07/2024
 */
  
   public void getCalculararInsulina(double glicose ){
        double insulina;
        if (glicose < 70) {
            insulina = 2.0; // Valor de insulina para hipoglicemia
        } else if (glicose >= 70 && glicose <= 130) {
            insulina = 1.0; // Valor de insulina para glicose normal
        } else {
            insulina = 0.5; // Valor de insulina para hiperglicemia
        }
        

        System.out.println("Dose de insulina recomendada: " + insulina + " unidades");

    }
}
