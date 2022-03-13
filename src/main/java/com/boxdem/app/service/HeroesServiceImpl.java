package com.boxdem.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boxdem.app.dao.HeroesDao;
import com.boxdem.app.dto.HabilidadesDTO;
import com.boxdem.app.dto.HeroeDTO;
import com.boxdem.app.dto.MascotaDTO;
import com.boxdem.app.dto.SkinDTO;
import com.boxdem.app.dto.TalentosDTO;
import com.boxdem.app.entity.HeroeEntity;

@Service
public class HeroesServiceImpl implements HeroesService {

	@Autowired
	private HeroesDao heroesDao;
	
	public HeroeDTO obtenerHeroe(Long id) {
		HeroeDTO heroeResponse = new HeroeDTO();
		MascotaDTO mascota = new MascotaDTO();
		
		HeroeEntity heroe = heroesDao.findById(id).orElse(null);
		
		heroeResponse.setNombre(heroe.getNombre());
		heroeResponse.setEquipamiento(heroe.getEquipamiento());
		
		mascota.setNombre(heroe.getMascota().getNombre());
		mascota.setHabilidad(heroe.getMascota().getHabilidad());
		mascota.setNivelHabilidad(heroe.getMascota().getNivel_habilidad());
		
		heroeResponse.setMascota(mascota);
		
		/*HabilidadesDTO habilidad = new HabilidadesDTO();
		habilidad.setNombre("Aries habilidad");
		List<TalentosDTO> talentos = new ArrayList<>();
		List<SkinDTO> skins = new ArrayList<>();
		
		se agregan los talentos
		TalentosDTO talento1 = new TalentosDTO();
		TalentosDTO talento2 = new TalentosDTO();
		talento1.setNombre("furioso");
		talento1.setDescripcion("aumenta el ataque");
		talento1.setIcono("mano");
		talento2.setNombre("quemarr");
		talento2.setDescripcion("anula en ataque");
		talento2.setIcono("xxxxxx");
		talentos.add(talento1);
		talentos.add(talento2);
		
		
		se agregan skins 
		SkinDTO skin1 = new SkinDTO();
		SkinDTO skin2 = new SkinDTO();
		skin1.setNombre("policia");
		skin1.setDescripcion("tiene, botas y traje");
		skin1.setBeneficio("cura");
		skin2.setNombre("estudiante");
		skin2.setDescripcion("uniforme");
		skin2.setBeneficio("aumenta ataque");
		skins.add(skin1);
		skins.add(skin2);
		
		
		
		se valida talento ingresado
		switch (heroe.getPinaculo()) {
		case "revitalizar":
			heroeResponse.setNombre("Aries");
			heroeResponse.setPinaculo("revitalizar");
			heroeResponse.setHabilidad(habilidad);
			heroeResponse.setTalentos(talentos);
			heroeResponse.setSkin(skins);
			break;
		case "revivir":
			heroeResponse.setNombre("Treantauro");
			heroeResponse.setPinaculo("revivir");
			habilidad.setNombre("Treantauro revivir");
			heroeResponse.setHabilidad(habilidad);
			heroeResponse.setTalentos(talentos);
			break;
		case "Baluarte":
			heroeResponse.setNombre("todos");
			heroeResponse.setPinaculo("Baluarte");
			habilidad.setNombre("habilidades varias");
			heroeResponse.setHabilidad(habilidad);
			break;
		}

		System.out.println("datos del heroe: " + heroe.toString());*/
		return heroeResponse;
	}

	public void agregarHeroe() {
		
		System.out.println("mensaje prueba");
		
	}
	
	

}
