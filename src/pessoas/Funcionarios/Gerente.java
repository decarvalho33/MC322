package pessoas.Funcionarios;

import biblioteca.sistema.Relatorio;

public class Gerente extends Funcionario implements GerenciaAvancada{
	public Gerente(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}

	@Override
	public void gerenciarInfoObras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarMultas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajustarMulta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Relatorio gerarRelatorio() {
		// TODO Auto-generated method stub
		return null;
	}
}
