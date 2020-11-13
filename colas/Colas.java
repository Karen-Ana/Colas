/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Ana Karen
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lec= new Scanner (System.in);
        int opc;
        do{
        System.out.println("1 Abecedario\n"+
                "2 Abecedario aleatorio \n"+
                "3 Suma de pilas\n"+
                "4 Salir");
        opc=lec.nextInt();
        switch (opc){
            
            case 1:
                Pilas.main(args);
                break;
            case 2:
                Pilas4.main(args);
                break;
                
            case 3:
                PilaABC.main(args);
                break;

        }
        }while(opc!=4);
    } 
    
}
