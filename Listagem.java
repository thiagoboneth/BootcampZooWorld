import java.io.*;
import java.util.Scanner;

public class Listagem {

    public void mostraPaciente() throws IOException{

        Scanner scanner = new Scanner(new FileReader("Paciente.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
    public void mostraconsulta() throws IOException{

        Scanner scanner = new Scanner(new FileReader("Consulta.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
    public void mostraProprietario() throws IOException {

        Scanner scanner = new Scanner(new FileReader("Proprietario.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
    public void mostraVeterinario() throws IOException{

        Scanner scanner = new Scanner(new FileReader("Paciente.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
}
