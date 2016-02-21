package model.jpa.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class DropShipper {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	@Column( nullable = false, columnDefinition="TEXT")
	private String legalName;
	@Column( nullable = false, columnDefinition="TEXT")
	private String name;
	@OneToOne
	@JoinColumn(name="legalAddress")
	private Address legalAddress;
	@OneToOne
	@JoinColumn(name="depotAddress")
	private Address depotAddress;
	@OneToMany( fetch = FetchType.LAZY ,  mappedBy = "dropshipper")
	private List<Product> productsList;
	
	
	
}
