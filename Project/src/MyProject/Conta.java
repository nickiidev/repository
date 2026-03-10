package MyProject;

public class Conta {
	
	int numero;
	double saldo;
	double limite;
	String dono;
	
	void sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

}
