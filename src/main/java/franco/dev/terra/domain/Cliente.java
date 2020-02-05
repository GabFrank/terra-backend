package franco.dev.terra.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id()
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_cliente")
    @SequenceGenerator(name="seq_cliente", sequenceName="cliente_id_seq", allocationSize = 1)
	private Integer id;
	
	private String nombre;
	
	private String apellido;
	
	private String ci;
	
	private String telefono;
	
	private String email;
	

}
