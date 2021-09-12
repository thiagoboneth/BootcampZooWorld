import java.io.*;
import java.util.Scanner;

public class Listagem {

    public void mostraPaciente() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(new FileReader("Paciente.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
    public void mostraconsulta() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(new FileReader("Consulta.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
    public void mostraProprietario() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(new FileReader("Proprietario.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
    public void mostraVeterinario() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(new FileReader("Paciente.txt")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());

        }

    }
}
