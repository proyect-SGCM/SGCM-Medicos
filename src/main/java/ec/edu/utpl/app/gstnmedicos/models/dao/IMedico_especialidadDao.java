package ec.edu.utpl.app.gstnmedicos.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.utpl.app.gstnmedicos.models.entity.Medicos_especialidad;

public interface IMedico_especialidadDao extends JpaRepository<Medicos_especialidad, Long> {

}
