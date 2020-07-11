package ec.edu.utpl.app.gstnmedicos.models.services;

import java.util.List;

import ec.edu.utpl.app.gstnmedicos.models.entity.Especialidad;

public interface IEspecialidadService {

	public List<Especialidad> listAll();

	public void saveEspecialidad(Especialidad especialidad);

	public Especialidad EspecialidadbyId(Long id);

	public void deleteEspecialidad(Long id);

}
