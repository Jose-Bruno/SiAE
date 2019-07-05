/**
 * 
 */
package entidades;

/**
 * @author livcr
 *
 */
/**
 * 
 */
public abstract class People {
	//Atributos 
	private String name;
	private int idade;
	private String gener;
	private String dataDeNascimento;
	
	//Construtores
	public People(String nome, int idade, String genero) {
		this.name=nome;
		this.idade=idade;
		this.gener=genero;
		
	}
	public People() {}
	
	//Gets e Sets
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	public String toString() {
		return "Seu nome é"+" "+getName()+" "+"Tem idade "+getIdade()+" possui genero "+getGener();
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
