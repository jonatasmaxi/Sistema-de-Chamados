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
    public void buscarTodasEmpresasTest() {
        ControleEmpresas controller = new ControleEmpresas();
        //Método não existente
    }

    /*
        O retorno do método validar é:
        O número 1 caso número do contrato e nome já existam  no banco de dados 
        O número 2 caso o nome da empresa já exista no banco de dados
        O número 3 caso o número do contrato já exista no banco de dados
        O número 4 caso nenhum exista no banco de dados
        
     */
    @Test
    public void verificarSeNomeEmpresaExisteTest() {
        ControleEmpresas controller = new ControleEmpresas();
        int retorno = controller.validar(12345687, "Vivo");
        Assert.assertEquals(2, retorno);
    }

    @Test
    public void verificarNmrContratoExisteTest() {
        ControleEmpresas controller = new ControleEmpresas();
        int retorno = controller.validar(12345, "CTBC");
        Assert.assertEquals(3, retorno);
    }

    @Test
    public void verificarNomeENmrContratoExisteTest() {
        ControleEmpresas controller = new ControleEmpresas();
        int retorno = controller.validar(12345, "Vivo");
        Assert.assertEquals(1, retorno);
    }

    @Test
    public void verificarDisponibilidadeNomeNmrContratoTest() {
        ControleEmpresas controller = new ControleEmpresas();
        int retorno = controller.validar(12345678, "Claro");
        Assert.assertEquals(4, retorno);
    }
     @Test
    public void removerEmpresaTest() {
        ControleEmpresas controller = new ControleEmpresas();
        //Método não existente
    }
    
    @Test
    public void atualizarEmpresaTest() {
        ControleEmpresas controller = new ControleEmpresas();
        //Método não existente
    }
}

