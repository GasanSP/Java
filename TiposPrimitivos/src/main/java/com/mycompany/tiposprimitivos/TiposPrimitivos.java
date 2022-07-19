/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author geniv
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        
        String nome2 = "Genivaldo";
        float nota2 = 8.5f;
        System.out.printf("A nota de %s é: %.4f \n",nome2,  nota2);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
    }
}
