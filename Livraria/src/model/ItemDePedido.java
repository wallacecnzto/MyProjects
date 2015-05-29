package model;

public class ItemDePedido {
	private int qtde;
	private int precoItemDePedido;
	
	public ItemDePedido(int qtde, int precoItemDePedido){
		this.qtde = qtde;
		this.precoItemDePedido = precoItemDePedido;
	}

	public int getQtde(){
		return this.qtde;
	}
	public void setQtde(int qtde){
		return this.qtde = qtde;
	}
	public int getPrecoItemDePedido(){
		return this.precoItemDePedido;
	}
	public void setPrecoItemDoPedido(int precoItemDePedido){
		return this.precoItemDePedido = precoItemDePedido;
	}

}
