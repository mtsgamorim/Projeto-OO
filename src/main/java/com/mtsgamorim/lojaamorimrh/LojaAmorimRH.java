/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mtsgamorim.lojaamorimrh;

import interfacesGraficas.InterfaceLoginCadastro;
import javax.swing.SwingUtilities;

/**
 *
 * @author Usuario
 */
public class LojaAmorimRH {

    public static void main(String[] args) {
    // Criar usuário admin com senha admin
    Usuario adminUser = new Usuario("admin", "admin");

    // Criar a interface e adicionar o usuário admin
    InterfaceLoginCadastro interfaceLoginCadastro = new InterfaceLoginCadastro();
    interfaceLoginCadastro.adicionarUsuario(adminUser);

    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            interfaceLoginCadastro.setVisible(true);
        }
    });
}
}
