import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> entradas = new ArrayList<>();
        System.out.println("Digite pessoas (nome, Sexo), um por linha.\n Para terminar, digite: 'Fim'");
        
        while (true) {
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("fim")) {
                break;
            }
            entradas.add(linha);
        }
        
        List<Person> people = new ArrayList<>();
            for (String entrada : entradas) {
                String[] partes = entrada.split(",");
                if (partes.length == 2) {
                    String name = partes[0].trim();
                    String gender = partes[1].trim().toLowerCase();
                    people.add(new Person(name, gender));
                }
            }

            List<Person> women = people.stream()
                    .filter(p -> {
                        if (p.getGender().equalsIgnoreCase("Female")) {
                            return true;
                        } else {
                            return false;
                        }
                    })
                    .collect(Collectors.toList());

        System.out.println("Lista de mulheres; ");
        women.forEach(p -> System.out.println(p.getName()));

        scanner.close();
    }
}
