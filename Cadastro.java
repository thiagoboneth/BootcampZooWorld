import java.io.*;

public class Cadastro {


    public void cadastraMedico(String cpf, String nome, String sobreNome, String numeroRegistro, String especialidade) throws IOException {
        Veterinario veterinario = new Veterinario(cpf,nome,sobreNome,numeroRegistro,especialidade);

        FileOutputStream escreveVeterinario = new FileOutputStream("Veterinario.txt", true);
        OutputStreamWriter gerarLista = new OutputStreamWriter(escreveVeterinario);
        BufferedWriter bw = new BufferedWriter(gerarLista);

        bw.append(veterinario.toString());
        bw.newLine();
        bw.close();
    }
    public void cadastraPaciente(Integer numeroDoPaciente, String especie, String dataDeNascimento, String nome, String cor, String cpfProprietario) throws IOException {
        Paciente paciente = new Paciente(numeroDoPaciente, especie, dataDeNascimento, nome, cor, cpfProprietario);

        FileOutputStream escreveVeterinario = new FileOutputStream("Paciente.txt", true);
        OutputStreamWriter gerarLista = new OutputStreamWriter(escreveVeterinario);
        BufferedWriter bw = new BufferedWriter(gerarLista);

        bw.append(paciente.toString());
        bw.newLine();
        bw.close();
    }

    public void cadastraProprietario(String cpf, String nome, String sobreNome, String dataDeNascimento, String endereco, String telefoneContato) throws IOException {
        Proprietario proprietario = new Proprietario(cpf,nome,sobreNome,dataDeNascimento,endereco,telefoneContato);

        FileOutputStream escreveVeterinario = new FileOutputStream("Proprietario.txt", true);
        OutputStreamWriter gerarLista = new OutputStreamWriter(escreveVeterinario);
        BufferedWriter bw = new BufferedWriter(gerarLista);

        bw.append(proprietario.toString());
        bw.newLine();
        bw.close();
    }

}
