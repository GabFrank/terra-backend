package franco.dev.terra.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="loteamiento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loteamiento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id()
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_loteamiento")
    @SequenceGenerator(name="seq_loteamiento", sequenceName="loteamiento_id_seq", allocationSize = 1)
	private Integer id;
	
	private String nombre;
	
	private String departamento;
	
	private String ciudad;
	
	private String barrio;
	
	@Column(name = "foto_loteamiento_path")
	private String fotoLoteamientoPath;
	
	private String observaciones;
	
	@ManyToOne
	@JoinColumn(name = "id_proprietario")
	private Proprietario proprietario;

}
