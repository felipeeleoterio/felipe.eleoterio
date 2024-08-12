/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_felipe;

/**
 *
 * @author f.silva
 */
import java.util.Scanner;

public class PROJETO_7_FELIPE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o peso e a altura do usuário
        System.out.print("Digite seu peso em quilogramas (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura em metros (m): ");
        double altura = scanner.nextDouble();
        
        // Calcula o IMC
        double imc = peso / (altura * altura);
        
        // Exibe o resultado do IMC e a classificação
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso normal.");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Classificação: Excesso de peso.");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("Classificação: Obesidade classe 1.");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("Classificação: Obesidade classe 2.");
        } else {
            System.out.println("Classificação: Obesidade classe 3.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}

