package model;

public class GerenciamentoDoador {
	private static GerenciamentoDoador instancia;
	
	private GerenciamentoDoador() {}
	
	public static GerenciamentoDoador getInstance() {
		if(instancia == null) {
			instancia = new GerenciamentoDoador();
		}
		return instancia;
	}
	
	public void GeraRelatorio() {
		System.out.println("Gerando relatório de doadores");
	}
}
