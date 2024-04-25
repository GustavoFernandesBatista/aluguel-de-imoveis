package br.com.imoveisservlet.model;

public class CadastroImovel {
    private String IdCadastroImovel;
    private String tituloImovel;
    private String endereco;
    private String numQuartos;
    private String numBanheiro;
    private String numVagas;
    private String valorNoite;
    private String imagens;
    private String obs;

    public CadastroImovel(String tituloImovel, String endereco, String numQuartos, String numBanheiro, String numVagas , String valorNoite, String imagens, String obs, String s) {
        this.tituloImovel = tituloImovel;
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.numBanheiro = numBanheiro;
        this.numVagas = numVagas;
        this.valorNoite = valorNoite;
        this.imagens = imagens;
        this.obs = obs;
    }
/*

                                                                             CONSTRUTOR COM ERRO

    public CadastroImovel(String obs, String imagens, String valorNoite, String numVagas, String numBanheiro, String numQuartos, String endereco, String tituloImovel, String idCadastroImovel) {
        this.obs = obs;
        this.imagens = imagens;
        this.valorNoite = valorNoite;
        this.numVagas = numVagas;
        this.numBanheiro = numBanheiro;
        this.numQuartos = numQuartos;
        this.endereco = endereco;
        this.tituloImovel = tituloImovel;
        IdCadastroImovel = idCadastroImovel;
    }
*/
    public String getTituloImovel() {
        return tituloImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumQuartos() {
        return numQuartos;
    }

    public String getNumBanheiro() {
        return numBanheiro;
    }

    public String getNumVagas() {
        return numVagas;
    }

    public String getValorNoite() {
        return valorNoite;
    }

    public String getImagens() {
        return imagens;
    }

    public String getObs() {
        return obs;
    }

    public String getIdCadastroImovel() {
        return IdCadastroImovel;
    }
}
