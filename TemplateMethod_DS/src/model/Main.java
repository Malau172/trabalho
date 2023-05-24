package model;
import java.util.Date;
import model.Pet;

public class Main {
    public static void main(String[] args) {
        GerenciamentoPets ger01 = GerenciamentoPets.getInstance();
        ger01.GeraRelatorio();
        
        Pet pet = new Pet();
        pet.setNome("nome");
        pet.setCadastro(true);
        pet.setComodidade("mora na casinha");
        pet.setData_nascimento(new Date("26/05/2001"));
        pet.setDescricao("descricao do pet");
        pet.setId((long) 1);
        pet.setIdAbrigo(1);
        pet.setImagem("base64 imagem");
        
    }
}