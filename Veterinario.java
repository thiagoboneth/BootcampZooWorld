public class Veterinario {
    private String cpf;
    private String nome;
    private String sobreNome;
    private String numeroRegistro;
    private String especialidade;

    public Veterinario(String cpf, String nome, String sobreNome, String numeroRegistro, String especialidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.numeroRegistro = numeroRegistro;
        this.especialidade = especialidade;
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

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", numeroRegistro='" + numeroRegistro + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
