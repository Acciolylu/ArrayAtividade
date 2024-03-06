package atividadeArray.quest3;

public class RegraNegocioFuncionario {

    Funcionario[] funcionario = new Funcionario[3];

    int cont = 0;
    
    public void cadastroFuncionario(Funcionario func) {
  
            funcionario[cont] = func;
            cont++;
    
    }
    
    public Funcionario[] listar() {
        return funcionario;
    }
}
