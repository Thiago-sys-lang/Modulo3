package testes java script;

public import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LivroTest {

    @Test
    void testLivroGetters() {
        // Criando o autor
        Autor autor = new Autor("Jess", "Brasileira");

        // Criando o livro
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        // Testando os getters
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals("tecnologia", livro1.getCategoria());
        assertTrue(livro1.isDisponivel());
    }

    @Test
    void testDisponibilidade() {
        // Criando o autor
        Autor autor = new Autor("Jess", "Brasileira");

        // Criando outro livro
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        // Testando a disponibilidade
        assertFalse(livro2.isDisponivel());
    }
}
 LivroTest {
    
}
