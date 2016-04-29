/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesTest;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
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
public class ClienteEmpresaTest {

    @Test
    public void cadastrarClienteEmpresatest() {
        Empresa emp = new Empresa(1000, "Mackenzie");
        Pessoa p1 = new Pessoa("Hugo", 43569892);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp, 1351848, p1.getNome(), p1.getTelefone());
        assertEquals((Integer) 456, ce1.getCodigo());
        assertEquals(1000, emp.getNumeroContrato());
        assertEquals("Mackenzie", emp.getNomeEmpresa());
        assertEquals(1351848, ce1.getCpf());
        assertEquals("Hugo", p1.getNome());
        assertEquals(43569892, p1.getTelefone());
    }

    @Test
    public void editaClienteEmpresaTest() {
        Empresa emp2 = new Empresa(1000, "Mackenzie2");
        Pessoa p2 = new Pessoa("Hugo2", 43569892);
        ClienteEmpresa ce1 = new ClienteEmpresa(456, emp2, 1351848, p2.getNome(), p2.getTelefone());
        ce1.setCpf(1236458);
        ce1.setCodigo(7856);
        assertNotSame(1351848,ce1.getCpf());
        assertNotSame(456,ce1.getCodigo());
        
    }
    
    @Test(expected = Exception.class)
    public void verificarSeCodigoDeClienteEmpresaENegativo()throws Exception{
        Empresa emp3 = new Empresa(1000, "Mackenzie");
        Pessoa p3 = new Pessoa("Hugo3", 43569892);
        ClienteEmpresa ce3 = new ClienteEmpresa(-1456, emp3, 1351848, p3.getNome(), p3.getTelefone());
        
        
    }
    @Test(expected = Exception.class)
    public void verificarSeCPFDeClienteEmpresaENegativo()throws Exception{
        Empresa emp4 = new Empresa(41000, "Mackenzie4");
        Pessoa p4 = new Pessoa("Hugo3", 43569892);
        ClienteEmpresa ce2 = new ClienteEmpresa(1456, emp4, -1351848, p4.getNome(), p4.getTelefone());
    }
    

}
