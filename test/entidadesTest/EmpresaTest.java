package entidadesTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Empresa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31411525
 */
public class EmpresaTest {
    
    @Test
    public void cadastrarEmpresaTest() {
        Empresa emp = new Empresa(1000,"Mackenzie");
        assertEquals(1000, emp.getNumeroContrato());
        assertEquals("Mackenzie", emp.getNomeEmpresa());
    }
    
    @Test
    public void editarEmpresaTest(){
        Empresa emp2 = new Empresa(1004,"IBM");
        emp2.setNomeEmpresa("Oracle");
        emp2.setNumeroContrato(1003);
        assertNotSame("IBM",emp2.getNomeEmpresa());
        assertNotSame(1004,emp2.getNumeroContrato());
        
    }
    @Test
    public void deletarEmpresaTest(){
        Empresa emp3 = new Empresa(1000,"Microsoft");
        //emp3.remove();
        Assert.fail("Nao existe um metodo remove para remover uma empresa");
    }
    
    @Test
    public void verificaSeNomeDaEmpresaENuloTest(){
        Empresa emp3 = new Empresa(1000,null);
        assertEquals(emp3.getNomeEmpresa(),null);
    }
    @Test
    public void verificaSeNumeroDoContratoPodeSerNegativo(){
        Empresa emp4 = new Empresa(-1,"Vivo");
        assertTrue(emp4.getNumeroContrato() < 0);
    }

}
