package br.com.imoveisservlet.model;

public class CadastroImovel {
    private String imovel;
    private String proprietario;

    public CadastroImovel(String imovel, String proprietario) {
        this.imovel = imovel;
        this.proprietario = proprietario;
    }

    public String getImovel() {
        return imovel;
    }



    public String getProprietario() {
        return proprietario;
    }


}
