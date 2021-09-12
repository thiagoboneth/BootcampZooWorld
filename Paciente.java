public class Paciente {
    private Integer numeroDoPaciente;
    private String especie;
    private String dataDeNascimento;
    private String nome;
    private String cor;
    private String cpfProprietario;

    public Paciente(Integer numeroDoPaciente, String especie, String dataDeNascimento, String nome, String cor, String cpfProprietario) {
        this.numeroDoPaciente = numeroDoPaciente;
        this.especie = especie;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
        this.cor = cor;
        this.cpfProprietario = cpfProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }

    public Integer getNumeroDoPaciente() {
        return numeroDoPaciente;
    }

    public void setNumeroDoPaciente(Integer numeroDoPaciente) {
        this.numeroDoPaciente = numeroDoPaciente;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "numeroDoPaciente=" + numeroDoPaciente +
                ", especie='" + especie + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", cpfProprietario='" + cpfProprietario + '\'' +
                '}';
    }
}
