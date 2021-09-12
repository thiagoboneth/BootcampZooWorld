public class CriaConsulta {
    private Integer idPaciente;
    private String cpfVeterinario;
    private String dataConsulta;
    private String horaConsulta;
    private String diagnostico;
    private String tratamento;

    public CriaConsulta(Integer idPaciente, String cpfVeterinario, String dataConsulta, String horaConsulta, String diagnostico, String tratamento) {
        this.idPaciente = idPaciente;
        this.cpfVeterinario = cpfVeterinario;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getCpfVeterinario() {
        return cpfVeterinario;
    }

    public void setCpfVeterinario(String cpfVeterinario) {
        this.cpfVeterinario = cpfVeterinario;
    }

    @Override
    public String toString() {
        return "CriaConsulta{" +
                "idPaciente=" + idPaciente +
                ", cpfVeterinario='" + cpfVeterinario + '\'' +
                ", dataConsulta='" + dataConsulta + '\'' +
                ", horaConsulta='" + horaConsulta + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamento='" + tratamento + '\'' +
                '}';
    }
}
