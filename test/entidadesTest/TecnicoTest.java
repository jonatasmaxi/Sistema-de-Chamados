/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesTest;

import entidade.Pessoa;
import entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31411525
 */
public class TecnicoTest {
    
    @Test
    public void cadastrarTecnicoTest() {
        Pessoa t1 = new Tecnico("Vitoria",47581525);
        assertEquals("Vitoria", t1.getNome());
        assertEquals(47581525, t1.getTelefone());
    }
    @Test
    public void editarTecnicoTest(){
        Pessoa t2 = new Tecnico("Vitoria",47581525);
        t2.setNome("Ana");
        t2.setTelefone(47581530);
        assertNotSame("Vitoria", t2.getNome());
        assertNotSame(47581525, t2.getTelefone());
    }
    
    
    @Test(expected = Exception.class)
    public void verificarSeNomeDoTecnicoPodeSerNuloNuloTest()throws Exception{
        Pessoa t4 = new Tecnico(null,47581525);
        //assertNull(t4.getNome());
    }
    @Test(expected = Exception.class)
    public void verificaSeTelefoneDoTecnicoPodeSerNegativo()throws Exception{
        Pessoa t5 = new Tecnico("Vitoria",-1);
        //assertTrue(t5.getTelefone()< 0);
    }
    
}
