/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.votacao;

import java.util.Scanner;

/**
 *
 * @author geniv
 */
public class Votacao {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.print("Escreva o ano que você nasceu: ");
       int ano = teclado.nextInt();
       int idade = 2022 - ano;
        System.out.println("Sua idade é: " + idade + " anos");
       if (idade<16){
           System.out.println("Não vota");
       }else{
           if ((idade >=16 && idade<18) || (idade > 70)){
               System.out.println("Voto opcional");
           }else{
               System.out.println("Voto Obrigatório");
           }
       }
    }
}