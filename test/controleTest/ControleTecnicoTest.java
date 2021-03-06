/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import controle.ControleTecnicos;
import controle.IControlador;
import entidade.Tecnico;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.L;
import junit.framework.Assert;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jonatasmaxi
 */
public class ControleTecnicoTest {


    @Test
    public void inserirTecnicoTest() {
        ControleTecnicos controller = new ControleTecnicos();
        Tecnico tecnico = new Tecnico("Julio", 44535651);
        Tecnico inserido = controller.inserir(tecnico.getTelefone(), tecnico.getNome());
        assertTrue(((tecnico.getTelefone() == inserido.getTelefone())) && (tecnico.getNome().equals(inserido.getNome())));

    }

}
