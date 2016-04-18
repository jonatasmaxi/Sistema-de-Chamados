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
public class PessoaTest {

    @Test
    public void cadastroPessoaTeste() {
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        assertEquals("Hugo", p1.getNome());
        assertEquals(43569892, p1.getTelefone());
    }
    @Test
    public void editarPessoa(){
        Pessoa p2 = new Pessoa("Keniti",45876589);
        p2.setNome("Miyatake");
        p2.setTelefone(47541125);
        assertNotSame("Keniti", p2.getNome());
        assertNotSame(45876589,p2.getTelefone());
    }
    @Test
    public void excluirPessoa(){
        Pessoa p3 = new Pessoa("Hugo", 43569892);
        p3 = null;
        assertEquals(p3, null);
       
        
    }
    
    @Test
    public void verificarSeNomeDaPessoasENuloTest(){
        Pessoa p2 = new Pessoa(null,45876589);
        assertEquals(null, p2.getNome());
    }
    @Test
    public void verificaSeTelefoneDaPessoaEDiferenteDe0(){
        Pessoa p6 = new Pessoa("teste",0);
        assertFalse(p6.getTelefone()!= 0);
        
    }
//    public void editarTipoPessoaDeComumParaTecnico(){
//        Pessoa p4 = new Pessoa("Keniti",45876589,"Comum");
//        p4.setTipoPessoa("Tecnico");
//        assertEquals(p4.getTipoPessoa(),"Tecnico");
//    }

}
