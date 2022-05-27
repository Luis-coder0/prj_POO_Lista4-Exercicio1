/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class AlunoGraduacao extends Aluno {
    private String anoConclusaoEnsinoMedio;
    
    public AlunoGraduacao(){}
    
    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusao){
        super.setRa(ra);
        super.setNome(nome);
        super.setCurso(curso);
        this.anoConclusaoEnsinoMedio = anoConclusao;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nAno de conclusão do ensino médio: "+this.anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
}
