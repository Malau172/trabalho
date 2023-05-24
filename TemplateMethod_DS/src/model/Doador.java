package model;

public abstract class Doador {
  private String nome;
  private String contato;
  private String email;
  private int idEnderecoDoador;


  public Doador(String nome, String contato, String email, int idEnderecoDoador) {
    this.nome = nome;
    this.contato = contato;
    this.email = email;
    this.idEnderecoDoador = idEnderecoDoador;
  }
   

  public void cadastraDoador() {
    System.out.println("Adoção cadastrado com sucesso!");
  }

  public void editaDoador(String nome, String contato, String email, int idEnderecoDoador) {
	    this.nome = nome;
	    this.contato = contato;
	    this.email = email;
	    this.idEnderecoDoador = idEnderecoDoador;
	  
      System.out.println("Doadoe editado com sucesso!");
  }

  public void removeDoador() {
    System.out.println("Adotante removido com sucesso!");
  }

  public abstract void fazerDoacaoDePet();
  
}
