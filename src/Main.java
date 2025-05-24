import Escola.Aluno;
import Escola.Professor;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner opcao = new Scanner(System.in);
        do {
            System.out.println("===============Menu===============");
            System.out.println(" 1 - para cadastrar aluno");
            System.out.println(" 2 - para cadastrar professor");
            System.out.println(" 3 - para sair do Programa");

            escolha = opcao.nextInt();

            switch (escolha) {
                case 1:
                    Aluno aluno = new Aluno();
                    aluno.cadastrar();
                    aluno.exibir();
                    break;
                case 2:
                    Professor professor = new Professor();
                    professor.cadastrar();
                    professor.exibir();
                    break;
                default:
                    System.out.println("Saindo do programa...");
                    opcao.close();
                    break;
            }

        }while (escolha>0 && escolha<3);

    }
}