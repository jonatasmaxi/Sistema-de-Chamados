/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import Persistencia.ClienteDAO;
import controle.ControleClientes;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.HashMap;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jonatasmaxi
 */
public class ControleClientesTest {

    @Test
    public void inserirNovoClienteTest() {
        ControleClientes controller = new ControleClientes();
        ClienteEmpresa inserido = controller.incluiNovoCliente((new Empresa(123560, "Anatel")), 1445110526, "Julio", 44536651);
        ClienteDAO clientedao = controller.getClienteDAO();
        ClienteEmpresa cliente = clientedao.get(Long.parseLong("1445110526"));
        Assert.assertTrue(((cliente.getCpf() == inserido.getCpf()) && (cliente.getNome() == inserido.getNome()) && (cliente.getEmpresa() == inserido.getEmpresa()) && (cliente.getTelefone() == inserido.getTelefone())) && (cliente.getCodigo() == inserido.getCodigo()));
    }


    @Test
    public void atualizarClienteTest() {
        ControleClientes controller = new ControleClientes();
        ClienteEmpresa inserido = controller.incluiNovoCliente((new Empresa(123560, "Anatel")), 1445110526, "Julio", 44536651);
        ClienteEmpresa inserido2 = controller.incluiNovoCliente((new Empresa(123560, "Anatel")), 1445110526, "Jamil", 44536651);
        ClienteEmpresa cliente = controller.getClienteDAO().voltaCashCliente().get(inserido2.getCpf());
        assertEquals(inserido2.toString(),cliente.toString());
    }
    @Test
    public void removerClienteTest(){
        ControleClientes controller = new ControleClientes();
        ClienteEmpresa inserido = controller.incluiNovoCliente((new Empresa(12340560, "Telesp")), 1445110406, "Mario", 44532151);
        controller.getClienteDAO().voltaCashCliente().remove(inserido.getCpf());
        Assert.assertNull(controller.getClienteDAO().voltaCashCliente().get(inserido.getCpf()));
    }
}
