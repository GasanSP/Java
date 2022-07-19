/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programaidade;

import java.util.Scanner;

/**
 *
 * @author geniv
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu?: ");
        int nasc = teclado.nextInt();
        int i = 2022-nasc;
        System.out.println("Sua idade é: " + i + " anos");
        if (i>=18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }
    }
}
