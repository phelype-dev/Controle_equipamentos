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
public class EmpresaBeans {
    private int id_emp;
    private String empresa;
    private String endereco;
    private String uf;

    /**
     * @return the id_emp
     */
    public int getId_emp() {
        return id_emp;
    }

    /**
     * @param id_emp the id_emp to set
     */
    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return getEmpresa();
    }
}