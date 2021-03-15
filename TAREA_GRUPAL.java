/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_grupal;
import helpers.Farmacia;
import helpers.Laboratorio;
/**
 *
 * @Miguel H
 */
public class TAREA_GRUPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
         //////////////////////////////////////////////////instanciamos las clases
        Farmacia farmacia= new Farmacia();
        Laboratorio laboratorio = new Laboratorio();
        
        //////////////////////////  PROPIEDADES PARA LA FARMACIA
        System.out.println("");
        System.out.println(farmacia.obtenerInformacionEdificio());
        farmacia.imprimirInformacionFarmacia();
        
        //////////////////////////  PROPIEDADES PARA EL LABORATORIO
        System.out.println("");
        System.out.println(laboratorio.obtenerInformacionEdificio());
        laboratorio.imprimirInformacionLaboratorio();
    }
    
}
