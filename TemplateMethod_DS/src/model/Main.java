package model;
import java.util.Date;
import model.Pet;
import model.Doador;
import model.Adotante;

public class Main {
    public static void main(String[] args) {
        GerenciamentoPets ger01 = GerenciamentoPets.getInstance();
        ger01.GeraRelatorio();
        
        Pet pet = new Pet("nome", new Date("26/05/2001"), "comodidade", "descricao", "imagem", true, 1);
//        pet.setNome("nome");
//        pet.setCadastro(true);
//        pet.setComodidade("mora na casinha");
//        pet.setData_nascimento(new Date("26/05/2001"));
//        pet.setDescricao("descricao do pet");
//        pet.setId((long) 1);
//        pet.setIdAbrigo(1);
//        pet.setImagem("base64 imagem");
        String nome = pet.getNome();
        System.out.println(nome);
        
    }

    public static void main(String[] args) {
        GerenciamentoDoador ger01 = GerenciamentoDoador.getInstance();
        ger01.GeraRelatorio();
        
        Doador doador1 = new Doador(nome:"nome", contato: "283273273", email: "doadorteste@gmail.com", idEnderecoDoador: 2);
            doador1.setNome("nome");
            doador1.setContato("2323232");
            doador1.setEmail("doadorteste@gmail.com");
            doador1.idEnderecoDoador((long) 1);
        
    }

    public static void main(String[] args) {
        GerenciamentoAdotante ger01 = GerenciamentoAdotante.getInstance();
        ger01.GeraRelatorio();
        
        Adotante adotante1 = new Adotante(nome:"adotante", contato: "283273273", email: "adotanteteste@gmail.com", idEndereco: 2, complemento: "E");
            adotante1.setNome("nome");
            adotante1.setContato("2323232");
            adotante1.setEmail("doadorteste@gmail.com");
            adotante1.idEnderecoDoador((long) 2);
        
    }
}