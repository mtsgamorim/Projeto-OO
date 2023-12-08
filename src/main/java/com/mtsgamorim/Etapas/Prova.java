/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.Etapas;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Prova {
    private final ArrayList<Questao> questoes;

    public Prova() {
        this.questoes = new ArrayList<>();
    }

    // Método para adicionar uma questão à prova
    public void adicionarQuestao(String pergunta, ArrayList<String> alternativas, int alternativaCorreta) {
        Questao questao = new Questao(pergunta, alternativas, alternativaCorreta);
        questoes.add(questao);
    }

    // Método para exibir todas as questões da prova
    public void exibirProva() {
        for (int i = 0; i < questoes.size(); i++) {
            System.out.println("\nQuestão " + (i + 1) + ":");
            questoes.get(i).exibirQuestao();
        }
    }

    // Método para verificar a resposta do usuário para uma questão específica
    public boolean verificarRespostaUsuario(int numeroQuestao, int escolhaUsuario) {
        // Verifica se a questão existe
        if (numeroQuestao >= 1 && numeroQuestao <= questoes.size()) {
            Questao questao = questoes.get(numeroQuestao - 1);
            return questao.verificarResposta(escolhaUsuario);
        } else {
            System.out.println("Questão inválida.");
            return false;
        }
    }

    // Método para calcular a porcentagem de acertos do aluno
    public double calcularPorcentagemAcertos(ArrayList<Integer> respostasUsuario) {
        if (respostasUsuario.size() != questoes.size()) {
            System.out.println("Número de respostas não corresponde ao número de questões.");
            return 0.0;
        }

        int acertos = 0;
        for (int i = 0; i < questoes.size(); i++) {
            if (verificarRespostaUsuario(i + 1, respostasUsuario.get(i))) {
                acertos++;
            }
        }

        return (double) acertos / questoes.size() * 100;
    }

    // Método para verificar se o aluno foi aprovado ou reprovado
    public void verificarAprovacao(ArrayList<Integer> respostasUsuario) {
        double porcentagemAcertos = calcularPorcentagemAcertos(respostasUsuario);

        System.out.println("\nPorcentagem de acertos: " + porcentagemAcertos + "%");

        if (porcentagemAcertos >= 60.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }
    }
}

