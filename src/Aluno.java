/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    
    public Aluno(){}
    
    public Aluno(String ra, String nome, String curso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }
    
    
    @Override
    public String toString(){
        return "RA: "+this.ra+"\nNome: "+this.nome+"\nCurso: "+this.curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
