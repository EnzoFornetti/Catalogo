package br.com.bec.screenmaker.principal;

import br.com.bec.screenmaker.excecao.ErroDeConversaoException;
import br.com.bec.screenmaker.modelos.Titulo;
import br.com.bec.screenmaker.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> lista = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("\nDigite um filme para busca: ");
            busca = leitura.nextLine();
            if (busca.equalsIgnoreCase("sair")){
                break;
            }
            String enderco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=df492314";

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(enderco)).build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println("\n" + json + "\n");

                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(tituloOmdb + "\n");

                Titulo titulo = new Titulo(tituloOmdb);
                System.out.println(titulo);
                lista.add(titulo);

            } catch (NumberFormatException e) {

                System.out.println("Erro detectado");
                System.out.println(e.getMessage());

            } catch (ErroDeConversaoException e) {

                System.out.println(e.getMessage());

            }
        }

        System.out.println(lista);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(lista));
        escrita.close();

    }
}
