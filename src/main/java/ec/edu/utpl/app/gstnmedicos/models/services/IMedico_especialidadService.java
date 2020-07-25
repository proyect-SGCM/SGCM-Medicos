package ec.edu.utpl.app.gstnmedicos.models.services;

import java.util.List;

import ec.edu.utpl.app.gstnmedicos.models.entity.Medicos_especialidad;

public interface IMedico_especialidadService {

	public List<Medicos_especialidad> listAll();

	public Medicos_especialidad save(Medicos_especialidad medico_especialidad);

	public Medicos_especialidad findById(Long id);

	public void delete(Long id);

}
