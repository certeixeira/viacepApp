package com.example.viacepapp;

import androidx.annotation.NonNull;

public class CEP {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return
                "Cep buscado: " + getCep() + "\n" +
                        "Logradouro: " + getLogradouro() + "\n" +
                        "Complemento: " + getComplemento() + "\n" +
                        "Bairro: " + getBairro() + "\n" +
                        "Cidade: " + getLocalidade() + "\n" +
                        "Estado: " + getUf();
    }
}
