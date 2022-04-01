package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.interfaceService.IPersonaService;
import com.example.interfaces.IPersona;
import com.example.modelo.Persona;

@Service
public class PersonaService implements IPersonaService {
	@Autowired
	private IPersona iPersona;

	@Override
	public List<Persona> listar() {
		return (List<Persona>) iPersona.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona = iPersona.save(p);
		if (!persona.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
