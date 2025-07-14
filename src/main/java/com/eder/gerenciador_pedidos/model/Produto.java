package com.eder.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @Column(name = "produto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    @Column(name = "valor")
    private Double preco;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;


    public Produto() {

    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {

        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", preco=" + preco +
               ", categoria=" + categoria +
               '}';
    }
}
