/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipi.ekata;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author glassfish | Saipi Ramli
 */
public class Tanggal {
    
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        //c.setTime(new Date());
        c.set(2013,0,31);
        System.out.println("sekarang "+c.getTime());
        c.add(Calendar.MONTH, 1);
        
        System.out.println("nanti "+c.getTime());
        
    }
    
}
