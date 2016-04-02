package bestRings.co.uk.model.jpa.entities;

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
public class DropShipper implements AbstractEntity{
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
	
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getLegalAddress() {
		return legalAddress;
	}
	public void setLegalAddress(Address legalAddress) {
		this.legalAddress = legalAddress;
	}
	public Address getDepotAddress() {
		return depotAddress;
	}
	public void setDepotAddress(Address depotAddress) {
		this.depotAddress = depotAddress;
	}
	public List<Product> getProductsList() {
		return productsList;
	}
	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}
	
	
	
	
	
	
	
}
