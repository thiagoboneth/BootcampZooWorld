import java.io.*;

public class EscreveConsulta {

    public void EscreveConsulta(Veterinario veterinario) throws IOException {

        FileOutputStream escreveVeterinario = new FileOutputStream("Consulta.txt");
        OutputStreamWriter gerarLista = new OutputStreamWriter(escreveVeterinario);
        BufferedWriter bw = new BufferedWriter(gerarLista);

        bw.append(veterinario.toString());
        bw.newLine();
        bw.close();
    }

}
