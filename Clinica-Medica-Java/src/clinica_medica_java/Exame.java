/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica_medica_java;

public class Exame {
    private String nome;
    private int prazoDias;

    public Exame(String nome, int prazoDias) {
        if (prazoDias <= 0) {
            throw new IllegalArgumentException("O prazo do exame deve ser maior que zero.");
        }
        this.nome = nome;
        this.prazoDias = prazoDias;
    }
}
