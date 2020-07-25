package ec.edu.utpl.app.gstnmedicos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.utpl.app.gstnmedicos.models.dao.IMedico_especialidadDao;
import ec.edu.utpl.app.gstnmedicos.models.entity.Medicos_especialidad;

@Service
public class Medico_especialidadServiceImpl implements IMedico_especialidadService {

	@Autowired
	private IMedico_especialidadDao medico_especialidadRepo;

	@Override
	@Transactional(readOnly = true)
	public List<Medicos_especialidad> listAll() {
		// TODO Auto-generated method stub
		return (List<Medicos_especialidad>) medico_especialidadRepo.findAll();
	}

	@Override
	@Transactional
	public Medicos_especialidad save(Medicos_especialidad medico_especialidad) {
		// TODO Auto-generated method stub
		return medico_especialidadRepo.save(medico_especialidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Medicos_especialidad findById(Long id) {
		// TODO Auto-generated method stub
		return medico_especialidadRepo.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		medico_especialidadRepo.deleteById(id);

	}

}
