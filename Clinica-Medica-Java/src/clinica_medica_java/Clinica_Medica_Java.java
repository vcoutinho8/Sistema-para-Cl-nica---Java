/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinica_medica_java;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Lider dev
 */
public class Clinica_Medica_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Formatador para deixar a exibição da data bonita
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            System.out.println("=== SISTEMA DE GESTÃO CLÍNICA: CENÁRIO VÁLIDO ===\n");

            // 2. Cadastro de Médico e Paciente
            Medico medico = new Medico("Dra. Beatriz Souza", "CRM/SC 45678");
            Paciente paciente = new Paciente("Marcos Oliveira", "001.222.333-44");

            System.out.println("Médico(a): " + medico.getNome());
            System.out.println("Paciente: " + paciente.getNome());

            // 3. Agendamento de Consulta (Regra: Data no futuro)
            // Agendando para daqui a 3 dias às 14:30
            LocalDateTime dataConsulta = LocalDateTime.now().plusDays(3).withHour(14).withMinute(30);
            Consulta consulta = new Consulta(medico, paciente, dataConsulta);
            
            System.out.println("✅ Consulta agendada para: " + dataConsulta.format(fmt));

            // 4. Solicitação de Exame (Regra: Prazo > 0)
            Exame exame = new Exame("Hemograma Completo", 5);
            System.out.println("✅ Exame solicitado: Hemograma (Prazo: 5 dias)");

            // 5. Registro de Comparecimento (Regra: Obrigatório para o histórico)
            consulta.registrarComparecimento();
            System.out.println("✅ Status: Paciente compareceu à consulta.");

            // 6. Registro de Histórico Clínico (Regra: Texto não vazio e Comparecimento OK)
            String observacoes = "Paciente relata cansaço leve. Exames de rotina solicitados. Retorno em 15 dias.";
            HistoricoClinico historico = new HistoricoClinico(consulta, observacoes);
            
            System.out.println("\n--- RESUMO DO ATENDIMENTO ---");
            System.out.println("Paciente: " + paciente.getNome());
            System.out.println("Médico Responsável: " + medico.getNome());
            System.out.println("Relatório: " + observacoes);
            System.out.println("-----------------------------");
            System.out.println("\n🚀 Processo finalizado com sucesso!");

        } catch (Exception e) {
            // Caso ocorra algum erro inesperado ou violação de regra
            System.err.println("❌ Falha na operação: " + e.getMessage());
        }
    }      
}
