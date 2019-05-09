/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author phelype
 */
public class MarcaImpBeans {
    
    private int id_mdi;
    private String marcaImp;

    /**
     * @return the id_mdi
     */
    public int getId_mdi() {
        return id_mdi;
    }

    /**
     * @param id_mdi the id_mdi to set
     */
    public void setId_mdi(int id_mdi) {
        this.id_mdi = id_mdi;
    }

    /**
     * @return the marcaImp
     */
    public String getMarcaImp() {
        return marcaImp;
    }

    /**
     * @param marcaImp the marcaImp to set
     */
    public void setMarcaImp(String marcaImp) {
        this.marcaImp = marcaImp;
    }

    @Override
    public String toString() {
        return getMarcaImp();
    }
}