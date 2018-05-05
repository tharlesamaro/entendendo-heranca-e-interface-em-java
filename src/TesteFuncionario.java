
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario tharles = new Funcionario();
		tharles.setNome("Tharles Amaro");
		tharles.setCpf("1111111111-1");
		tharles.setSalario(2600.00);
		
		System.out.println(tharles.getNome());
		System.out.println(tharles.getBonificacao());
	}

}
