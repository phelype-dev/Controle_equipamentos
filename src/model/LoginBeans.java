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
public class LoginBeans {
    
    private int id_login;
    private String login;
    private String password;
    private boolean ativo;

    /**
     * @return the id_login
     */
    public int getId_login() {
        return id_login;
    }

    /**
     * @param id_login the id_login to set
     */
    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return getLogin();
    }
    
    
    
}
