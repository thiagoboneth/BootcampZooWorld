import javax.swing.text.MaskFormatter;

public class Proprietario{

    private String cpf;
    private String nome;
    private String sobreNome;
    private String dataDeNascimento;
    private String endereco;
    private String telefoneContato;

    public Proprietario(String cpf, String nome, String sobreNome, String dataDeNascimento, String endereco, String telefoneContato) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
