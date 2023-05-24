package model;
public class Adotante {
  private String nome;
  private String sobrenome;
  private String contato;
  private String email;
  private String complemento;
  private String telefone;
  private int idEndereco;


  public Adotante(String nome, String sobrenome, String email, int idEndereco, String contato, String telefone) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.contato = contato;
    this.email = email;
    this.complemento = complemento;
    this.telefone = telefone;
    this.idEndereco = idEndereco;

}

public void cadastraAdotante() {
    System.out.println("Adotante cadastrado com sucesso!");
}

public void editaAdotante(String nome, String sobrenome, String email, int idEndereco, String contato, String telefone) {
  this.nome = nome;
    this.sobrenome = sobrenome;
    this.contato = contato;
    this.email = email;
    this.complemento = complemento;
    this.telefone = telefone;
    this.idEndereco = idEndereco;
  
    System.out.println("Adotante editado com sucesso!");
}

public void removeAdotante() {
  System.out.println("Adotante removido com sucesso!");
}

  
}
