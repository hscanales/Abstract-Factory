/*
 * 
 * 
 * 
 */
package com.hscanales;

import com.hscanales.Elf.ElfFactory;
import com.hscanales.Orc.OrcFactory;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class FactoryProducer {
    public static AbstractInterface getFactory(String type){
        switch(type){
            case "orc":
                return new OrcFactory();
            case "elf":
                return new ElfFactory();
        }
        return null;
    }
}
