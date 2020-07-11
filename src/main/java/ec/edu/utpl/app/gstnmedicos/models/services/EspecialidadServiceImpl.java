package ec.edu.utpl.app.gstnmedicos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.utpl.app.gstnmedicos.models.dao.IEspecialidadDao;
import ec.edu.utpl.app.gstnmedicos.models.entity.Especialidad;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService {

	@Autowired
	private IEspecialidadDao especialidadRepo;

	@Override
	public List<Especialidad> listAll() {
		// TODO Auto-generated method stub
		return especialidadRepo.findAll();
	}

	@Override
	public void saveEspecialidad(Especialidad especialidad) {
		especialidadRepo.save(especialidad);

	}

	@Override
	public Especialidad EspecialidadbyId(Long id) {
		// TODO Auto-generated method stub
		return especialidadRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteEspecialidad(Long id) {
		especialidadRepo.deleteById(id);

	}

}
