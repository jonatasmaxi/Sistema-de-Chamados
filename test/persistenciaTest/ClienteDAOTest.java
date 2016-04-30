/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaTest;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 41406133
 */
public class ClienteDAOTest {

    @Test
    public void inserirClienteTest() {
        Empresa empresa = new Empresa(1001, "Tim");
        ClienteEmpresa ce1 = new ClienteEmpresa(456, empresa, 36411351848L, "Hugo", 982785986);
        ClienteDAO clientedao = new ClienteDAO();
        clientedao.put(ce1);
        ClienteEmpresa ce2 = clientedao.get(ce1.getCpf());
        Assert.assertTrue((ce1.getCodigo() == ce2.getCodigo()) && (ce1.getCpf() == ce2.getCpf()) && (ce1.getTelefone() == ce2.getTelefone()) && (ce1.getNome().equals(ce2.getNome()) && (ce1.getEmpresa().getNumeroContrato() == ce2.getEmpresa().getNumeroContrato()) && (ce1.getEmpresa().getNomeEmpresa().equals(ce2.getEmpresa().getNomeEmpresa()))));
    }

    @Test
    public void leituraTest() {
        ClienteDAO clientedao = new ClienteDAO();
        Empresa empresa = new Empresa(1001, "Tim");
        ClienteEmpresa ce1 = new ClienteEmpresa(456, empresa, 36411351848L, "Hugo", 982785986);
        clientedao.put(ce1);
        Assert.assertTrue(clientedao.voltaCashCliente().size() > 0);

    }

    @Test
    public void verificarSeCpfNaoExisteNoBancoTest() {
        ClienteDAO clientedao = new ClienteDAO();
        Empresa empresa = new Empresa(1001, "Tim");
        ClienteEmpresa ce1 = new ClienteEmpresa(456, empresa, 45473486851L, "Jonatas", 92785986);
        clientedao.put(ce1);
        boolean resp = clientedao.validarCPF(45473486851L);
        Assert.assertFalse(resp);
        
    }

}
