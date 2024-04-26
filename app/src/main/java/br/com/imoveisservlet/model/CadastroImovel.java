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

    public CadastroImovel(String idCadastroImovel, String tituloImovel, String endereco, String numQuartos, String numBanheiro, String numVagas, String valorNoite, String imagens, String obs) {
        IdCadastroImovel = idCadastroImovel;
        this.tituloImovel = tituloImovel;
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.numBanheiro = numBanheiro;
        this.numVagas = numVagas;
        this.valorNoite = valorNoite;
        this.imagens = imagens;
        this.obs = obs;
    }

    public CadastroImovel(String tituloImovel, String endereco, String numQuartos, String numBanheiro, String numVagas, String valorNoite, String imagens, String obs) {
        this.tituloImovel = tituloImovel;
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.numBanheiro = numBanheiro;
        this.numVagas = numVagas;
        this.valorNoite = valorNoite;
        this.imagens = imagens;
        this.obs = obs;


    }

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
