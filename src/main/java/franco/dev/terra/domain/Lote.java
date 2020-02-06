package franco.dev.terra.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import franco.dev.terra.domain.enums.TipoLindero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="lote")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lote implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id()
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_lote")
    @SequenceGenerator(name="seq_lote", sequenceName="lote_id_seq", allocationSize = 1)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_loteamiento")
	private Loteamiento loteamiento;
	
	private Integer numero;
	
	private String manzana;
	
	@Column(name = "nro_cadastral")
	private Integer nroCadastral;
	
	private Double dimension;
	
	@Enumerated(EnumType.STRING)
	private TipoLindero linderos;
	
	@Column(name = "tipo_superficie")
	private String tipoSuperficie;
	
	@Column(name = "precio_contado")
	private Double precioContado;
	
	@Column(name = "precio_financiado")
	private Double precioFinanciado;
	
	
	

}
