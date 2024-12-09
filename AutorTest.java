package testes java script;

public class AutorTest {
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void testAutorAttributes() {
        Autor autor = new Autor("Alan Turing", "Inglês");

        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());
    }
}

}
