package com.example.prof.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Prof {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idProf;
private String nomProf;
private String prenomProf;
private String telProf;

@ManyToOne
private Specialite specialite;

public Prof() {
super();
}
public Prof(String nomProf, String prenomProf, String telProf) {
super();
this.nomProf = nomProf;
this.prenomProf = prenomProf;
this.telProf = telProf;
}

public Long getIdProf() {

return idProf;
}
public void setIdProf(Long idProf) {
this.idProf = idProf;
}
public String getNomProf() {
return nomProf;
}
public void setNomProf(String nomProf) {
this.nomProf = nomProf;
}
public String getPrenomProf() {
return prenomProf;
}
public void setPrenomProf(String prenomProf) {
this.prenomProf = prenomProf;
}
public String getTelProf() {
return telProf;
}
public void getTelProf(String telProf) {
this.telProf = telProf;
}
@Override
public String toString() {
return "Prof [idProf=" + idProf + ", nomProf=" +

nomProf + ", prixProf=" + prenomProf

+ ", telProf=" + telProf + "]";

}
}