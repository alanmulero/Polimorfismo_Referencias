
public abstract class Controle {
	private int senha = 11;
	
	private Senha referenciaSenha;

	

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// Metodo autentica
	
	public boolean autentica(Controle conta) {
		if(this.senha == conta.getSenha()) {
			System.out.println("Senha Confere em Controle");
			return true;
		}else {
			System.out.println("Erro de senha em Controle");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

}
