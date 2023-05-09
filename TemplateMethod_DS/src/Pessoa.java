import java.util.Date;

public class Pessoa extends Doador{
	 private Date dataNascimento;
	 private String genero;
	 private String interesses;
	 private int idDoador;
	
    public Pessoa(String nome, String contato, String email, int idEnderecoDoador, Date dataNascimento, String genero, String interesses, int idDoador) {
    	super(nome, contato, email, idEnderecoDoador);
    	this.dataNascimento = dataNascimento;
	    this.interesses = interesses;
	    this.idDoador = idDoador;
    }
    
    public void cadastraPessoa() {
        System.out.println("Pessoa cadastrada com sucesso!");
      }

      public void editaPessoa(Date dataNascimento, String genero, String interesses, int idDoador) {
      	this.dataNascimento = dataNascimento;
  	    this.interesses = interesses;
  	    this.idDoador = idDoador;
    	  
          System.out.println("Pessoa editada com sucesso!");
      }

      public void removePessoa() {
        System.out.println("Pessoa removida com sucesso!");
      }
}
