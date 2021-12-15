package com.example.prof.service;


import java.util.List;
import com.example.prof.entities.Prof;
import com.example.prof.entities.Specialite;



public interface ProfService {
Prof saveProf(Prof p);
Prof updateProf(Prof p);
void deleteProf(Prof p);
void deleteProfById(Long id);
Prof getProf(Long id);
List<Prof> getAllProfs();
List<Prof> findByNomProf(String nom);
List<Prof> findByNomProfContains(String nom);
List<Prof> findByPrenomProf (String nom, String prenom);
List<Prof> findBySpecialite (Specialite specialite);
List<Prof> findBySpecialiteIdSpec(Long idSpec);
List<Prof> findByOrderByNomProfAsc();

}