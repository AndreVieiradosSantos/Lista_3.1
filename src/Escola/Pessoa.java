package Escola;

import java.util.Scanner;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    Scanner pessoa = new Scanner(System.in);
    public void cadastrar(){
        System.out.println(" Digite o nome:");
        nome = pessoa.nextLine();
        System.out.println(" Idade:");
        idade = pessoa.nextInt();
        pessoa.nextLine();
        System.out.println(" Cpf:");
        cpf = pessoa.nextLine();
        System.out.println(" Endereço:");
        endereco = pessoa.nextLine();
    }
    public void exibir(){
        System.out.println(" Nome:"+nome);
        System.out.println(" Idade:"+idade);
        System.out.println(" Cpf:"+cpf);
        System.out.println(" Endereço:"+endereco);
    }
}
