import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class Aluno extends PessoaFisica {
    private String curso;
    private String semestreIngresso;

    public Aluno() {}

    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestreIngresso() {
        return this.semestreIngresso;
    }
    public void setSemestreIngresso(String semestreIngresso) {
        this.semestreIngresso = semestreIngresso;
    }

    public void ler(Scanner leitor) {
        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();
        setNome(nome);

        System.out.println("Digite o telefone: ");
        String telefone = leitor.nextLine();
        setTelefone(telefone);
        
        System.out.println("Digite o email: ");
        String email = leitor.nextLine();
        setEmail(email);

        System.out.println("Digite o CPF: ");
        String CPF = leitor.nextLine();
        setCPF(CPF);

        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = leitor.nextLine();
        setDataNascimento(dataNascimento);

        System.out.println("Digite a matrícula: ");
        String matricula = leitor.nextLine();
        setMatricula(matricula);

        System.out.println("Digite o curso: ");
        String curso = leitor.nextLine();
        setCurso(curso);

        System.out.println("Digite o semestre de ingresso: ");
        String semestreIngresso = leitor.nextLine();
        setSemestreIngresso(semestreIngresso);
    }

    public void gravar() {
        try {
            FileWriter fw = new FileWriter("Alunos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Nome: " + this.getNome() + " - ");
            pw.print("Telefone: " + this.getTelefone() + " - ");
            pw.print("Email: " + this.getEmail() + " - ");
            pw.print("CPF: " + this.getCPF() + " - ");
            pw.print("Data de nascimento: " + this.getDataNascimento() + " - ");
            pw.print("Matrícula: " + this.getMatricula() + " - ");
            pw.print("Curso: " + this.getCurso() + " - ");
            pw.print("Semestre de ingresso: " + this.getSemestreIngresso() + " - ");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listar() {
        System.out.println("-> Lista de alunos:");
        try {
            FileReader arq = new FileReader("Alunos.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.out.println("Não há dados cadastrados!");
        }
    }
}