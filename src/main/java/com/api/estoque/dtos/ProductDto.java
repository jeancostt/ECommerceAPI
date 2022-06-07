package com.api.estoque.dtos;

import javax.validation.constraints.NotBlank;

public class ProductDto {


    private String nomePedido;

    private String modeloPedido;

    private String corPedido;

    private String tamanhoPedido;

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public String getModeloPedido() {
        return modeloPedido;
    }

    public void setModeloPedido(String modeloPedido) {
        this.modeloPedido = modeloPedido;
    }

    public String getCorPedido() {
        return corPedido;
    }

    public void setCorPedido(String corPedido) {
        this.corPedido = corPedido;
    }

    public String getTamanhoPedido() {
        return tamanhoPedido;
    }

    public void setTamanhoPedido(String tamanhoPedido) {
        this.tamanhoPedido = tamanhoPedido;
    }
}
