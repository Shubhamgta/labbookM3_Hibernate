package com.capg;

import java.util.List;

import javax.persistence.*;
public class AuthorMain {
	EntityManagerFactory emf;
	public static void main(String[] args) {
		AuthorMain authorMain=new AuthorMain();
		authorMain.execute();
	
	}
	private void execute() {
	emf = Persistence.createEntityManagerFactory("author-mgt");
	Author author=createAuthor();
	int id=author.getAuthorId();
	Author found= findAuthorById(id);
	System.out.println("Author found with name = "+found.getFirstName());
	
	found.setFirstName("Stephen");
	updateAuthor(found);
	
	printAuthorDetails(found);
		
	List<Author> authors=fetchAllAuthors();
	System.out.println("Printing all authors" );
	printAllAuthors(authors);
	
	//removeAuthorById(id);
	
	}
	private void removeAuthorById(int id) {
		EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Author author= em.find(Author.class, id);
        em.remove(author);
        transaction.commit();
        System.out.println("Author removed with name = "+author.getFirstName());
        em.close();
        
        
		
	}
	private void printAllAuthors(List<Author> authors) {
		for(Author author:authors) {
			printAuthorDetails(author);
		}
		
	}
	private List<Author> fetchAllAuthors() {
		EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Query query =em.createQuery("from AuthorDetails");
        List<Author>authors=query.getResultList();
        return authors;
	
	}
	private void printAuthorDetails(Author author) {
		System.out.println("Author Id : "+author.getAuthorId()+ " Author Name : "+author.getFirstName()+" "+author.getMiddleName()+" "+author.getLastName());
		
		
	}
	private void updateAuthor(Author author) {

		EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        author=em.merge(author);
        transaction.commit();
        em.close();
        
		
	}
	private Author findAuthorById(int id) {
		
		EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Author author= em.find(Author.class, id);
        transaction.commit();
        em.close();
        return author;

	}
	private Author createAuthor() {
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		
		Author author=new Author();
		author.setFirstName("Chetan");
		author.setMiddleName("S.");
		author.setLastName("Bhagat");
		
		em.persist(author);
		
		transaction.commit();
		
		System.out.println("A author named "+author.getFirstName()+" is added");
		em.close();
		return author;
		
	}

}
