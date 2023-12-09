/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.Etapas;

/**
 * Matheus Amorim Garcia Santos - 201765142AC
 * 
 */
public class EtapasProcessoSeletivo {
    private String etapaAtual;

    public EtapasProcessoSeletivo() {
        this.etapaAtual = "Entrevista Inicial";
    }

    public void avancarEtapa() {

        if (etapaAtual.equals("Entrevista Inicial")) {
            etapaAtual = "Prova Técnica";
        } else if (etapaAtual.equals("Prova Técnica")) {
            etapaAtual = "Entrevista Final";
        } else if (etapaAtual.equals("Entrevista Final")) {
            etapaAtual = "Oferta";
        } else {
            etapaAtual = "Processo Concluído";
        }
     }

    public String getEtapaAtual() {
        return etapaAtual;
    }

    @Override
    public String toString() {
        return "etapaAtual= " + etapaAtual;
    }

    public void setEtapaAtual(String etapaAtual) {
        this.etapaAtual = etapaAtual;
    }
}
