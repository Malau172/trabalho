public class EnderecoAdotante {
  private String cep;
  private String logradouro;
  private String bairro;
  private String email;
  private String complemento;
  private int numero;
  
  public EnderecoAdotante(String cep, String logradouro, String bairro, String email, String complemento, int numero) {
    this.cep = cep;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.email = email;
    this.complemento = complemento;
    this.numero = numero;
    
  }
  
  public void cadastraEnderecoAdotante() {
    System.out.println("Endereço Adotante cadastrado com sucesso!");
  }
  
  public void editaAdotante(String cep, String logradouro, String bairro, String email, String complemento, int numero) {
    this.cep = cep;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.email = email;
    this.complemento = complemento;
    this.numero = numero;
  
    System.out.println("Endereço Adotante  com sucesso!");
  }
  
  public void removeAdotante() {
    System.out.println("Endereço Adotante  reovidocom sucesso!");
  }
  
  
}
