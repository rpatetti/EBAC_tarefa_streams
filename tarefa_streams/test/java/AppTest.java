
import main.java.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    public static List<Person> filtrarMulheres(List<Person> people) {
        return people.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("female"))
                .collect(Collectors.toList());
    }

    @Test
    public void deveRetornarApenasMulheres() {

    }

    private void assertEquals(int i, int size) {
    }
}
