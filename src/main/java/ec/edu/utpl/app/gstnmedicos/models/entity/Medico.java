package ec.edu.utpl.app.gstnmedicos.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_medico;
	private String nombre;
	private String apellido;
	private int nro_consultorio;

	public Medico() {

	}

	public long getId_medico() {
		return id_medico;
	}

	public void setId_medico(long id_medico) {
		this.id_medico = id_medico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNro_consultorio() {
		return nro_consultorio;
	}

	public void setNro_consultorio(int nro_consultorio) {
		this.nro_consultorio = nro_consultorio;
	}

	private static final long serialVersionUID = 1L;

}
