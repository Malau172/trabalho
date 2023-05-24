package model;
import java.util.Date;

public class Adocao {
  private Date dataAdocao;
  private int idPet;
  private int idAdotante;


  public Adocao(Date dataAdocao, int idPet, int idAdotante) {
    this.dataAdocao = dataAdocao;
    this.idPet = idPet;
    this.idAdotante = idAdotante;
  }
   

  public void cadastraAdocao() {
    System.out.println("Adoção cadastrado com sucesso!");
  }

  public void editaAdocao(Date dataAdocao, int idPet, int idAdotante) {
    this.dataAdocao = dataAdocao;
    this.idPet = idPet;
    this.idAdotante = idAdotante;
    
      System.out.println("Adoção editada com sucesso!");
  }

  public void removeAdotante() {
    System.out.println("Adotante removido com sucesso!");
  }

  
}
