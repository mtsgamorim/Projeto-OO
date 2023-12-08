/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String login;
    private String senha;
    private boolean isAdmin;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.isAdmin = login.equals("admin") && senha.equals("admin");
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
