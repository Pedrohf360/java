package projeto;

/**
 *
 * @author Home
 */
public class Funcionario {
    private String nome;
    private String CPF;
    private String Telefone;

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    protected Double salario;

    public Funcionario(String nome, String CPF, String Telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }

    public Double getSalario(){
        return this.salario;
    }
    
    public String getDados()
    {
        return "Nome: " + this.getNome() + "\nTelefone: " + this.getTelefone() + "\nSalário: " + String.format("%.2f", this.getSalario());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
}
