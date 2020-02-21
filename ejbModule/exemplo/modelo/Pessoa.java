package exemplo.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "PES_SEQ", sequenceName = "PESSOA_SEQ", initialValue = 1, allocationSize = 1)
public class Pessoa implements Serializable {
	private static final long serialVersionUID = -3390700353351295024L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PES_SEQ")
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(name = "data_nasc", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date nascimento;
	@Column
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
