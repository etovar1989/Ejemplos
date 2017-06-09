/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.PrimerDesarrolloWeb.JavaBeans.DatosEncuesta;

/**
 *
 * @author etovar
 */

/**
 * Clase que almacenara los datos que bienen del Web Pages index.jsp del formulario que hay alli
 */
public class DatosEncuesta {

    private String nombreCompleto; /*variable que guardara los datos del nombreCompleto*/
    private String [] proLeng; /*arreglo que almacenara los datos de proLeng*/

    /**
     * Geters and Seters
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String[] getProLeng() {
        return proLeng;
    }

    public void setProLeng(String[] proLeng) {
        this.proLeng = proLeng;
    }

    /**
     * Geters and Seters
     */
   
    
}
