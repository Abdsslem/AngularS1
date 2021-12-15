package com.example.prof.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prof.entities.Prof;
import com.example.prof.entities.Specialite;
import com.example.prof.repos.ProfRepository;


@Service
public class ProfServiceImpl implements ProfService {
	
	@Autowired
	ProfRepository profRepository;

	@Override
	public Prof saveProf(Prof p) {
		// TODO Auto-generated method stub
		return profRepository.save(p);
	}

	@Override
	public Prof updateProf(Prof p) {
		// TODO Auto-generated method stub
		return profRepository.save(p);
	}

	@Override
	public void deleteProf(Prof p) {
		// TODO Auto-generated method stub
		profRepository.delete(p);
		
	}

	@Override
	public void deleteProfById(Long id) {
		// TODO Auto-generated method stub
		profRepository.deleteById(id);
		
	}

	@Override
	public Prof getProf(Long id) {
		// TODO Auto-generated method stub
		return profRepository.findById(id).get();
	}

	@Override
	public List<Prof> getAllProfs() {
		// TODO Auto-generated method stub
		return profRepository.findAll();
	}

	@Override
	public List<Prof> findByNomProf(String nom) {
		// TODO Auto-generated method stub
		return profRepository.findByNomProf(nom);
	}

	@Override
	public List<Prof> findByNomProfContains(String nom) {
		// TODO Auto-generated method stub
		return profRepository.findByNomProfContains(nom);
	}

	

	@Override
	public List<Prof> findBySpecialite(Specialite specialite) {
		// TODO Auto-generated method stub
		return profRepository.findBySpecialite(specialite);
	}

	@Override
	public List<Prof> findBySpecialiteIdSpec(Long idSpec) {
		// TODO Auto-generated method stub
		return profRepository.findBySpecialiteIdSpec(idSpec);
	}

	@Override
	public List<Prof> findByOrderByNomProfAsc() {
		// TODO Auto-generated method stub
		return profRepository.findByOrderByNomProfAsc();
	}

	@Override
	public List<Prof> findByPrenomProf(String nom, String prenom) {
		// TODO Auto-generated method stub
		return null;
	}


	
}