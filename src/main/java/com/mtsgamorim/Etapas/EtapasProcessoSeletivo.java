/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.Etapas;

/**
 *
 * @author Usuario
 */
public class EtapasProcessoSeletivo implements Avaliavel {
    private String etapaAtual;
    private boolean reprovado;

    public EtapasProcessoSeletivo() {
        this.etapaAtual = "Entrevista Inicial";
        this.reprovado = false;
    }

    // Método para avançar para a próxima etapa
    public void avancarEtapa() {
         if (!reprovado) {
             // Lógica para avançar para a próxima etapa
             // (pode incluir verificação de condições, etc.)
             if (etapaAtual.equals("Entrevista Inicial")) {
                 etapaAtual = "Prova Técnica";
             } else if (etapaAtual.equals("Prova Técnica")) {
                 etapaAtual = "Entrevista Final";
             } else if (etapaAtual.equals("Entrevista Final")) {
                 etapaAtual = "Oferta";
             } else {
                 etapaAtual = "Processo Concluído";
             }

             // Lógica para verificar se foi reprovado em alguma etapa
             if (etapaAtual.equals("REPROVADO")) {
                 reprovado = true;
             }
         }
     }

    // Método para realizar avaliação
    @Override
    public void realizarAvaliacao() {
        System.out.println("Realizando avaliação na etapa: " + etapaAtual);
        // Lógica específica para cada etapa de avaliação
    }

    // Método para obter a etapa atual
    public String getEtapaAtual() {
        return etapaAtual;
    }

    // Método toString para exibir informações da classe
    @Override
    public String toString() {
        return "EtapasProcessoSeletivo{" +
                "etapaAtual='" + etapaAtual + '\'' +
                '}';
    }
}
