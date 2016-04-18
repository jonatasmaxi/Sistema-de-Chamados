/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesTest;

import entidade.Pessoa;
import entidade.Tecnico;
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
        Pessoa t1 = new Tecnico("Vitoria",47581525);
        t1.setNome("Ana");
        t1.setTelefone(47581530);
        assertNotSame("Vitoria", t1.getNome());
        assertNotSame(47581525, t1.getTelefone());
    }
    
}
