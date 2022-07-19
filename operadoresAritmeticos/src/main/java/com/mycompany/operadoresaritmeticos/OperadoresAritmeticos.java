/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadoresaritmeticos;

/**
 *
 * @author geniv
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igua a " + m);
        
        int n = 5;
        n++;
        System.out.println(n);
        
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);
        
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        
        float v = 8.5f;
        int baixo = (int) Math.floor(v);
        System.out.println(baixo);
        int cima = (int) Math.ceil(v);
        System.out.println(cima);
        int ar = (int) Math.round(v);
        System.out.println(ar);
        
        double ale = Math.random();
        int novo = (int)(15 + ale * (50-15)); //aleatório entre 15 e 50
        System.out.println(novo);
    }
}
