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
    private String imagem;
    private boolean cadastro;
    private int idAbrigo;


    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getComodidade() {
		return comodidade;
	}

	public void setComodidade(String comodidade) {
		this.comodidade = comodidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String string) {
		this.imagem = string;
	}

	public boolean isCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}

	public int getIdAbrigo() {
		return idAbrigo;
	}

	public void setIdAbrigo(int idAbrigo) {
		this.idAbrigo = idAbrigo;
	}

	public Pet(String nome, Date data_nascimento, String comodidade, String descricao, String imagem, boolean cadastro, int idAbrigo) {
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

    public void editaPet(String nome, Date data_nascimento, String comodidade, String descricao, String imagem, boolean cadastro, int idAbrigo) {
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
