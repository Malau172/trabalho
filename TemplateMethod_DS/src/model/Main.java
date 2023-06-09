package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        GerenciamentoPets ger01 = GerenciamentoPets.getInstance();
        ger01.GeraRelatorio();
        
        Pet pet = new Pet("nome", "26/05/2001", "comodidade", "descricao", "imagem", true, 1);
        String nome = pet.getNome();
        System.out.println(nome);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction();
        em.persist(pet);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
}