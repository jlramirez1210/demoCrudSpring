package com.example.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
