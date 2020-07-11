package ec.edu.utpl.app.gstnmedicos.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.utpl.app.gstnmedicos.models.entity.Especialidad;

public interface IEspecialidadDao extends JpaRepository<Especialidad, Long> {

}
