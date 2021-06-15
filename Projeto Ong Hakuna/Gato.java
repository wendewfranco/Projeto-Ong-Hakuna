package Generation;

import java.util.Scanner;

public class Gato {

	private String nome;
	private int idade;
	private String cor;
	private String sexo;
	private String doenca;
	private String raca;
	private String porte;
	private String vacina;
	private String castrado;
	private String comportamento;
	private String endereco;
	private int telefone;

	public Gato(String nome, int idade, String cor, String sexo, String doenca, String raca, String porte,
			String vacina, String castrado, String comportamento, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.castrado = castrado;
		this.comportamento = comportamento;
		this.cor = cor;
		this.doenca = doenca;
		this.vacina = vacina;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefone = telefone;

	}

	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRaca() {
		return raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getVacina() {
		return vacina;
	}

	public void setVacina(String vacina) {
		this.vacina = vacina;
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void historico() {

		int op;
		Scanner read = new Scanner(System.in);

		System.out.println("\nOl�! Seja bem vinde! Temos estes lindos gatinhos para ado��o:");
		System.out.println("\n1 - Heitor\n"
							+ "2 - Sal�m\n"
							+ "3 - Pen�lope");
		op = read.nextInt();

		switch (op) {
		case 1:
			System.out.printf("\n Heitor \n Macho \n Preto \n 3 anos \n SRD \n Tomei todas as vacinas, estou vermifugado e "
								+ "castrado \n Infelizmente tenho FELV \n Adoro um cafun� na cabe�a \n Estou na rua das Andorinhas "
								+ "\n Telefone: 98477-0988");
			break;
		case 2:
			System.out.printf("\n Sal�m \n Macho \n Malhado \n 7 meses \n SRD \n Tomei todas as vacinas, estou vermifugado e "
								+ "castrado \n N�o tenho FELV \n Um amorzinho \n Voc� pode me encontrar na Rua Bartolomeu "
								+ "\n Telefone: 98477-0988");
			break;
		case 3:
			System.out.printf("\n Pen�lope \n F�mea \n Cinza \n 6 anos\n SRD \n Tomei todas as vacinas, estou vermifugada e "
								+ "castrada \n N�o tenho FELV \n Sou um pouco assustada, mas tenho muito amor para dar\n Estou "
								+ "em um lar tempor�rio na Rua Valetim Magalh�es \n Telefone: 98477-0988");
			break;
		default:
			System.out.println("Hmmm...Op��o invalida!");
		}

		System.out.println("\n\n Voc� quer adotar um de nossos gatinhos?");
		System.out.println(" 1 - Sim \n 2 - N�o");
		op = read.nextInt();
		switch (op) {
		case 1:
			System.out.println("Ficamos muito felizes com a sua escolha!!! \nGatos s�o �timas cia"
					+ "\nEntre em contato com a ong e conhe�a seu novo amigo (a), telefone: 11 98477-0766.");
			break;
		default:
			System.out.println("Poxa! Que pena...Mas voc� pode nos doar ra��o!");
		}

	}
}