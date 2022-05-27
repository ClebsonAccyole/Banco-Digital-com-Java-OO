
public class App {

	public static void main(String[] args) {
		
		Cliente Accyole = new Cliente();
		Accyole.setNome("Accyole");
		
		Conta corrente = new ContaCorrente(Accyole);
		Conta poupanca = new ContaPoupanca(Accyole);
		
		corrente.depositar(1000);
		corrente.tranferir(200, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
