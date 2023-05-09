
public class EnderecoDoador {
  private String cep;
  private String logradouro;
  private String complemento;
  private String bairro;
  private int numero;


  public EnderecoDoador(String cep, String logradouro, String complemento, String bairro, int numero) {
    this.cep = cep;
    this.logradouro = logradouro;
    this.complemento = complemento;
    this.numero = numero;
  }
   

  public void cadastraEnderecoDoador() {
    System.out.println("Adoção cadastrado com sucesso!");
  }

  public void editaEnderecoDoador(String cep, String logradouro, String complemento, String bairro, int numero) {
	  	this.cep = cep;
	    this.logradouro = logradouro;
	    this.complemento = complemento;
	    this.numero = numero;
	  
      System.out.println("EnderecoDoador editado com sucesso!");
  }

  public void removeEnderecoDoador() {
    System.out.println("EnderecoDoador removido com sucesso!");
  }

  
}
