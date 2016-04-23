/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import controle.ControleTecnicos;
import controle.IControlador;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author Jonatasmaxi
 */
public class ControleTecnicoTest {

    @Test
    public void inserirTecnicoTest() {
        ControleTecnicos controller = new ControleTecnicos();
        controller.inserir(1230, "Bruno");
        //Método para Recuperação do conteúdo do banco de dados não existe
    }

    @Test(expected = AssertionError.class)
    public void inserirTecnicoDuplicadoTest() {
        ControleTecnicos controller = new ControleTecnicos();
        assertNotNull(controller.inserir(1230, "Bruno"));
        assertNull(controller.inserir(1230, "Bruno"));

    }

    @Test
    public void atualizarTecnicoTest() {
        ControleTecnicos controller = new ControleTecnicos();
        //Método para atualização não existe
    }

    @Test
    public void removerTecnicoTest() {
        ControleTecnicos controller = new ControleTecnicos();
        //Método para remoção não existe
    }
    
    

}
