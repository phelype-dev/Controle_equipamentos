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
public class TransportadoraBeans {
    private int id_trans;
    private String Transportadora;

    /**
     * @return the id_trans
     */
    public int getId_trans() {
        return id_trans;
    }

    /**
     * @param id_trans the id_trans to set
     */
    public void setId_trans(int id_trans) {
        this.id_trans = id_trans;
    }

    /**
     * @return the Transportadora
     */
    public String getTransportadora() {
        return Transportadora;
    }

    /**
     * @param Transportadora the Transportadora to set
     */
    public void setTransportadora(String Transportadora) {
        this.Transportadora = Transportadora;
    }

    @Override
    public String toString() {
        return getTransportadora();
    }
    
    
    
}
