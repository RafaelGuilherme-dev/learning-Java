public class Main {

	public static String Digito(String cpf) {
		int restosoma = 0;
		int peso = cpf.length() + 1;
		for (int i = 0; i < cpf.length(); i++) {
			restosoma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * peso;
			peso--;
		}
		var resto = restosoma % 11;
		Integer dv = (resto < 2) ? 0 : 11 - resto;
		return dv.toString();
	}

	public static boolean DigitoVericadorCpf(String cpf) {
		cpf = cpf.trim().replace(".", "").replace("-", "");
		String _cpf = cpf;
		if (cpf.length() != 11)
			return false;

		_cpf = _cpf.substring(0, 9);
		System.out.println(_cpf);

		var dv = Digito(_cpf);
		_cpf += dv.toString();
		dv = Digito(_cpf);
		_cpf += dv.toString();

		System.out.println(_cpf);

		return _cpf.equals(cpf);
	}

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		System.out.print( DigitoVericadorCpf("109.234.444-67"));
	}

}