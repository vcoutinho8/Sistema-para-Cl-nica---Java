/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica_medica_java;
import java.time.LocalDateTime;
/**
 *
 * @author Lider dev
 */
public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private LocalDateTime data;
    private boolean compareceu = false;

    public Consulta(Medico medico, Paciente paciente, LocalDateTime data) {
        if (data.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Consulta não pode ser marcada no passado.");
        }
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public void registrarComparecimento() {
        this.compareceu = true;
    }

    public boolean isCompareceu() { 
        return compareceu; 
    }
    public Paciente getPaciente() { 
        return paciente; 
    }
}
