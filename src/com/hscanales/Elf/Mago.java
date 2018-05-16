/*
 * 
 * 
 * 
 */
package com.hscanales.Elf;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Mago implements Elf{
int vida = health;
    @Override
    public void Attack() {
        System.out.println("Mago utiliza Hechizo de Curacion");
        System.out.println("Su vida a aumentado 50 puntos");
     vida+=50;   
    }

    @Override
    public void Init() {
        Attack();
    }
    
    
}
