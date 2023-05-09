import java.util.Date;

public class Coelho extends Pet {
	private String raca;
	private String linhagem;
	private int idPet;

    public Coelho(String nome, Date data_nascimento, String comodidade, String descricao, int imagem, boolean cadastro, int idAbrigo, String raca, String linhagem, int idPet) {
        super(nome, data_nascimento, comodidade, descricao, imagem, cadastro, idAbrigo);
        this.raca = raca;
        this.linhagem = linhagem;
        this.idPet = idPet;
    }
    
    public void editaCoelho(String raca, String linhagem, int idPet) {
  	  this.raca = raca;
        this.linhagem = linhagem;
        this.idPet = idPet;
  	  
        System.out.println("Coelho editado com sucesso!");
    }

    public void removeCoelho() {
      System.out.println("Coelho removido com sucesso!");
    }
}
