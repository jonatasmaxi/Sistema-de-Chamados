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
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        Tecnico t1 = new Tecnico("Vitoria", 47581525);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 1351848, p1.getNome(), p1.getTelefone());
        Chamado ch = new Chamado(ce1.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t1, ce1, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        RegistroChamado rc = new RegistroChamado("Defeitos na rede", ch, t1);
        rc.setAssunto("Assunto alterado");
        assertNotSame("Defeitos na rede",rc.getAssunto());
    }

}
