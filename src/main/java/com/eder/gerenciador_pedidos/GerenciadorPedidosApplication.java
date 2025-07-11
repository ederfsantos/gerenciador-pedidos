package com.eder.gerenciador_pedidos;

import com.eder.gerenciador_pedidos.model.Categoria;
import com.eder.gerenciador_pedidos.model.Pedido;
import com.eder.gerenciador_pedidos.model.Produto;
import com.eder.gerenciador_pedidos.repository.CategoriaRepository;
import com.eder.gerenciador_pedidos.repository.PedidoRepository;
import com.eder.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GerenciadorPedidosApplication  implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;

	public static void main(String[] args) {

		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria = new Categoria("Bebidas");
		Produto produto = new Produto("Refrigerante",10.50);
		Pedido pedido = new Pedido(LocalDate.of(2025,07,11));
		//categoriaRepository.save(categoria);
		//produtoRepository.save(produto);
		//pedidoRepository.save(pedido);
		System.out.println(produtoRepository.findById(1L));
		System.out.println(pedidoRepository.findById(1L));
		System.out.println(categoriaRepository.findById(1L));




	}
}
