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
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ta-ma
 */
public class ControleEmpresasTest {
    @Test
    public void inserirEmpresaTest(){
        ControleEmpresas controller = new ControleEmpresas();
        Empresa empresa = new Empresa(1236545,"Algar");
        controller.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa());
        Empresa empresaInserida = controller.retorna(1236545, "Algar");
        Assert.assertTrue((empresaInserida.getNomeEmpresa().equals(empresa.getNomeEmpresa())) && (empresaInserida.getNumeroContrato() == empresa.getNumeroContrato()));
    }
    
    @Test
    public void inserirEmpresaDuplicadaTest(){
        ControleEmpresas controller = new ControleEmpresas();
        Empresa empresa1 = controller.retorna(1236545, "Algar");
        Assert.assertNull(controller.inserir(empresa1.getNumeroContrato(), empresa1.getNomeEmpresa()));
       
        
    }
}
