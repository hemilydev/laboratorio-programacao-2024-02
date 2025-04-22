package arquivo; 

import java.io.*; 
import java.util.Scanner; 

public class GerenciarContatos { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        String[] nomes = new String[3]; 
        String[] telefones = new String[3]; 

        // Coleta os dados dos contatos
        for (int i = 0; i < nomes.length; i++) { 
            System.out.print("Digite o nome do contato " + (i + 1) + ": "); 
            nomes[i] = scanner.nextLine(); 

            System.out.print("Digite o telefone do contato " + (i + 1) + ": "); 
            telefones[i] = scanner.nextLine(); 
        } 

        // Altere o caminho abaixo para o local desejado do arquivo .txt
        // Exemplo de caminho em Windows: "C:\\caminho\\para\\contatos.txt"
        // Exemplo de caminho em Linux: "/home/usuario/contatos.txt"
        String caminhoArquivo = "/home/puc/Documentos/contatos.txt"; // <<< Alterar este caminho para onde você deseja salvar o arquivo

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) { 
            // Grava os contatos no arquivo
            for (int i = 0; i < nomes.length; i++) { 
                writer.write(nomes[i] + " - " + telefones[i]); 
                writer.newLine(); 
            } 
            System.out.println("Contatos gravados com sucesso no arquivo."); 
        } catch (IOException e) { 
            System.out.println("Erro ao gravar os contatos: " + e.getMessage()); 
        } 

        String[] nomesLidos = new String[3]; 
        String[] telefonesLidos = new String[3]; 
        int index = 0; 

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) { 
            // Lê os contatos do arquivo
            String linha; 
            while ((linha = reader.readLine()) != null && index < nomesLidos.length) { 
                String[] partes = linha.split(" - "); 
                nomesLidos[index] = partes[0]; 
                telefonesLidos[index] = partes[1]; 
                index++; 
            } 
            System.out.println("Contatos lidos do arquivo com sucesso."); 
        } catch (IOException e) { 
            System.out.println("Erro ao ler os contatos: " + e.getMessage()); 
        } 

        // Exibe os contatos lidos do arquivo
        System.out.println("\nContatos do arquivo:"); 
        for (int i = 0; i < nomesLidos.length; i++) { 
            System.out.println("Nome: " + nomesLidos[i] + ", Telefone: " + telefonesLidos[i]); 
        } 

        scanner.close(); 
    } 
}
