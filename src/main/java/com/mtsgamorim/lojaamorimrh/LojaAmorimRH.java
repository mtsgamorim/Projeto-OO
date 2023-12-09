/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mtsgamorim.lojaamorimrh;

import com.mtsgamorim.interfacesGraficas.InterfaceLoginCadastro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

/**
 *
 * Matheus Amorim Garcia Santos - 201765142AC
 */
public class LojaAmorimRH {

    public static void main(String[] args) {
        Usuario adminUser = new Usuario("admin", "admin");
        List<Loja> lojas = new ArrayList<>();
        List<Candidatura> candidaturas = new ArrayList<>();
        List<Colaborador> colaboradores = new ArrayList<>();
        List<ProcessoSeletivo> processosSeletivos = new ArrayList<>();

        InterfaceLoginCadastro interfaceLoginCadastro = new InterfaceLoginCadastro(lojas, candidaturas, colaboradores, processosSeletivos);
        interfaceLoginCadastro.adicionarUsuario(adminUser);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                interfaceLoginCadastro.setVisible(true);
            }
        });
}
}
