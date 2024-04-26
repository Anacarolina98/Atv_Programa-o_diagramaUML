import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nome;
    private String email;
    private String senha;

    public void acessarSite() {
        System.out.println("Cliente " + nome + " acessou o site.");
    }
    public boolean aceitarSugestao() {
        System.out.println("Cliente " + nome + " está avaliando a sugestão do produto " + produto.getDescricao() + ".");
        return true;
    }
    public void recusarSugestao() {
        System.out.println("Cliente " + nome + " recusou a sugestão do produto " + produto.getDescricao() + ".");
    }
    public void realizarPagamento(MetodoPagamento metodoPagamento) { 
        System.out.println("Método de pagamento: " + metodoPagamento);
    }
    public void sairDoSite() {
        System.out.println("Cliente " + nome + " saiu do site.");
    }
}
public class TelaPrincipal {
    private String nome;
    private String descricao;
    private String produto;

    public void darSugestao() {
        System.out.println("Tela Principal sugeriu o produto " + produto.getDescricao() + " para o cliente " + cliente.getNome() + ".");
    if (cliente.aceitarSugestao(produto)) {
        System.out.println("Cliente " + cliente.getNome() + " aceitou a sugestão do produto " + produto.getDescricao() + ".");
    } else {
        System.out.println("Cliente " + cliente.getNome() + " recusou a sugestão do produto " + produto.getDescricao() + ".");
        }
    }
    public int getEstoqueProduto(String idProduto) {
        return 0;
    }
}
public class Produto {
    private String descricao;
    private float estoque;
    private float preco;

    public void setDescricao(String descricao) {
    }
    public String getDescricao() {
        return null;
    }

    public void setPreco(float preco) {
    }

    public float getPreco() {
        return 0.0f; 
    }
}
public class MetodoPagamento {
    private String debito;
    private String credito;

    public void pagar() {
    }
}
