/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaTest;

import Persistencia.EmpresaDAO;
import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 41406133
 */
public class EmpresaDAOTest {

    @Test
    public void inserirEmpresaTest() {
        Empresa empresa = new Empresa(1234, "Algar Telecom");
        EmpresaDAO empresadao = new EmpresaDAO();
        empresadao.put(empresa);
        Assert.fail("Método para recuperação da empresa não existe");
    }

}
