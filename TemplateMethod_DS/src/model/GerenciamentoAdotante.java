package model;

public class GerenciamentoAdotante {
	private static GerenciamentoAdotante instancia;
	
	private GerenciamentoAdotante() {}
	
	public static GerenciamentoAdotante getInstance() {
		if(instancia == null) {
			instancia = new GerenciamentoAdotante();
		}
		return instancia;
	}
	
	public void GeraRelatorio() {
		System.out.println("Gerando relatório de adotantes");
	}
}
