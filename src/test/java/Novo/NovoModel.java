package Novo;


import Missoes.MissoesModel;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Ele transforma uma classe comum em uma entidade no BD
@Entity
@Table(name = "tb_cadastro")	
@NoArgsConstructor // automaticamente o lombok ele gera construtores controtor vazio
@AllArgsConstructor // Ele gera automaticamento os construtores com parâmetros
@Data //Ele vai criar automaticamente os getters e setters
public class NovoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Vai ser gerado automaticamente números sequenciais
	private Long id;
	
	private String nome;
	
	private String email;
	
	private int idade;
	
	
	//@ManyToOne um ninja ter uma unica missao
	@ManyToOne
	@JoinColumn(name = "missoes_id") // Foreing Key ou cahve estrangeira
	private MissoesModel missoes;
	
	
	
	}
