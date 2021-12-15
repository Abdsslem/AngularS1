package com.example.prof.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Specialite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSpec;
	private String libelleSpec;
	private String descriptionSpec;
	
	@JsonIgnore
	@OneToMany(mappedBy = "specialite")
	private List<Prof> profs;
	

	
	public Specialite(String libelleSpec, String descriptionSpec, List<Prof> profs)
	{

	super();
	this.libelleSpec = libelleSpec;
	this.descriptionSpec = descriptionSpec;
	this.profs = profs;
	}
	public Long getIdSpec() {
	return idSpec;
	}
	public void setIdSpec(Long idSpec) {
	this.idSpec = idSpec;
	}
	public String getLibelleSpec() {
	return libelleSpec;
	}
	public void setLibelleSpec(String libelleSpec) {
	this.libelleSpec = libelleSpec;
	}
	public String getDescriptionSpec() {
	return descriptionSpec;
	}
	public void setDescriptionSpec(String descriptionSpec) {
	this.descriptionSpec = descriptionSpec;
	}
	public List<Prof> getProfs() {
	return profs;
	}
	public void setProduits(List<Prof> profs) {
	this.profs = profs;
	}
	
	
}


