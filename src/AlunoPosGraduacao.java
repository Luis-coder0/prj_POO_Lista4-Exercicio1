/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;
    
    public AlunoPosGraduacao(){}
    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusao){
        super.setRa(ra);
        super.setNome(nome);
        super.setCurso(curso);
        this.anoConclusaoGraduacao = anoConclusao;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nAno de conclusão do ensino médio: "+this.anoConclusaoGraduacao;
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
}
