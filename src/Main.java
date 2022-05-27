/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Aluno> listaAlunos = new ArrayList();
        int intEscolha = 0;
        
        while(intEscolha != 3){
            intEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre as opções no menu: \n1- Inserir Aluno\n2-Exibir Aluno\n3- Sair"));
            switch(intEscolha){
                case 1:
                    String raAluno;
                    String nomeAluno;
                    String cursoAluno;
                    String anoConclusao;
                    switch(Integer.parseInt(JOptionPane.showInputDialog("1- Aluno Graduação\n2- Aluno Pós Graduação"))){
                        case 1:
                            raAluno = JOptionPane.showInputDialog(null, "Digite o RA do aluno");
                            nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
                            cursoAluno = JOptionPane.showInputDialog(null, "Digite o curso do aluno");
                            anoConclusao = JOptionPane.showInputDialog(null, "Digite o ano de conclusão do ensino médio");
                            AlunoGraduacao AlunoGraduacao = new AlunoGraduacao(raAluno, nomeAluno, cursoAluno, anoConclusao);
                            listaAlunos.add(AlunoGraduacao);
                            break;
                            
                        case 2:
                            raAluno = JOptionPane.showInputDialog(null, "Digite o RA do aluno");
                            nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
                            cursoAluno = JOptionPane.showInputDialog(null, "Digite o curso do aluno");
                            anoConclusao = JOptionPane.showInputDialog(null, "Digite o ano de conclusão da graduação");
                            AlunoPosGraduacao AlunoPosGraduacao = new AlunoPosGraduacao(raAluno, nomeAluno, cursoAluno, anoConclusao);
                            listaAlunos.add(AlunoPosGraduacao);
                            break;
                            
                    }
                    break;
                case 2:
                    String raBusca;
                    raBusca = JOptionPane.showInputDialog(null, "Digite o RA do aluno que deseja exibir");
                    for(Aluno alunoAtual : listaAlunos){
                        if(alunoAtual.getRa().equals(raBusca)){
                            JOptionPane.showMessageDialog(null, "Segue o aluno buscado: \n"+alunoAtual.toString());
                        }
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Finalizando");
                    break;
            }
        }
    }    
}
