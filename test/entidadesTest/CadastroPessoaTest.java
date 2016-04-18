package entidadesTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entidade.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HugoKeniti
 */
public class CadastroPessoaTest {

    @Test
    public void cadastroPessoaTeste() {
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        assertEquals("Hugo", p1.getNome());
        assertEquals(43569892, p1.getTelefone());
    }

}
