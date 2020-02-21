package exemplo.ejb;

import javax.ejb.Remote;

import exemplo.modelo.Pessoa;

@Remote
public interface PessoaRemote {

	public Pessoa salvar(Pessoa p) throws Exception;

	public Pessoa consultarPorId(Long id);

	public void remover(Long id);
}
