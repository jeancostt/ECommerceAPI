package com.api.estoque.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(nullable = false, length = 200)
private String nomePedido;
@Column(nullable = false, length = 11)
private String modeloPedido;
@Column(nullable = false, length = 50)
private String corPedido;
@Column(nullable = false, length = 70)
private String tamanhoPedido;
@Column(nullable = false)
private LocalDateTime dataRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}

