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
public class Questao {
    private final String pergunta;
    private final ArrayList<String> alternativas;
    private final int alternativaCorreta; // Índice da alternativa correta (começando de 1)

    public Questao(String pergunta, ArrayList<String> alternativas, int alternativaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    // Método para exibir a questão
    public void exibirQuestao() {
        System.out.println(pergunta);
        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println((i + 1) + ". " + alternativas.get(i));
        }
    }

    // Método para verificar se a alternativa escolhida está correta
    public boolean verificarResposta(int escolhaUsuario) {
        return escolhaUsuario == alternativaCorreta;
    }
}
