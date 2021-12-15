package com.example.prof.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProf", types = { Prof.class })
public interface ProfProjection {

	public String getNomProf();

}
