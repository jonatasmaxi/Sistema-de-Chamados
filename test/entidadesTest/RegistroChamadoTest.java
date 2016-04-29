/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesTest;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31411525
 */
public class RegistroChamadoTest {

    @Test
    public void CadastroRegistroChamadoTest() {
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        Tecnico t1 = new Tecnico("Vitoria", 47581525);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 1351848, p1.getNome(), p1.getTelefone());
        Chamado ch = new Chamado(ce1.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t1, ce1, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        RegistroChamado rc = new RegistroChamado("Defeitos na rede", ch, t1);
        assertEquals("Defeitos na rede", rc.getAssunto());
    }

    @Test
    public void editarRegistroChamadoTest() {
        Empresa emp2 = new Empresa(1000, "Mackenzie2");
        Pessoa p2 = new Pessoa("Hugo2", 43569892);
        Tecnico t2 = new Tecnico("Vitoria2", 47581525);
        ClienteEmpresa ce2 = new ClienteEmpresa(456, emp2, 1351848, p2.getNome(), p2.getTelefone());
        Chamado ch2 = new Chamado(ce2.getCodigo(), "Problema2", "Problema tecnicos na internet2", 5, t2, ce2, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        RegistroChamado rc = new RegistroChamado("Defeitos na rede", ch2, t2);
        rc.setAssunto("Assunto alterado");
        assertNotSame("Defeitos na rede",rc.getAssunto());
    }
    
    
    @Test(expected = Exception.class)
    public void verificarSeAssuntoDoRegistroChamadoENuloTest()throws Exception{
        Empresa emp3 = new Empresa(1000, "Mackenzie3");
        Pessoa p3 = new Pessoa("Hugo3", 43569892);
        Tecnico t3 = new Tecnico("Vitoria3", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t3, ce3, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        RegistroChamado rc3 = new RegistroChamado(null, ch3, t3);
    }
    
}
