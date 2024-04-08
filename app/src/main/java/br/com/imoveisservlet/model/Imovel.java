package br.com.imoveisservlet.model;

public class Imovel {
    private String imovel;
    private String proprietario;

    public Imovel(String imovel, String proprietario) {
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
