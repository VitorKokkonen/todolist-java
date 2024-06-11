import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite 1 para ler e 2 para escrever");
            int escolha = scan.nextInt();
            
            switch (escolha) {
                case 1:
                    ManipuladorArquivo.lerArquivo("src/main/java/arquivo.txt");
                    break;
                case 2:
                    ManipuladorArquivo.escreverArquivo("src/main/java/arquivo.txt");
                    break;
                default:
                    System.out.println("Invalido");
            }

        } catch (FileNotFoundException e) {
            System.out.printf("Arquivo nao foi encontrado", e.getMessage());
        }
    }
}