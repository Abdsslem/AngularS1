package com.example.prof.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.prof.entities.Prof;
import com.example.prof.entities.Specialite;

@RepositoryRestResource(path = "rest")
public interface ProfRepository extends JpaRepository<Prof, Long> {
	
		List<Prof> findByNomProf(String nom);
		List<Prof> findByNomProfContains(String nom);

		
		@Query("select p from Prof p where p.nomProf like %:nom and p.telProf like %:tel")
		List<Prof> findByNomTel (@Param("nom") String nom,@Param("tel") String tel);
		
		
		@Query("select p from Prof p where p.specialite = ?1")
		List<Prof> findBySpecialite (Specialite specialite);
		
		List<Prof> findBySpecialiteIdSpec(Long id);
		List<Prof> findByOrderByNomProfAsc();
		
		@Query("select p from Prof p order by p.nomProf ASC, p.prenomProf DESC")
		List<Prof> trierProfPrenomProf ();
		
		

}
