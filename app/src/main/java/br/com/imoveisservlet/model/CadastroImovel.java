package br.com.imoveisservlet.model;

public class CadastroImovel {
    private String titulo_imovel;
    private String endereco;
    private String num_quartos;
    private String num_banheiro;
    private String num_vagas;
    private String valor_noite;
    private String imagens;
    private String obs;

    public CadastroImovel(String titulo_imovel, String endereco, String num_quartos, String num_banheiro, String num_vagas, String valor_noite, String imagens, String obs) {
        this.titulo_imovel = titulo_imovel;
        this.endereco = endereco;
        this.num_quartos = num_quartos;
        this.num_banheiro = num_banheiro;
        this.num_vagas = num_vagas;
        this.valor_noite = valor_noite;
        this.imagens = imagens;
        this.obs = obs;
    }

    public String getTitulo_imovel() {
        return titulo_imovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNum_quartos() {
        return num_quartos;
    }

    public String getNum_banheiro() {
        return num_banheiro;
    }

    public String getNum_vagas() {
        return num_vagas;
    }

    public String getValor_noite() {
        return valor_noite;
    }

    public String getImagens() {
        return imagens;
    }

    public String getObs() {
        return obs;
    }
}
