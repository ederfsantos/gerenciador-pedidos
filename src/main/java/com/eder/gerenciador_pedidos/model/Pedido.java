package com.eder.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @Column(name = "pedido_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private LocalDate data;
    @ManyToMany
    @JoinTable(name = "pedido_produto", joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private List<Produto> produtos;

    public Pedido() {
    }

    public Pedido(LocalDate data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
               "id=" + id +
               ", data=" + data +
               '}';
    }
}
