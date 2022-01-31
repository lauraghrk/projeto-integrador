import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Professor extends PessoaFisica {
    private String departamento;
    private String salario;

    public Professor() {}

    public String getDepartamento() {
        return this.departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSalario() {
        return this.salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void gravar() {
        try {
            FileWriter fw = new FileWriter("Professores.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Nome: " + this.getNome() + " - ");
            pw.print("Telefone: " + this.getTelefone() + " - ");
            pw.print("Email: " + this.getEmail() + " - ");
            pw.print("CPF: " + this.getCPF() + " - ");
            pw.print("Data de nascimento: " + this.getDataNascimento() + " - ");
            pw.print("Matrícula: " + this.getMatricula() + " - ");
            pw.print("Departamento: " + this.getDepartamento() + " - ");
            pw.print("Salário: " + this.getSalario());
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

        System.out.println("Digite o departamento: ");
        String departamento = leitor.nextLine();
        setDepartamento(departamento);;

        System.out.println("Digite o salário: ");
        String salario = leitor.nextLine();
        setSalario(salario);
    }

    public static void listar() {
        System.out.println("-> Lista de professores:");
        try {
            FileReader arq = new FileReader("Professores.txt");
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