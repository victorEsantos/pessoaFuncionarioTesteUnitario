public class Pessoa
{
	private String nome;
	private int idade;
	private char sexo;

	public Pessoa( String nome, int idade, char sexo) {
		super();
		this.idade = idade;
		this.sexo = sexo;
	}

	public void fazerAniversario()
	{
		this.idade++;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public char getSexo()
	{
		return sexo;
	}

	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}

	@Override
	public String toString()
	{
		return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + ", sexo=" + sexo + '}';
	}
}
