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
    public void cadastrarChamadoTest(){
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        Tecnico t1 = new Tecnico("Vitoria",47581525);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 1351848, p1.getNome(), p1.getTelefone());
        Chamado ch = new Chamado(ce1.getCodigo(),"Problema","Problema tecnicos na internet",5,t1,ce1,"WINDOWS","VISTA","ADSL","192.168.2.1");
        
        assertEquals("Problema",ch.getTitulo());
        assertEquals("Problema tecnicos na internet",ch.getDescricao());
        assertEquals(5,ch.getPrioridade());
        assertEquals("WINDOWS",ch.getSistemaOperacional());
        assertEquals("VISTA",ch.getVersaoSO());
        assertEquals("ADSL",ch.getTipoConexao());
        assertEquals("192.168.2.1",ch.getEnderecoRede());
        
        
    }
    
    @Test
    public void editarChamadoTest(){
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        Tecnico t1 = new Tecnico("Vitoria",47581525);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 1351848, p1.getNome(), p1.getTelefone());
        Chamado ch = new Chamado(ce1.getCodigo(),"Problema","Problema tecnicos na internet",5,t1,ce1,"WINDOWS","VISTA","ADSL","192.168.2.1");
        
        ch.setTitulo("Solução");
        ch.setDescricao("Problema nos cabos de comunicação");
        ch.setPrioridade(7);
        ch.setSistemaOperacional("MACOS");
        ch.setVersaoSO("El Captain");
        ch.setTipoConexao("Radio");
        ch.setEnderecoRede("192.456.3.2");
        assertNotSame("Problema",ch.getTitulo());
        assertNotSame("Problema tecnicos na internet",ch.getDescricao());
        assertNotSame(5,ch.getPrioridade());
        assertNotSame("WINDOWS",ch.getSistemaOperacional());
        assertNotSame("VISTA",ch.getVersaoSO());
        assertNotSame("ADSL",ch.getTipoConexao());
        assertNotSame("192.168.2.1",ch.getTipoConexao());
        
        
        
    }
}
