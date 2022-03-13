package com.boxdem.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boxdem.app.dto.HabilidadesDTO;
import com.boxdem.app.dto.HeroeDTO;
import com.boxdem.app.dto.SkinDTO;
import com.boxdem.app.dto.TalentosDTO;
import com.boxdem.app.service.HeroesService;

@RestController
public class CastleClashController {
	
	@Autowired
	private HeroesService heroeService;

	@GetMapping(value = "/heroe")
	public String holaMundo() {
		System.out.println("pasando por controlador");
		return "Hola mundo con spring";
	}

	/*
	 * @PostMapping(value = "heroe") public String heroeCf() { String mensaje = "";
	 * String heroe = "Paladin"; if(heroe == "Paladin") {
	 * System.out.println("el heroe es tanque"); mensaje = "el heroe es tanque";
	 * }else { System.out.println("el heroe no es tanque"); mensaje =
	 * "el heroe no es tanque"; } return mensaje; }
	 */

	@GetMapping(value = "/heroe/{id}")
	public ResponseEntity<HeroeDTO> obtenerHeroe(@PathVariable Long id) {
		
		return ResponseEntity.ok(heroeService.obtenerHeroe(id));
		
	}

	@DeleteMapping(value = "eliminarheroe/{heroe}")
	public String eliminarHeroe(@PathVariable String heroe) {
		System.out.println("el heroe a eliminar es: " + heroe);
		String mensaje = "hola";
		switch (heroe) {
		case "paladin":
			mensaje = "el heroe eliminado es paladin";
			break;
		case "calabaza":
			mensaje = "el heroe eliminado es calabaza";
			break;
		case "santa boom":
			mensaje = "el heroe eliminado es santa boom";
			break;
		}
		return mensaje;
	}
	
	@PostMapping(value = "/heroe/mascota")
	public ResponseEntity<HeroeDTO> agregarMascotaHeroe(@RequestBody HeroeDTO heroe) {
		
		return ResponseEntity.ok(heroeService.obtenerHeroe(1L));
		
	}

}
