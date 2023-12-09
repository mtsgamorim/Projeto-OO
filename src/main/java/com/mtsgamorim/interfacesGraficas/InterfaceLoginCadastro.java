/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.interfacesGraficas;

import com.mtsgamorim.lojaamorimrh.Candidatura;
import com.mtsgamorim.lojaamorimrh.Colaborador;
import com.mtsgamorim.lojaamorimrh.Loja;
import com.mtsgamorim.lojaamorimrh.ProcessoSeletivo;
import com.mtsgamorim.lojaamorimrh.Usuario;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * Matheus Amorim Garcia Santos - 201765142AC
 */
public class InterfaceLoginCadastro extends JFrame {
    private List<Usuario> usuarios;
    private List<Loja> lojas;
    private List<Candidatura> candidaturas;
    private List<Colaborador> colaboradores;
    private List<ProcessoSeletivo> processosSeletivos;

    private JTextField txtLogin;
    private JPasswordField txtSenha;

    public InterfaceLoginCadastro(List<Loja> lojas, List<Candidatura> candidaturas, List<Colaborador> colaboradores, List<ProcessoSeletivo> processosSeletivos) {
        usuarios = new ArrayList<>();
        this.lojas = lojas;
        this.candidaturas = candidaturas;
        this.colaboradores = colaboradores;
        this.processosSeletivos = processosSeletivos;
 
        setTitle("Login e Cadastro");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblLogin = new JLabel("Login:");
        JLabel lblSenha = new JLabel("Senha:");
        txtLogin = new JTextField(15);
        txtSenha = new JPasswordField(15);
        JButton btnLogin = new JButton("Login");
        JButton btnCadastrar = new JButton("Cadastrar");

        setLayout(new GridLayout(3, 2, 0, 10));

        add(lblLogin);
        add(txtLogin);
        add(lblSenha);
        add(txtSenha);
        add(btnLogin);
        add(btnCadastrar);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarCadastro();
            }
        });
    }

    private void realizarLogin() {
        String login = txtLogin.getText();
        String senha = new String(txtSenha.getPassword());

        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                if (usuario.isAdmin()) {
                    JOptionPane.showMessageDialog(this, "Login bem-sucedido! Usuário é um administrador.");

                    // Abrir a nova janela do menu administrativo
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            MenuAdmin menuAdmin = new MenuAdmin(lojas, candidaturas, colaboradores, processosSeletivos);
                            menuAdmin.setVisible(true);
                        }
                    });
                } else {
                    JOptionPane.showMessageDialog(this, "Login bem-sucedido!");

                    // Abrir a nova janela do menu do usuário comum
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            MenuUsuarioComum menuUsuarioComum = new MenuUsuarioComum(processosSeletivos, candidaturas);
                            menuUsuarioComum.setVisible(true);
                        }
                    });
                }
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
}

    private void realizarCadastro() {
        String login = txtLogin.getText();
        String senha = new String(txtSenha.getPassword());

        if (login.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login)) {
                JOptionPane.showMessageDialog(this, "Este login já está em uso.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        Usuario novoUsuario = new Usuario(login, senha);
        usuarios.add(novoUsuario);

        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
    }
    
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
