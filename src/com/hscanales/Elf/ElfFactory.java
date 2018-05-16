/*
 * 
 * 
 * 
 */
package com.hscanales.Elf;
import com.hscanales.AbstractInterface;
import com.hscanales.Orc.Orc;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class ElfFactory implements AbstractInterface {

    @Override
    public Elf elfCreator(String type) {
        switch(type){
            case "Archer":
                return new Arquero();
            case "Magician":
                return new Mago();
            case "King":
                return new ReyElfo();
        }
        return null;
    }

    @Override
    public Orc orcReator(String type) {
        return null;
    }
    
}
