package testes java script;

public import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    @Test
    void testEmprestimoAttributes() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    void testEmprestimoValidations() {
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", false);
        Usuario usuario = new Usuario("Gabriel", 21);

        assertThrows(IllegalStateException.class, () -> {
            new Emprestimo(new Date(), new Date(), livro, usuario);
        });
    }
}
 EmprestimoTest {
    
}
