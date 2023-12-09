/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.validadores;

/**
 *
 *  Matheus Amorim Garcia Santos - 201765142AC
 */
public class ValidadorEndereco {
    public static boolean validarCEP(String cep) {
        return cep.matches("\\d{8}"); // Verifica se o CEP contém exatamente 8 dígitos numéricos
    }
}
