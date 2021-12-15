package com.example.prof.restController;
import com.example.prof.entities.Prof;
import com.example.prof.service.ProfService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProfRESTController {

	@Autowired
	ProfService profService;
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Prof> getAllProfs() {
	return profService.getAllProfs();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Prof getProfById(@PathVariable("id") Long id) {
	return profService.getProf(id);
    }
	@RequestMapping(method = RequestMethod.POST)
	public Prof createProf(@RequestBody Prof prof) {
	return profService.saveProf(prof);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Prof updateProf(@RequestBody Prof prof) {
	return profService.updateProf(prof);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProf(@PathVariable("id") Long id)
	{
	profService.deleteProfById(id);
	}
	@RequestMapping(value="/profspec/{idSpec}",method = RequestMethod.GET)
	public List<Prof> getProfBySpecId(@PathVariable("idSpec") Long idSpec) {
	return profService.findBySpecialiteIdSpec(idSpec);
	}
	/*@RequestMapping(path = "/api/all",method = RequestMethod.GET)
	public List<Prof> getAllProfs() {
	return profService.getAllProfs();
	}*/

}
