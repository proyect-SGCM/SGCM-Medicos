package ec.edu.utpl.app.gstnmedicos.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ec.edu.utpl.app.gstnmedicos.models.entity.Especialidad;
import ec.edu.utpl.app.gstnmedicos.models.services.EspecialidadServiceImpl;

@Controller
public class EspecialidadController {

	@Autowired
	private EspecialidadServiceImpl especialidadService;

	/* -------------- Crear Especialidad -------------- */

	@RequestMapping("/crear_especialidad")
	public String crearEspecialidad(Model model) {
		Especialidad especialidad = new Especialidad();
		model.addAttribute("especialidad", especialidad);

		return "especialidad/crear_especialidad";
	}

	/* -------------- Listar Especialidad -------------- */

	@RequestMapping("/listar_especialidad")
	public String listarEspecialidad(Model model) {
		List<Especialidad> listEspecialidad = especialidadService.listAll();
		model.addAttribute("listEspecialidad", listEspecialidad);

		return "especialidad/listar_especialidad";
	}

	/* -------------- Guardar Especialidad -------------- */

	@RequestMapping(value = "/guardar_especialidad", method = RequestMethod.POST)
	public String guardarEspecialidad(@ModelAttribute("especialidad") Especialidad especialidad) {

		especialidadService.saveEspecialidad(especialidad);
		return "redirect:/especialidad/listar_especialidad";
	}

	/* -------------- Editar Especialidad -------------- */

	@RequestMapping(value = "/editar_especialidad/{id_medico}")
	public String editarEspecialidad(@PathVariable(value = "id_especialidad") long id_especialidad,
			Map<String, Object> model) {

		Especialidad especialidad = null;

		if (id_especialidad > 0) {
			especialidad = especialidadService.EspecialidadbyId(id_especialidad);
			if (especialidad == null) {
				return "redirect:/especialidad/listar_especialidad";
			}
		} else {
			return "redirect:/especialidad/listar_especialidad";
		}

		model.put("especialidad", especialidad);

		return "especialidad/editar_especialidad";
	}

	/* -------------- Eliminar Especialidad -------------- */

	@RequestMapping("/eliminar_especialidad/{id_medico}")
	public String eliminarEspecialidad(@PathVariable(name = "id_especialidad") long id_especialidad) {

		if (id_especialidad > 0) {
			especialidadService.deleteEspecialidad(id_especialidad);
		}
		return "redirect:/especialidad/listar_especialidad";
	}

}
