
public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		gerente.setSobrenome("Toledo");
		Vendedor vendedor = new Vendedor();
		Administrador administrador =  new Administrador();
		System.out.println(gerente.getSobrenome());
		Senha senha = new Senha();
		senha.novaSenha(gerente);
		//senha.novaSenha(vendedor);
		senha.novaSenha(administrador);
	
		 
		 
	}

}
