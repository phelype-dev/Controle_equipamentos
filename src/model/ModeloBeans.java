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
public class ModeloBeans {
    
    private int id_mdm;
    private String modeloImp;

    /**
     * @return the id_mdm
     */
    public int getId_mdm() {
        return id_mdm;
    }

    /**
     * @param id_mdm the id_mdm to set
     */
    public void setId_mdm(int id_mdm) {
        this.id_mdm = id_mdm;
    }

    /**
     * @return the modeloImp
     */
    public String getModeloImp() {
        return modeloImp;
    }

    /**
     * @param modeloImp the modeloImp to set
     */
    public void setModeloImp(String modeloImp) {
        this.modeloImp = modeloImp;
    }

    @Override
    public String toString() {
        return getModeloImp();
    }
    
    
}
