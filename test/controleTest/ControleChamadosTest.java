/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleTest;

import Persistencia.ChamadoDAO;
import controle.ControleChamados;
import entidade.BancoDeDados;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.SistemaOperacional;
import entidade.Tecnico;
import entidade.TipoConexao;
import entidade.TipoProblema;
import java.util.Collection;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jonatasmaxi
 */
public class ControleChamadosTest {

    @Test
    public void inserirChamadoRedeTest() {

        Chamado chamado = new Chamado(3, "Problema no Modem", "O Modem não liga", 5, (new Tecnico("João da Silva", 44587896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), SistemaOperacional.WINDOWS + "", "10", TipoConexao.ADSL + "", "19216801");
        ControleChamados controller = new ControleChamados();
        chamado = controller.InserirChamadoRede(chamado.getTitulo(), chamado.getDescricao(), chamado.getPrioridade(), chamado.getTecnico(), chamado.getCliente(), chamado.getSistemaOperacional(), chamado.getVersaoSO(), chamado.getTipoConexao(), chamado.getEnderecoRede());
        Chamado chamadoInserido = controller.buscaPeloCodigo(chamado.getCodigo());
        Assert.assertTrue((chamado.getTitulo().equals(chamadoInserido.getTitulo())) && (chamado.getDescricao().equals(chamadoInserido.getDescricao())) && (chamado.getPrioridade() == chamadoInserido.getPrioridade()) && ((chamado.getTecnico().getNome().equals(chamadoInserido.getTecnico().getNome())) && (chamado.getTecnico().getTelefone() == chamadoInserido.getTecnico().getTelefone())) && (chamado.getCliente().getCpf() == chamadoInserido.getCliente().getCpf()) && (chamado.getSistemaOperacional().equals(chamadoInserido.getSistemaOperacional())) && (chamado.getVersaoSO().equals(chamadoInserido.getVersaoSO())) && (chamado.getTipoConexao().equals(chamadoInserido.getTipoConexao())) && (chamado.getEnderecoRede().equals(chamadoInserido.getEnderecoRede())));
    }

    @Test
    public void inserirChamadoBancoDeDadosTest() {
        Chamado chamado = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, (new Tecnico("Júlio da Silva", 44547896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        ControleChamados controller = new ControleChamados();
        chamado = controller.InserirChamadoBancoDeDados(chamado.getTitulo(), chamado.getDescricao(), chamado.getPrioridade(), chamado.getTecnico(), chamado.getCliente(), chamado.getSistemaOperacional(), chamado.getVersaoSO(), chamado.getBancoDeDados());
        Chamado chamadoInserido = controller.buscaPeloCodigo(chamado.getCodigo());
        Assert.assertTrue((chamado.getTitulo().equals(chamadoInserido.getTitulo())) && (chamado.getDescricao().equals(chamadoInserido.getDescricao())) && (chamado.getPrioridade() == chamadoInserido.getPrioridade()) && ((chamado.getTecnico().getNome().equals(chamadoInserido.getTecnico().getNome())) && (chamado.getTecnico().getTelefone() == chamadoInserido.getTecnico().getTelefone())) && (chamado.getCliente().getCpf() == chamadoInserido.getCliente().getCpf()) && (chamado.getSistemaOperacional().equals(chamadoInserido.getSistemaOperacional())) && (chamado.getVersaoSO().equals(chamadoInserido.getVersaoSO())) && (chamado.getBancoDeDados().equals(chamadoInserido.getBancoDeDados())));
    }

    @Test
    public void inserirChamadoDesempenhoTest() {
        Chamado chamado = new Chamado("Tela Azul", "Ao abrir o Internet Explorer o computador exibe a tela azul da morte  ", 9, (new Tecnico("Júlio da Silva", 44547896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", "Abrir Internet Explorer", 10);
        ControleChamados controller = new ControleChamados();
        chamado = controller.InserirChamadoDesempenho(chamado.getTitulo(), chamado.getDescricao(), chamado.getPrioridade(), chamado.getTecnico(), chamado.getCliente(), chamado.getSistemaOperacional(), chamado.getVersaoSO(), chamado.getOperacao(), chamado.getDuracaoOperacao());
        Chamado chamadoInserido = controller.buscaPeloCodigo(chamado.getCodigo());
        Assert.assertTrue((chamado.getTitulo().equals(chamadoInserido.getTitulo())) && (chamado.getDescricao().equals(chamadoInserido.getDescricao())) && (chamado.getPrioridade() == chamadoInserido.getPrioridade()) && ((chamado.getTecnico().getNome().equals(chamadoInserido.getTecnico().getNome())) && (chamado.getTecnico().getTelefone() == chamadoInserido.getTecnico().getTelefone())) && (chamado.getCliente().getCpf() == chamadoInserido.getCliente().getCpf()) && (chamado.getSistemaOperacional().equals(chamadoInserido.getSistemaOperacional())) && (chamado.getVersaoSO().equals(chamadoInserido.getVersaoSO())) && (chamado.getOperacao().equals(chamadoInserido.getOperacao())) && (chamado.getDuracaoOperacao() == chamadoInserido.getDuracaoOperacao()));
    }

    @Test
    public void inserirRegistroChamadoTest() {
        Tecnico tecnico = new Tecnico("Júlio da Silva", 44547896L);
        Chamado chamado = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, tecnico, (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        RegistroChamado registro = new RegistroChamado(TipoProblema.ProblemaBancoDeDados + "", chamado, tecnico);
        ControleChamados controller = new ControleChamados();
        controller.inserirRegistroChamado(registro.getAssunto(), registro.getChamado(), registro.getTecnico());
        Assert.fail("Método para recuperação de um registro de chamado não existe na classe ControleChamados");

    }

    @Test
    public void emissaoDetalheChamadoTest() {
        Chamado c = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, (new Tecnico("João da Silva", 44587896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        String detalhes = "\n" + "--------" + "\n" + "Data de abertura do chamado: "
                + c.getData() + "\n" + "Hororio de abertura do chamado: " + c.getHora() + "\n"
                + "Titulo do chamado: " + "Tabela Inexistente" + "\n" + "Descricao do chamado: " + "Os responsáveis pela criação das tabelas, esqueceram uma " + "\n"
                + "Prioridade do chamado" + "8" + "\n" + "Status do chamado: " + "iniciado" + "\n"
                + "Tipo de problema do chamado: " + "Banco de Dados" + "\n" + "Tecnico responsovel pelo chamado: "
                + "João da Silva" + "\n" + "Cliente requisitor do chamado: " + "Contrato: " + "1006"
                + " - Nome Empresa:" + "Vivo" + " - Cliente: "
                + "45473486851" + " - " + "Jonatas" + "\n";
        ControleChamados controller = new ControleChamados();
        assertEquals(detalhes, controller.retornaDetalhesChamado(c));

    }

    @Test
    public void emitirRelatorioTest() {
        ControleChamados controller = new ControleChamados();
        String relatorio =   controller.emitirRelatorios(1);
        
    }

    @Test
    public void contarChamadosCliente() {
        ClienteEmpresa cliente = new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651);
        Chamado chamado = new Chamado(3, "Problema no Modem", "O Modem não liga", 5, (new Tecnico("João da Silva", 44587896L)), cliente, SistemaOperacional.WINDOWS + "", "10", TipoConexao.ADSL + "", "19216801");
        Chamado c = new Chamado("Tabela Inexistente", "Os responsáveis pela criação das tabelas, esqueceram uma ", 8, (new Tecnico("João da Silva", 44587896L)), (new ClienteEmpresa(Integer.SIZE, (new Empresa(1006, "Vivo")), 45473486851L, "Jonatas", 44536651)), "Windows", "10", BancoDeDados.MySql + "");
        ControleChamados controller = new ControleChamados();
        ChamadoDAO dao = new ChamadoDAO();
        Collection<Chamado> chamados = dao.getChamados();
        int chamadoCliente = 0;
        for (Chamado chamado1 : chamados) {
            if (chamado.getCliente().getCpf() == 45473486851L) {
                chamadoCliente++;
            }
        }
        assertEquals(chamadoCliente, controller.validarQtdChamados(cliente));
    }

}
