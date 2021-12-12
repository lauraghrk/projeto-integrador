import java.util.Scanner;

public abstract class Cadastro {
    private String nome;
    private String telefone;
    private String email;

    public Cadastro() {}

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void ler(Scanner leitor);
    
    public abstract void gravar(); 
}