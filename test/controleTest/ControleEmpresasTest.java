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
        Empresa empresa = new Empresa(123545,"GVT");
        controller.inserir(empresa.getNumeroContrato(), empresa.getNomeEmpresa());
        Empresa empresaInserida = controller.retorna(12345, "Vivo");
        Assert.assertTrue((empresaInserida.getNomeEmpresa().equals(empresa.getNomeEmpresa())) && (empresaInserida.getNumeroContrato() == empresa.getNumeroContrato()));
    }
}
