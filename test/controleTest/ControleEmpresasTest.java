/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import Persistencia.EmpresaDAO;
import controle.ControleEmpresas;
import entidade.Empresa;
import java.awt.HeadlessException;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ta-ma
 */
public class ControleEmpresasTest {

    @Test
    public void inserirEmpresaTest() {
        ControleEmpresas controller = new ControleEmpresas();
        Empresa empresa = new Empresa(1236545, "Algar");
        controller.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa());
        Empresa empresaInserida = controller.retorna(1236545, "Algar");
        Assert.assertTrue((empresaInserida.getNomeEmpresa().equals(empresa.getNomeEmpresa())) && (empresaInserida.getNumeroContrato() == empresa.getNumeroContrato()));
    }

    @Test
    public void inserirEmpresaDuplicadaTest() {
        ControleEmpresas controller = new ControleEmpresas();
        Empresa empresa1 = controller.retorna(1236545, "Algar");
        Assert.assertNull(controller.inserir(empresa1.getNumeroContrato(), empresa1.getNomeEmpresa()));
     
    }

    @Test
    public void buscarEmpresaTest() {
        Empresa empresa = new Empresa(125897, "Oi");
        ControleEmpresas controller = new ControleEmpresas();
        controller.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa());
        Empresa empresaInserida = controller.retorna(125897, "Oi");
        Assert.assertEquals(125897, empresaInserida.getNumeroContrato());
        Assert.assertEquals("Oi", empresaInserida.getNomeEmpresa());
    }
    
    @Test
    public void buscarTodasEmpresasTest(){
        ControleEmpresas controller = new ControleEmpresas();
        //Método não existente
    }
    
    @Test
    public void verificarSeEmpresaExisteTest(){
        ControleEmpresas controller = new ControleEmpresas();
        int retorno = controller.validar(1234567, "Vivo");
        Assert.assertEquals(2, retorno);
        
    }
    @Test(expected = AssertionFailedError.class)
    public void verificarNmrContratoexisteTest(){
        ControleEmpresas controller = new ControleEmpresas();
        System.out.println(controller.retorna(125897, "Oi"));
        int retorno = controller.validar(125897, "Claro");
        Assert.assertEquals(1, retorno);
        
    }
}
