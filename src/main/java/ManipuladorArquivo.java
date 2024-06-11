import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ManipuladorArquivo {

    public static void lerArquivo(String nomeArquivo) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(nomeArquivo));

        String linha = "";

        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;

            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escreverArquivo(String nomeArquivo) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivo, true));
        ArrayList<String> tasks = new ArrayList<String>();

        String linha = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Digite algo para adicionar");

        linha = in.nextLine();
        tasks.add(linha);

        for (String task : tasks) {
            bufferedWriter.append(task + "\n");
        }

        bufferedWriter.close();
        in.close();
    }
}
