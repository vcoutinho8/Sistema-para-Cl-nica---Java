/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica_medica_java;

public class Medico {
    private String nome;
    private String crm;
    
    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }
    public String getNome(){
        return nome;
    }
}
