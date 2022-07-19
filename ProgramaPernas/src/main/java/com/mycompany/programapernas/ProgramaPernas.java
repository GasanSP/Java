/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programapernas;

import java.util.Scanner;

/**
 *
 * @author geniv
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Entre com a quantidade de pernas: ");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                System.out.println("É um Saci");
                break;
            case 2:
                System.out.println("É um Bípede");
                break;
            case 4:
                System.out.println("É um Quadrúpede");
                break;
            case 6, 8:
                System.out.println("É uma Aranha");
                break;
            default:
                System.out.println("É um ET");
        }
    }
}
