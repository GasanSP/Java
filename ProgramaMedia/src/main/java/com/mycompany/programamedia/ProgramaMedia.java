/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programamedia;

import java.util.Scanner;

/**
 *
 * @author geniv
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Escreva a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi: " + m);
        if (m>9){
            System.out.println("Parabéns!!!");
        }
    }
}
