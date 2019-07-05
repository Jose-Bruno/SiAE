package entidades;
/**
* @author livcr
*
*/

public class Aluno extends People implements User {
	
	//atributos 
	private String nome;
	protected int idade;
	private String genero;
	private String matricula;
	private String userSis;
	private String senha;
	private String type;
	
	
	//Construtor

	public Aluno(String nome, int idade, String genero) {
		super(nome, idade, genero);
		
	}
	public Aluno() {}
	
	
	//Gets e sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//public void AlterarSenha(String nova);
	public String getUserSis() {
		return userSis;
	}
	public void setUserSis(String userSis) {
		this.userSis = userSis;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void CriarUsuario(String user, String tipo, String senha) {
		setUserSis(user);
		setType(tipo);
		setSenha(senha);
	}
	@Override
	public void AlterarSenha(String nova) {
		if(senha != null) {
			setSenha(nova);
		}
		else {
			System.out.print("Operação inválida");
		}
	}

}
