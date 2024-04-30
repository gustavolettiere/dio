package candidatura;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"GUSTAVO", "LETTIERE", "VASCONCELOS", "SANTOS"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }


    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuar = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuar = !atendeu;
            if (continuar){
                tentativasRealizadas++;
            }else {
                System.out.println("Atendeu!");
            }

        } while(continuar && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Contato realizado com sucesso com " + candidato + " na " + tentativasRealizadas + "ª tentativa");
        }else {
            System.out.println("Não conseguimos contato com " + candidato + ", excedendo o máximo de tentativas.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(ArrayList<String> funcionariosSelecionados){
        System.out.println("Imprimindo candidatos selecionados");
        for (String funcionario : funcionariosSelecionados){
            System.out.println(funcionario);
        }
    }


    static void selecaoCandidatos() {
        String [] candidatos = {"Gustavo", "Lettiere", "Sabrina", "Sandro", "Daniela", "Joaquim", "Nice", "Josuel", "Italo"};
        ArrayList<String> funcionariosSelecionados = new ArrayList<>();
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1800,2200);



            System.out.println("O candidato " + candidato + " sugeriu o valor " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                funcionariosSelecionados.add(candidato);
                candidatosSelecionados++;

            }
            candidatoAtual++;
        }
        imprimirSelecionados(funcionariosSelecionados);
    }




    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }

    }

}
