package model;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Pet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String nome;
    private Date data_nascimento;
    private String comodidade;
    private String descricao;
    private int imagem;
    private boolean cadastro;
    private int idAbrigo;


    public Pet(String nome, Date data_nascimento, String comodidade, String descricao, int imagem, boolean cadastro, int idAbrigo) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.comodidade = comodidade;
        this.descricao = descricao;
        this.imagem = imagem;
        this.cadastro = cadastro;
        this.idAbrigo = idAbrigo;

    }

    public void cadastraPet() {
        System.out.println("Pet cadastrado com sucesso!");
    }

    public void editaPet(String nome, Date data_nascimento, String comodidade, String descricao, int imagem, boolean cadastro, int idAbrigo) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.comodidade = comodidade;
        this.descricao = descricao;
        this.imagem = imagem;
        this.cadastro = cadastro;
        this.idAbrigo = idAbrigo;
        System.out.println("Pet editado com sucesso!");
    }

    public void removePet() {
        System.out.println("Pet removido com sucesso!");
    }
    
    public abstract void pesarAnimal();
    
    public abstract void vacinarAnimal();


}
