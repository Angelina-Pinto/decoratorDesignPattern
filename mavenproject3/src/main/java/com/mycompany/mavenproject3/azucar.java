/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Dell
 */
public class azucar extends bebidaDecorator{
        
    public azucar(bebida bebidaDecorada) {
        super(bebidaDecorada);
    }
      @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", Azúcar";
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto() + 0.5; // Añade el costo del azúcar
    }
}
