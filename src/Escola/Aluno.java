package Escola;

import java.util.Scanner;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    @Override
    public void cadastrar() {
        super.cadastrar();
        System.out.println(" Matrícula:");
        matricula= pessoa.nextLine();
        System.out.println(" Curso:");
        curso = pessoa.nextLine();
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println(" Matrícula:"+matricula);
        System.out.println(" Curso:"+curso);
    }
}
