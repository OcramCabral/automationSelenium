import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContatosTestSelenium {

    private ContatoPageObject contatoPageObject;

    @BeforeMethod
    public void beforeEach(){
        contatoPageObject = new ContatoPageObject();
    }

    @AfterMethod
    public void afterEach(){
        contatoPageObject.fechar();
    }

    @Test
    public void deveria_acesser_html_contatos(){
        contatoPageObject.acessoPageContatos();
        Assert.assertEquals(contatoPageObject.getUrlAtual(), "https://www.dbserver.com.br/contato.html");
    }

    @Test
    public void nao_deveria_enviar_infomacoes_fale_conosco_sem_mengsagem(){
        contatoPageObject.acessoPageContatos();
        contatoPageObject.preencherFaleConosco("fulano", "fulano@teste.com", "automação");
        Assert.assertEquals(contatoPageObject.getUrlAtual(), "https://www.dbserver.com.br/contato.html");
    }

    @Test
    public void deveria_conter_endereço_Ipiranga(){
        contatoPageObject.acessoPageContatos();
        Assert.assertEquals(contatoPageObject.todoConteudoPagina().contains("Av. Ipiranga, 6681"), true);
    }
}