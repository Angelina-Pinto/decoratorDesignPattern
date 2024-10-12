/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author Dell
 */
public class main {

    public static void main(String[] args) {
         bebida cafe = new cafe();
        System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

        // Añadir leche al café
        bebida cafeConLeche = new leche(cafe);
        System.out.println(cafeConLeche.getDescripcion() + " $" + cafeConLeche.getCosto());

        // Añadir azúcar al café con leche
        bebida cafeConLecheYAzucar = new azucar(cafeConLeche);
        System.out.println(cafeConLecheYAzucar.getDescripcion() + " $" + cafeConLecheYAzucar.getCosto());
    }
}
