/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.interfacesGraficas;

import com.mtsgamorim.enderecos.EnderecoResidencial;
import com.mtsgamorim.lojaamorimrh.Candidatura;
import com.mtsgamorim.lojaamorimrh.ProcessoSeletivo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

// Matheus Amorim Garcia Santos - 201765142AC

public class MenuUsuarioComum extends JFrame implements Logout {
    private List<ProcessoSeletivo> processosSeletivos;
    private DefaultListModel<ProcessoSeletivo> processosSeletivosListModel;
    private List<Candidatura> candidaturas;
    private DefaultListModel<Candidatura> candidaturasListModel;

    public MenuUsuarioComum(List<ProcessoSeletivo> processosSeletivos, List<Candidatura> candidaturas){
        this.processosSeletivos = processosSeletivos;
        processosSeletivosListModel = new DefaultListModel<>();
        for (int i = 0; i < processosSeletivos.size(); i++) {
            this.processosSeletivosListModel.addElement(processosSeletivos.get(i));
        }
        
        this.candidaturas = candidaturas;
        candidaturasListModel = new DefaultListModel<>();
        for (int i = 0; i < candidaturas.size(); i++) {
            this.candidaturasListModel.addElement(candidaturas.get(i));
        }

        setTitle("Menu do Usuário Comum");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JList<ProcessoSeletivo> processosJList = new JList<>(processosSeletivosListModel);

        JScrollPane scrollPane = new JScrollPane(processosJList);

        JButton btnInscrever = new JButton("Inscrever em Processo");
        btnInscrever.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inscreverEmProcesso(processosJList.getSelectedValue());
            }
        });

        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fazerLogout();
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(btnInscrever, BorderLayout.EAST);
        panel.add(btnLogout, BorderLayout.SOUTH);

        getContentPane().add(panel);
    }

    @Override
    public void fazerLogout() {
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente fazer logout?", "Confirmar Logout", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    private void inscreverEmProcesso(ProcessoSeletivo processoSeletivo) {
        if (processoSeletivo != null) {
            Candidatura candidatura = criarCandidatura(processoSeletivo);

            candidaturas.add(candidatura);
            candidaturasListModel.addElement(candidatura);

            JOptionPane.showMessageDialog(this, "Inscrição realizada com sucesso:\n" + candidatura);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um processo seletivo para se inscrever.");
        }
    }

    private Candidatura criarCandidatura(ProcessoSeletivo processoSeletivo) {
        String nome = JOptionPane.showInputDialog(this, "Digite seu nome:");
        String idadeStr = JOptionPane.showInputDialog(this, "Digite sua idade:");
        int idade = Integer.parseInt(idadeStr);
        String cpf = JOptionPane.showInputDialog(this, "Digite seu CPF:");
        String telefone = JOptionPane.showInputDialog(this, "Digite seu Telefone:");

        EnderecoResidencial endereco = new EnderecoResidencial("12345-678", "Cidade", "Estado");

        String cargo = processoSeletivo.getCargo();

        Candidatura candidatura = new Candidatura(nome, idade, cpf, endereco, telefone, cargo, new Date());

        return candidatura;
    }
}