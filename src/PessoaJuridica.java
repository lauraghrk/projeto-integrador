public abstract class PessoaJuridica extends Cadastro {
    private String razaoSocial;
    private String CNPJ;
    private String ramo;

    public PessoaJuridica() {}

    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRamo() {
        return this.ramo;
    }
    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}