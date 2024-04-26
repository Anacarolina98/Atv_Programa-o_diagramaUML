public class produto {
    private String id;
    private String sugestao;
    private String descricao;
    private float preco;
    private int quantidade;


    public produto(String nome, float preco, int quantidade) {
        this.id = nome;
        this.sugestao = sugestao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;

    }

    private String generateUniqueId() {

        return "PRD-001";
    }
}
