package model;

public class Endereco {
	String rua;
	int numeroEndereco;
	String complemento;
	String bairro;
	String cidade;
	String estado;
	String cep;
	
	public Endereco(String rua, int numeroEndereco, String complemento, String bairro, String cidade, String estado, String cep){
		this.rua = rua;
		this.numeroEndereco = numeroEndereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

}
