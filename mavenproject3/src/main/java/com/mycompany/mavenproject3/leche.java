/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Dell
 */
public class leche extends bebidaDecorator {
     public leche(bebida bebidaDecorada) {
        super(bebidaDecorada);
    }
     
     @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", Leche";
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto() + 1.5; // Añade el costo de la leche
    }
}
