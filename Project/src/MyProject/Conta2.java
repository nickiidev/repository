package MyProject;

public class Conta2 {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		contaCorrente.dono = "Nicole";
		contaCorrente.limite = 20000.0;
		contaCorrente.numero = 1234;
		contaCorrente.saldo = 4000.0;
		
		System.out.println("A conta do(a) " + contaCorrente.dono);
		System.out.println("Meu saldo é " + contaCorrente.saldo);
		
		contaCorrente.sacar(1500.0);
		
		System.out.println("Meu saldo após saque é de " + contaCorrente.saldo);
	}

}
