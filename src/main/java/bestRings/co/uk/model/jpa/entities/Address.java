package bestRings.co.uk.model.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import bestRings.co.uk.util.enums.Countries;
@Entity
@NamedQueries(value = { @NamedQuery(name = "Address.findByContactName", query = "select adr from Address adr where adr.contactName=:contactName") })
public class Address {


	
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	private Long id;
@Enumerated(EnumType.STRING)
private Enum<Countries> country;
@Column( nullable = false, columnDefinition="TEXT")
String contactName;
@Column( nullable = false, columnDefinition="TEXT")
private String streetName;
@Column( nullable = false, columnDefinition="TEXT")
private String streetName2;
@Column( nullable = true, columnDefinition="TEXT")
private String city;
@Column( nullable = true, columnDefinition="TEXT")
private String postalCode;

@Column(columnDefinition="TEXT")
private String telephone;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Enum<Countries> getCountry() {
	return country;
}

public void setCountry(Enum<Countries> country) {
	this.country = country;
}

public String getContactName() {
	return contactName;
}

public void setContactName(String contactName) {
	this.contactName = contactName;
}

public String getStreetName() {
	return streetName;
}

public void setStreetName(String streetName) {
	this.streetName = streetName;
}

public String getStreetName2() {
	return streetName2;
}

public void setStreetName2(String streetName2) {
	this.streetName2 = streetName2;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPostalCode() {
	return postalCode;
}

public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}


	
	

}
