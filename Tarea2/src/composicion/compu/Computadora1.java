/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion.compu;
import ico.fes.componentes.*;

/**
 *
 * @author windos8.1
 */
public class Computadora1 {
     public static void main(String[] args) {
     

        Monitor monitor1= new Monitor("Hp","Gamer",15);
        Teclado teclado1=new Teclado("Logitech","AD80HW",43,14);
        Mouse mouse1=new Mouse("Logitech","MK120","Inalambrico");
        CPU cpu1=new CPU("Intel","Corei7",3000);
        Computadora ComputadoraAlAzar=new Computadora("Huawei","MateStation S 53011VHL",monitor1,mouse1,teclado1,cpu1);
        
        System.out.println(ComputadoraAlAzar);
    }
}
        
    
