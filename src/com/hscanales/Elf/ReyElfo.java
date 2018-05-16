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
public class ReyElfo implements Elf{
    int vida = health * 10;

    @Override
    public void Attack() {
        System.out.println("Elf King says: Ataque del gran rey Elfo");
        System.out.println("*Destruye a todo el enemigo*");
    }

    @Override
    public void Init() {
        Attack();
    }
    
}
