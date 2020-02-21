package exemplo.dao;

import javax.persistence.EntityManager;

import exemplo.modelo.Pessoa;

public class PessoaDAO {

	private EntityManager em;

	public PessoaDAO(EntityManager em) {
		this.em = em;
	}

	public Pessoa salvar(Pessoa p) throws Exception {
		if (p.getId() == null) {
			em.persist(p);
		} else {
			if (!em.contains(p)) {
				if (em.find(Pessoa.class, p.getId()) == null) {
					throw new Exception("Erro ao atualizar os dados da Pessoa!!!");
				}
			}
		}

		return p;
	}

	public Pessoa consultarPorId(Long id) {
		return em.find(Pessoa.class, id);
	}

	public void remover(Long id) {
		Pessoa p = consultarPorId(id);
		em.remove(p);
	}

}
