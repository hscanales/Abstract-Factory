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
public class Arquero implements Elf{
    String name = "arquero";
    @Override
    public void Attack() {
        System.out.println(this.name+" attacks the enemy");
    }

    @Override
    public void Init() {
        System.out.println("This is the WoW");
        Attack();
    }
    
    
}
