package entidadesTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entidade.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HugoKeniti
 */
public class PessoaTest {

    @Test
    public void cadastroPessoaTeste() {
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        assertEquals("Hugo", p1.getNome());
        assertEquals(43569892, p1.getTelefone());
    }
    @Test
    public void editarPessoaTest(){
        Pessoa p2 = new Pessoa("Keniti",45876589);
        p2.setNome("Miyatake");
        p2.setTelefone(47541125);
        assertNotSame("Keniti", p2.getNome());
        assertNotSame(45876589,p2.getTelefone());
    }
    @Test
    public void excluirPessoaTest(){
        Pessoa p3 = new Pessoa("Hugo", 43569892);
        //p3.remove();
        Assert.fail("Nao existe um metodo remove para remover uma pessoa");
       
        
    }
    
    @Test
    public void verificarSeNomeDaPessoasPodeSerNuloNuloTest(){
        Pessoa p2 = new Pessoa(null,45876589);
        assertNull(p2.getNome());
        //assertEquals(null, p2.getNome());
    }
    @Test
    public void verificaSeTelefoneDaPessoaPodeSerNegativo(){
        Pessoa p6 = new Pessoa("teste",-1);
        assertTrue(p6.getTelefone()< -1);
        
    }


}
