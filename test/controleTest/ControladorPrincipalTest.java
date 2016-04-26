/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import controle.ControladorPrincipal;
import junit.framework.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author 41404998
 */
public class ControladorPrincipalTest {

    @Test
    public void incializacaoTest() {
        ControladorPrincipal controller = new ControladorPrincipal();
        assertNotNull(controller.getCtrChamados());
        assertNotNull(controller.getCtrClientes());
        assertNotNull(controller.getCtrEmpresa());
        assertNotNull(controller.getCtrTecnicos());
        
    }
}
