import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Listagem listagem = new Listagem();
        Cadastro cadastro = new Cadastro();

        try {
            cadastro.cadastraMedico("123.456.789-20", "Fernando", "Moosher", "252627", "Animais De Fazenda");
            cadastro.cadastraMedico("987.654.321-30", "Thiago", "Boneth", "242527", "Animais De Domesticos");
            cadastro.cadastraPaciente(1, "Cachorro", "25/10/95", "Bigão", "Caramelo", "523.564.235-20");
            cadastro.cadastraProprietario("523.564.235-20", "Geraldo", "Gomes", "24/10/82", "Rua da rua", "48988006598");
            cadastro.EscreveConsulta(1, "987.654.321-30", "12/09/20201", "16:20", "Pulga", "Banho com sabonete anti-pulga");
        } catch (IOException e) {
            System.out.println("Erro");
        }

        listagem.mostraPaciente();
        listagem.mostraconsulta();
        listagem.mostraProprietario();
        listagem.mostraVeterinario();

    }
}
