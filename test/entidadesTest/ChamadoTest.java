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
import entidade.Tecnico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31411525
 */
public class ChamadoTest {

    @Test
    public void cadastrarChamadoTest() {
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        Tecnico t1 = new Tecnico("Vitoria", 47581525);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 1351848, p1.getNome(), p1.getTelefone());
        Chamado ch = new Chamado(ce1.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t1, ce1, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");

        assertEquals("Problema", ch.getTitulo());
        assertEquals("Problema tecnicos na internet", ch.getDescricao());
        assertEquals(5, ch.getPrioridade());
        assertEquals("WINDOWS", ch.getSistemaOperacional());
        assertEquals("VISTA", ch.getVersaoSO());
        assertEquals("ADSL", ch.getTipoConexao());
        assertEquals("192.168.2.1", ch.getEnderecoRede());

    }

    @Test
    public void editarChamadoTest() {
        Empresa emp2 = new Empresa(1000, "Mackenzie2");
        Pessoa p2 = new Pessoa("Hugo2", 43569892);
        Tecnico t2 = new Tecnico("Vitoria2", 47581525);
        ClienteEmpresa ce2 = new ClienteEmpresa(456, emp2, 1351848, p2.getNome(), p2.getTelefone());
        Chamado ch2 = new Chamado(ce2.getCodigo(), "Problema", "Problema tecnicos na internet", 5, t2, ce2, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");

        ch2.setTitulo("Solução");
        ch2.setDescricao("Problema nos cabos de comunicação");
        ch2.setPrioridade(7);
        ch2.setSistemaOperacional("MACOS");
        ch2.setVersaoSO("El Captain");
        ch2.setTipoConexao("Radio");
        ch2.setEnderecoRede("192.456.3.2");
        assertNotSame("Problema", ch2.getTitulo());
        assertNotSame("Problema tecnicos na internet", ch2.getDescricao());
        assertNotSame(5, ch2.getPrioridade());
        assertNotSame("WINDOWS", ch2.getSistemaOperacional());
        assertNotSame("VISTA", ch2.getVersaoSO());
        assertNotSame("ADSL", ch2.getTipoConexao());
        assertNotSame("192.168.2.1", ch2.getTipoConexao());

    }

    @Test(expected = Exception.class)
    public void verificarSeTituloDoChamadoENuloTest() throws Exception {
        Empresa emp3 = new Empresa(1000, "Mackenzie3");
        Pessoa p3 = new Pessoa("Hugo3", 43569892);
        Tecnico t3 = new Tecnico("Vitoria3", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), null, "Problema tecnicos na internet", 5, t3, ce3, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        
        
        
    }
    @Test(expected = Exception.class)
    public void verificarSeDescricaoDoChamadoENuloTest() throws Exception {
        Empresa emp3 = new Empresa(1000, "Mackenzie4");
        Pessoa p3 = new Pessoa("Hugo4", 43569892);
        Tecnico t3 = new Tecnico("Vitoria4", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), "Teste4", null, 5, t3, ce3, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        
        
        
    }
    @Test(expected = Exception.class)
    public void verificarSePrioridadeDoChamadoENegativaTest() throws Exception {
        Empresa emp3 = new Empresa(1000, "Mackenzie5");
        Pessoa p3 = new Pessoa("Hugo5", 43569892);
        Tecnico t3 = new Tecnico("Vitoria5", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), "teste5", "Problema tecnicos na internet", -23, t3, ce3, "WINDOWS", "VISTA", "ADSL", "192.168.2.1");
        
        
        
    }
    @Test(expected = Exception.class)
    public void verificarSeNomeSstemaOperacionalDoChamadoENuloTest() throws Exception {
        Empresa emp3 = new Empresa(1000, "Mackenzie6");
        Pessoa p3 = new Pessoa("Hugo6", 43569892);
        Tecnico t3 = new Tecnico("Vitoria6", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), "dsgsdgsdg", "Problema tecnicos na internet", 5, t3, ce3, null, "VISTA", "ADSL", "192.168.2.1");
        
        
        
    }
    
    @Test(expected = Exception.class)
    public void verificarSeVersaoDoSOENuloTest() throws Exception {
        Empresa emp3 = new Empresa(1000, "Mackenzie7");
        Pessoa p3 = new Pessoa("Hugo7", 43569892);
        Tecnico t3 = new Tecnico("Vitoria7", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), "uuheueuhe", "Problema tecnicos na internet", 5, t3, ce3, "WINDOWS", null, "ADSL", "192.168.2.1");
        
        
        
    }
    @Test(expected = Exception.class)
    public void verificarSeTipoDaConexaoENuloTest() throws Exception {
        Empresa emp3 = new Empresa(1000, "Mackenzie3");
        Pessoa p3 = new Pessoa("Hugo3", 43569892);
        Tecnico t3 = new Tecnico("Vitoria3", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), "ueueue", "Problema tecnicos na internet", 5, t3, ce3, "WINDOWS", "VISTA", null, "192.168.2.1");
        
        
        
    }
    @Test(expected = Exception.class)
    public void verificarSeEnderecoDeRedeENuloTest() throws Exception {
        Empresa emp3 = new Empresa(1000, "Mackenzie3");
        Pessoa p3 = new Pessoa("Hugo3", 43569892);
        Tecnico t3 = new Tecnico("Vitoria3", 47581525);
        ClienteEmpresa ce3 = new ClienteEmpresa(456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        Chamado ch3 = new Chamado(ce3.getCodigo(), "euee", "Problema tecnicos na internet", 5, t3, ce3, "WINDOWS", "VISTA", "ADSL", null);
        
        
        
    }

}
