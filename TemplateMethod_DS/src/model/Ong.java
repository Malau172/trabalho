package model;

public class Ong extends Doador{
	 private String descricao;
	 private String objetivos;
	 private int idDoador;
	
    public Ong(String nome, String contato, String email, int idEnderecoDoador, String objetivos, String descricao, int idDoador) {
    	super(nome, contato, email, idEnderecoDoador);
    	this.objetivos = objetivos;
	    this.descricao = descricao;
	    this.idDoador = idDoador;
    }
    
    public void cadastraOng() {
        System.out.println("Ong cadastrada com sucesso!");
      }

      public void editaOng(String objetivos, String descricao, int idDoador) {
      	this.objetivos = objetivos;
  	    this.descricao = descricao;
  	    this.idDoador = idDoador;
    	  
          System.out.println("Ong editada com sucesso!");
      }

      public void removeOng() {
        System.out.println("Ong removida com sucesso!");
      }

	@Override
	public void fazerDoacaoDePet() {
		 System.out.println("Ong doando um pet!");
	}
}
