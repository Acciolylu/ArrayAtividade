package atividadeArray.quest3;

public class RegraNegocioEmpresa {
    

	Empresa[] empres = new Empresa[3];

	int cont = 0;

	public void cadastroEmpresa(Empresa empresa) {

		if(cont<empres.length) {
			empres[cont] = empresa;
			cont++;
		}else {
			System.out.println("Não foi possível adicionar esta empresa, todos os espaços ja foram prenchidos");
		}


	}


	public Empresa[] listarEmpresas() {
		return empres;
	}




}
