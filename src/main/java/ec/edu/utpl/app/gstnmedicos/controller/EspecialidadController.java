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

import ec.edu.utpl.app.gstnmedicos.models.entity.Especialidad;
import ec.edu.utpl.app.gstnmedicos.models.services.IEspecialidadService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/gst_especialidad")
public class EspecialidadController {

	@Autowired
	private IEspecialidadService especialidadService;

	/* -------------- Crear Especialidad -------------- */

	@PostMapping("/crear_especialidad")
	@ResponseStatus(HttpStatus.CREATED)
	public Especialidad crearEspecialidad(@RequestBody Especialidad especialidad) {

		return especialidadService.save(especialidad);
	}

	/* -------------- Listar Especialidades -------------- */

	@GetMapping("/listar_especialidades")
	public List<Especialidad> listarEspecialidad() {

		return especialidadService.listAll();
	}

	/* -------------- Ver Especialidad -------------- */

	@GetMapping("/especialidad/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Especialidad verEspecialidad(@PathVariable Long id) {

		return especialidadService.findById(id);
	}

	/* -------------- Editar Especialidad -------------- */

	@PutMapping("/especialidad/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Especialidad editarEspecialidad(@RequestBody Especialidad especialidad, @PathVariable Long id) {

		Especialidad especialidadActual = especialidadService.findById(id);

		especialidadActual.setCodigo(especialidad.getCodigo());
		especialidadActual.setNombre(especialidad.getNombre());

		return especialidadService.save(especialidadActual);
	}

	/* -------------- Eliminar Especialidad -------------- */

	@DeleteMapping("/especialidad/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarEspecialidad(@PathVariable Long id) {

		especialidadService.delete(id);
	}

}
