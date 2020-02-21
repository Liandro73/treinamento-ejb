package exemplo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import exemplo.dao.PessoaDAO;
import exemplo.modelo.Pessoa;

@Stateless
public class PessoaBean implements PessoaRemote {

	@PersistenceContext(unitName = "Pessoa_PU")
	private EntityManager em;

	private PessoaDAO dao = new PessoaDAO(em);

	@Override
	public Pessoa salvar(Pessoa p) throws Exception {
		return dao.salvar(p);
	}

	@Override
	public Pessoa consultarPorId(Long id) {
		return dao.consultarPorId(id);
	}

	@Override
	public void remover(Long id) {
		dao.remover(id);
	}

}
