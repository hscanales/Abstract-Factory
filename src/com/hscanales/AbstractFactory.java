/*
 * Implementacion de Abstract Factory con Elfos y Orcos
 * 
 * 
 */
package com.hscanales;

import com.hscanales.Elf.Elf;
import com.hscanales.Orc.Orc;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractInterface factory;
        factory= FactoryProducer.getFactory("elf");
        Elf elfo = factory.elfCreator("Archer");
        elfo.Init();
        
        factory = FactoryProducer.getFactory("orc");
        Orc orco = factory.orcReator("Beast");
        orco.attack();
    }
    
}
