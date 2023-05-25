package model;

public class GerenciamentoPets {
	private static GerenciamentoPets instancia;
	
	private GerenciamentoPets() {}
	
	public static GerenciamentoPets getInstance() {
		if(instancia == null) {
			instancia = new GerenciamentoPets();
		}
		return instancia;
	}
	
	public void GeraRelatorio() {
		System.out.println("Gerando relatório de pets");
	}
}
