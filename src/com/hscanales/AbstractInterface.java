/*
 * 
 * 
 * 
 */
package com.hscanales;
import com.hscanales.Elf.Elf;
import com.hscanales.Orc.*;
/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public interface AbstractInterface {
    Elf elfCreator(String type);
    Orc orcReator(String type);
    
    
}
