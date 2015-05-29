package controller.console;

import model.Cliente;
import model.Endereco;
import model.ItemDePedido;
import model.Livro;
import model.Pedido;

public class Teste {

	public static void main(String[] args) {
		Livro l1 = new Livro("978-85-66250-08-4", "Casa do Código", "tudo sobre programação", "Maurício Aniche", 100, 50, "111111", "25/05/2015", "Informática");
		
		Pedido p1 = new Pedido(532, "25/05/2015", "Cartão de Crédito", 55, "Postado");
		
		Cliente c1 = new Cliente("Wallace", "wallace", "1234", "wallace@email.com", "9999-9999");
		
		Endereco e1 = new Endereco("João Barbalho", 100, "apt 102", "Quintino Bocaiúva", "Rio de Janeiro", "RJ", "20740-010");
		
		ItemDePedido i1 = new ItemDePedido(200, 99);

	}

}
