import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class Fornecedor extends PessoaJuridica {
    private String representante;
    private String tipoProduto;
    private String prazoEntrega;

    public Fornecedor() {}

    public String getRepresentante() {
        return this.representante;
    }
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTipoProduto() {
        return this.tipoProduto;
    }
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getPrazoEntrega() {
        return this.prazoEntrega;
    }
    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public void gravar() {
        try {
            FileWriter fw = new FileWriter("Fornecedores.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Nome: " + this.getNome() + " - ");
            pw.print("Telefone: " + this.getTelefone() + " - ");
            pw.print("Email: " + this.getEmail() + " - ");
            pw.print("Razão social: " + this.getRazaoSocial() + " - ");
            pw.print("CNPJ: " + this.getCNPJ() + " - ");
            pw.print("Ramo: " + this.getRamo() + " - ");
            pw.print("Representante: " + this.getRepresentante() + " - ");
            pw.print("Tipo de produto: " + this.getTipoProduto() + " - ");
            pw.print("Prazo de entrega: " + this.getPrazoEntrega() + " - ");
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

        System.out.println("Digite a razão social: ");
        String razaoSocial = leitor.nextLine();
        setRazaoSocial(razaoSocial);

        System.out.println("Digite o CNPJ: ");
        String CNPJ = leitor.nextLine();
        setCNPJ(CNPJ);

        System.out.println("Digite o ramo: ");
        String ramo = leitor.nextLine();
        setRamo(ramo);

        System.out.println("Digite o nome do representante: ");
        String representante = leitor.nextLine();
        setRepresentante(representante);

        System.out.println("Digite o tipo de produto: ");
        String tipoProduto = leitor.nextLine();
        setTipoProduto(tipoProduto);

        System.out.println("Digite o prazo de entrega: ");
        String prazoEntrega = leitor.nextLine();
        setPrazoEntrega(prazoEntrega);
    }

    public static void listar() {
        System.out.println("-> Lista de fornecedores:");
        try {
            FileReader arq = new FileReader("Fornecedores.txt");
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