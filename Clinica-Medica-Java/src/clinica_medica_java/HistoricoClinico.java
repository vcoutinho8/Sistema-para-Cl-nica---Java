/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica_medica_java;

/**
 *
 * @author Lider dev
 */
public class HistoricoClinico {
    private Paciente paciente;
    private String observacoes;

    public HistoricoClinico(Consulta consulta, String observacoes) {
        if (!consulta.isCompareceu()) {
            throw new IllegalStateException("Não registrar histórico sem comparecimento na consulta.");
        }
        if (observacoes == null || observacoes.trim().isEmpty()) {
            throw new IllegalArgumentException("Histórico não aceita texto vazio.");
        }
        this.paciente = consulta.getPaciente();
        this.observacoes = observacoes;
    }
}
