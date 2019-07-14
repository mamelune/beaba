package io.chacha.beaba.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
	private String nompizza;
	private String ingredient1;
	private String ingredient2;
	private String ingredient3;
	private String ingredient4;
	private String ingredient5;
	private String ingredient6;
	private String prix;
	private String photo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNompizza() {
		return nompizza;
	}
	public void setNompizza(String nompizza) {
		this.nompizza = nompizza;
	}
	public String getIngredient1() {
		return ingredient1;
	}
	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}
	public String getIngredient2() {
		return ingredient2;
	}
	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
	}
	public String getIngredient3() {
		return ingredient3;
	}
	public void setIngredient3(String ingredient3) {
		this.ingredient3 = ingredient3;
	}
	public String getIngredient4() {
		return ingredient4;
	}
	public void setIngredient4(String ingredient4) {
		this.ingredient4 = ingredient4;
	}
	public String getIngredient5() {
		return ingredient5;
	}
	public void setIngredient5(String ingredient5) {
		this.ingredient5 = ingredient5;
	}
	public String getIngredient6() {
		return ingredient6;
	}
	public void setIngredient6(String ingredient6) {
		this.ingredient6 = ingredient6;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Pizza(Long id, String nompizza, String ingredient1, String ingredient2, String ingredient3,
			String ingredient4, String ingredient5, String ingredient6, String prix, String photo) {
		super();
		this.id = id;
		this.nompizza = nompizza;
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
		this.ingredient3 = ingredient3;
		this.ingredient4 = ingredient4;
		this.ingredient5 = ingredient5;
		this.ingredient6 = ingredient6;
		this.prix = prix;
		this.photo = photo;
	}
	
	
	
	
}
