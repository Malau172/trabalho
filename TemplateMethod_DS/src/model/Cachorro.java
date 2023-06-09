package model;
import java.util.Date;

public class Cachorro extends Pet{
	private String raca;
	private String vacinas;
	private boolean desvermificado;
	private int idPet;

    public Cachorro(String nome, String data_nascimento, String comodidade, String descricao, String imagem, boolean cadastro, int idAbrigo, String raca, String vacinas, boolean desvermificado, int idPet) {
        super(nome, data_nascimento, comodidade, descricao, imagem, cadastro, idAbrigo);
        this.raca = raca;
        this.vacinas = vacinas;
        this.desvermificado = desvermificado;
        this.idPet = idPet;
    }
    
    public void cadastraCachorro() {
        System.out.println("Cachorro cadastrado com sucesso!");
      }

      public void editaCachorro(String raca, String vacinas, boolean desvermificado, int idPet) {
    	  this.raca = raca;
          this.vacinas = vacinas;
          this.desvermificado = desvermificado;
          this.idPet = idPet;
    	  
          System.out.println("Cachorro editado com sucesso!");
      }

      public void removeCachorro() {
        System.out.println("Cachorro removido com sucesso!");
      }
//
//	@Override
//	public void pesarAnimal() {
//		 System.out.println("pesando cachorro");
//	}
//
//	@Override
//	public void vacinarAnimal() {
//		System.out.println("vacinando cachorro");
//	}
}
