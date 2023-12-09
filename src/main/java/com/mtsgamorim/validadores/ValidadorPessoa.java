/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.validadores;

/**
 *
 * Matheus Amorim Garcia Santos - 201765142AC
 */
public class ValidadorPessoa {

    public static boolean validarIdade(int idade) {
        return idade > 18 && idade < 150;
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{11}"); // Verifica se o CPF contém exatamente 11 dígitos numéricos
    }

    public static boolean validarTelefone(String telefone) {
        return telefone.matches("\\d+"); // Verifica se o telefone contém apenas dígitos numéricos
    }
}
