/*
 * 
 * 
 * 
 */
package com.hscanales.Orc;

import com.hscanales.AbstractInterface;
import com.hscanales.Elf.Elf;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class OrcFactory implements AbstractInterface {

    @Override
    public Elf elfCreator(String type) {
        return null;
    }

    @Override
    public Orc orcReator(String type) {
        switch (type) {
            case "Lanzador":
                return new Lanzador();
            case "Wizard":
                return new Hechizero();
            case "Beast":
                return new Beast();
        }
        return null;
    }

}
