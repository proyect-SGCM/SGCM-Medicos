package ec.edu.utpl.app.gstnmedicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.utpl.app.gstnmedicos.models.entity.Medico;
import ec.edu.utpl.app.gstnmedicos.models.services.IMedicoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/gst_medico")
public class MedicoController {

	@Autowired
	private IMedicoService medicoService;

	/* -------------- Crear Médico -------------- */

	@PostMapping("/crear_medico")
	@ResponseStatus(HttpStatus.CREATED)
	public Medico crearMedico(@RequestBody Medico medico) {

		return medicoService.save(medico);
	}

	/* -------------- Listar Médico -------------- */

	@GetMapping("/listar_medico")
	public List<Medico> listarMedico() {

		return medicoService.listAll();
	}

	/* -------------- Ver Medico -------------- */

	@GetMapping("/medico/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Medico verMedico(@PathVariable Long id) {

		return medicoService.findById(id);
	}

	/* -------------- Editar Médico -------------- */

	@PutMapping("/medico/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Medico editarMedico(@RequestBody Medico medico, @PathVariable Long id) {

		Medico medicoActual = medicoService.findById(id);

		medicoActual.setNombre(medico.getNombre());
		medicoActual.setApellido(medico.getApellido());
		medicoActual.setNro_consultorio(medico.getNro_consultorio());

		return medicoService.save(medicoActual);
	}

	/* -------------- Eliminar Médico -------------- */

	@DeleteMapping("/medico/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarMedico(@PathVariable Long id) {

		medicoService.delete(id);
	}

}
