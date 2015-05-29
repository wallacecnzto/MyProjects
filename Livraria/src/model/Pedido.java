package model;

public class Pedido {
	private int numeroPedido;
	private String dataEmissaoPedido;
	private String formaPagamentoPedido;
	private double valorTotalPedido;
	private String situacaoPedido;
	
	public Pedido(int numeroPedido, String dataEmissaoPedido, String formaPagamentoPedido, double valorTotalPedido, String situacaoPedido){
		this.numeroPedido = numeroPedido;
		this.dataEmissaoPedido = dataEmissaoPedido;
		this.formaPagamentoPedido = formaPagamentoPedido;
		this.valorTotalPedido = valorTotalPedido;
		this.situacaoPedido = situacaoPedido;
	}
	public int getNumeroPedido(){
		return this.numeroPedido;
	}
	public void	setNumeroPedido(int numeroPedido){
		return this.numeroPedido = numeroPedido;
	}
	public String getDataEmissaoPedido(){
		return this.dataEmissaoPedido;
	}
	public void setDataEmissaoPedido(){
		return this.dataEmissaoPedido = dataEmissaoPedido;
	}
	public String getFormaPagamentoPedido(){
		return this.formaPagamentoPedido;
	}
	public void setFormaPagamentoPedido(String formaPagamentoPedido){
		return this.formaPagamentoPedido = formaPagamentoPedido;
	}
	public double getValorTotalPedido(){
		return this.valorTotalPedido;
	}
	public void setFromaPagamentoPedido(double formaPagamentoPedido){
		return this.formaPagamentoPedido = formaPagamentoPedido;
	}
	public String getSituacaoPedido(){
		return this.situacaoPedido;
	}
	public void setSituacaoPedido(String situacaoPedido){
		return this.situacaoPedido = situacaoPedido;
	}



}
