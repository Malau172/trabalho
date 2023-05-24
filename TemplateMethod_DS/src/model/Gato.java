package model;
import java.util.Date;

public class Gato extends Pet {

	private String raca;
	private int idPet;
	
    public Gato(String nome, Date data_nascimento, String comodidade, String descricao, int imagem, boolean cadastro, int idAbrigo, String raca, int idPet) {
        super(nome, data_nascimento, comodidade, descricao, imagem, cadastro, idAbrigo);
        this.raca = raca;
        this.idPet = idPet;
    }
    
    public void editaGato(String raca, int idPet) {
    	this.raca = raca;
         this.idPet = idPet;
    	  
         System.out.println("Gato editado com sucesso!");
    }

    public void removeGato() {
        System.out.println("Gato removido com sucesso!");
    }
    
    @Override
   	public void pesarAnimal() {
   		 System.out.println("pesando Coelho");
   	}

   	@Override
   	public void vacinarAnimal() {
   		System.out.println("vacinando Coelho");
   	}
}
