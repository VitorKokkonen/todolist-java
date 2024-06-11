import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String arquivo = "src/main/java/arquivo.txt";
        
        try {
            System.out.println("Digite 1 para ler e 2 para escrever");
            int escolha = scan.nextInt();
            
            switch (escolha) {
                case 1:
                    ManipuladorArquivo.lerArquivo(arquivo);
                    break;
                case 2:
                    ManipuladorArquivo.escreverArquivo(arquivo);
                    break;
                default:
                    System.out.println("Invalido");
            }

        } catch (FileNotFoundException e) {
            System.out.printf("Arquivo nao foi encontrado", e.getMessage());
        }
    }
}