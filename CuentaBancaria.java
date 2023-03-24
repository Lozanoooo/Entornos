class TestCuentaBancaria
{
	public static void main(String args[])
	{
		CuentaBancaria cuenta = new CuentaBancaria("0234521","Director Banco",100,0);
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
