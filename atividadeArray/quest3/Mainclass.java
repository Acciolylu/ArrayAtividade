package atividadeArray.quest3;

import java.util.Arrays;

public class Mainclass {
    public static void main(String[] args) {
        
        Empresa emp1 = new Empresa();
        emp1.setCnpj("123456");
        emp1.setNome("Brigadeiroly");
        emp1.setTelefone("(75)98867-3452");
		Empresa emp2 = new Empresa();
        emp2.setCnpj("78909876");
        emp2.setNome("Brilux");
        emp2.setTelefone("(73) 94567-8756");
        Empresa emp3 = new Empresa();
        emp3.setCnpj("44568876");
        emp3.setNome("Oreo");
        emp3.setTelefone("(11) 95514-2256");

		Funcionario fun1 = new Funcionario();
        fun1.setCpf("147852-52");
        fun1.setNome("Marcio da Silva Araujo");
        fun1.setRg("85297-78");
        fun1.setTelefone("(11) 4002-8922");
        fun1.setEmpresa(emp3);
		Funcionario fun2= new Funcionario();
        fun2.setCpf("123654-43");
        fun2.setNome("Maria das Graças Ferreira");
        fun2.setRg("87419-71");
        fun2.setTelefone("(75) 3282-6060");
        fun2.setEmpresa(emp1);
        Funcionario fun3 = new Funcionario();
        fun3.setCpf("448812-06");
        fun3.setNome("Rafael Britto Silva");
        fun3.setRg("41258-45");
        fun3.setTelefone("(73) 3281-7546");
        fun3.setEmpresa(emp2);

        RegraNegocioEmpresa cadEm = new RegraNegocioEmpresa();
		RegraNegocioFuncionario cadFun = new RegraNegocioFuncionario();

		cadEm.cadastroEmpresa(emp1);
		cadEm.cadastroEmpresa(emp2);
		cadEm.cadastroEmpresa(emp3);

		cadFun.cadastroFuncionario(fun1);
		cadFun.cadastroFuncionario(fun2);
		cadFun.cadastroFuncionario(fun3);
        

		System.out.println(Arrays.toString(cadEm.listarEmpresas()));
        System.out.println("\n-------------------------------------\n");
		System.out.println(Arrays.toString(cadFun.listar()));




    }
    
}
