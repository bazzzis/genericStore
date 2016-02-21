package model.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	@Column(nullable = false, columnDefinition="TEXT")
	private String title;
	@Column(nullable = false, columnDefinition="TEXT")
	private String shortDescription;
	@Column(nullable = false, columnDefinition="TEXT")
	private String description;
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "productsList")
	private DropShipper dropshipper;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DropShipper getDropshipper() {
		return dropshipper;
	}
	public void setDropshipper(DropShipper dropshipper) {
		this.dropshipper = dropshipper;
	}
	
	
	
	

}
