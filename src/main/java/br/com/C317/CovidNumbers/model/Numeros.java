package br.com.C317.CovidNumbers.model;

public class Numeros {

	
	private String mes;
	private int numeroObito;
	private int numeroRecuperados;
	private int numeroCasosConfirmados;
	private Double porcentagemObito;
	private Double porcentagemRecuperados;
	
	
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getNumeroObito() {
		return numeroObito;
	}
	public void setNumeroObito(int numeroObito) {
		this.numeroObito = numeroObito;
	}
	public int getNumeroRecuperados() {
		return numeroRecuperados;
	}
	public void setNumeroRecuperados(int numeroRecuperados) {
		this.numeroRecuperados = numeroRecuperados;
	}
	
	public Double getPorcentagemObito() {
		return porcentagemObito;
	}
	public void setPorcentagemObito(Double porcentagemObito) {
		this.porcentagemObito = porcentagemObito;
	}
	public int getNumeroCasosConfirmados() {
		return numeroCasosConfirmados;
	}
	public void setNumeroCasosConfirmados(int numeroCasosConfirmados) {
		this.numeroCasosConfirmados = numeroCasosConfirmados;
	}
	public Double getPorcentagemRecuperados() {
		return porcentagemRecuperados;
	}
	public void setPorcentagemRecuperados(Double porcentagemRecuperados) {
		this.porcentagemRecuperados = porcentagemRecuperados;
	}
	
	
}
