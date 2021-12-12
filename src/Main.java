import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        mostrarMenu();

        Scanner leitor = new Scanner(System.in);
        String i = leitor.nextLine();
        int opcao = Integer.valueOf(i);

        while (opcao > 0) {
            switch (opcao) {
            case 1:
                Aluno aluno = new Aluno();
                aluno.ler(leitor);
                aluno.gravar();
                break;

            case 2:
                Professor professor = new Professor();
                professor.ler(leitor);
                professor.gravar();
                break;

            case 3:
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.ler(leitor);
                fornecedor.gravar();
                break;

            case 4:
                Aluno.listar();
                break;

            case 5:
                Professor.listar();
                break;

            case 6:
                Fornecedor.listar();
                break;

            default:
                System.out.println("DIGITE UMA OPÇÃO VÁLIDA!");
                break;
            }
            mostrarMenu();
            i = leitor.nextLine();
            opcao = Integer.valueOf(i);
        }
        
        leitor.close();
    }

    public static void mostrarMenu() {
        System.out.println("---------------------------------------");
        System.out.println("Para cadastrar novo aluno, digite 1;");
        System.out.println("Para cadastrar novo professor, digite 2;");
        System.out.println("Para cadastrar novo fornecedor, digite 3;");
        System.out.println("Para listar os alunos, digite 4;");
        System.out.println("Para listar os professores, digite 5;");
        System.out.println("Para listar os fornecedores, digite 6;");
        System.out.println("Para encerrar, digite 0.");
    }
}