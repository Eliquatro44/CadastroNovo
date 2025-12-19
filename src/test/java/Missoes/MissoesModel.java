package Missoes;

import java.util.List;

import Novo.NovoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Missoes;
	private String dificuldade;
	
	//OneToMany Uma missão pode ter muitos ninjas
	@OneToMany(mappedBy = "missoes")
	private List<NovoModel> ninjas;

}
