package com.pwrfit.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pwrfit.modelos.Datos;
import com.pwrfit.repositorio.InterfaceDato;

@RestController
@RequestMapping("/datos")
public class DatosControlador {
    @Autowired
    private InterfaceDato interfazDato;

    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<Datos> datos(){
		return (List<Datos>) interfazDato.findAll();
	}

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/ver/{id}")
	public Optional<Datos> getUnDato(@PathVariable("id") Integer id){
		return interfazDato.findById(id);
	}

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public void insertar(@RequestBody Datos dat) {
		interfazDato.save(dat);
	}

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
	public void modificar(@RequestBody Datos dat) {
		interfazDato.save(dat);
	}

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value="/borrar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		interfazDato.deleteById(id);
	}
}
