/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaTest;

import Persistencia.TecnicoDAO;
import controleTest.ControleTecnicoTest;
import entidade.Tecnico;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jonatasmaxi
 */
public class TecnicoDAOTest {



    @Test
    public void persistirTecnicoTest() {
        Tecnico tecnico = new Tecnico("Caio", 44516654);
        TecnicoDAO tecnicodao = new TecnicoDAO();
        tecnicodao.put(tecnico);
        Tecnico inserido = tecnicodao.get(tecnicodao.voltaCashTecnico().size() );
        assertTrue(((tecnico.getTelefone() == inserido.getTelefone())) && (tecnico.getNome().equals(inserido.getNome())));
    }
    
    @Before
    public void zerarBancoTeste(){
        
    }

}
