package model;

public class Livro {
	private String isbn;
	private String titulo;
	private String descricao;
	private String autor;
	private int estoque;
	private double preco;
	private String figura;
	private String dataCadastro;
	private String categoria;
	
	public Livro(String isbn, String titulo, String descricao, String autor, int estoque, double preco, String figura, String dataCadastro, String categoria){
		this.isbn = isbn;
		this.titulo = titulo;
		this.descricao = descricao;
		this.autor = autor;
		this.estoque = estoque;
		this.preco = preco;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
		this.categoria = categoria;
	}
	public String getIsbn(){
		return this.isbn;
	}
	public void setIsbn(String isbn){
		return this.isbn = isbn;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public  void setTitulo(String titulo){
		return this.titulo = titulo;
	}
	public String getDescricao(){
		return this.descricao;
	}
	public void setDescricao(String descricao){
		return this.descricao;
	}
	public String getAutor(){
		return this.autor;
	}
	public void setAutor(String autor){
		return this.autor = autor;
	}
	public String getEstoque(){
		return this.estoque;
	}
	public void setEstoque(String estoque){
		return this.estoque = estoque;
	}
	public double getPreco(){
		return this.preco;
	}
	public void setPreco(double preco){
		return this.preco = preco;
	}
	public String getFigura(){
		return this.figura;
	}
	public void setFigura(String figura){
		return this.figura = figura;
	}
	public String getDataCadastro(){
		return this.dataCadastro;
	}
	public void setDataCadastro(String dataCadastro){
		return this.dataCadastro = dataCadastro;
	}
	public String getCategoria(){
		return this.categoria;
	}
	public void setCategoria(String categoria){
		return this.categoria = categoria;
	}



}
