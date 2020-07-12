package ec.edu.utpl.app.gstnmedicos.models.services;

import java.util.List;

import ec.edu.utpl.app.gstnmedicos.models.entity.Medico;

public interface IMedicoService {

	public List<Medico> listAll();

	public Medico save(Medico medico);

	public Medico findById(Long id);

	public void delete(Long id);
}
