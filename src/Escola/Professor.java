package Escola;

public class Professor extends Pessoa{
    private float salario;
    private String disciplina;
    private String area_atuacao;

    @Override
    public void cadastrar() {
        super.cadastrar();
        System.out.println(" Salário:");
        salario = pessoa.nextFloat();
        pessoa.nextLine();
        System.out.println(" Disciplina:");
        disciplina = pessoa.nextLine();
        System.out.println(" Área de atuação:");
        area_atuacao = pessoa.nextLine();
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println(" Salário:"+salario);
        System.out.println(" Disciplina:"+disciplina);
        System.out.println(" Área de atuação:"+area_atuacao);
    }
}
