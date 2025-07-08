package com.eder.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @Column(name = "pedido_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private LocalDate data;

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

    @Override
    public String toString() {
        return "Pedido{" +
               "id=" + id +
               ", data=" + data +
               '}';
    }
}
