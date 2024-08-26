package jv.tirersistemas.exercicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jv.tirersistemas.primeiro.projeto.controller.Produto;

@RestController
@RequestMapping("/tarefa-controller")
public class TarefaController {

	private static List<Tarefa> tarefas = new ArrayList<Tarefa>();
	@GetMapping
	public Tarefa getListadeTraefas() {
		return new Tarefa(1, "Primeira Tarefa", "primeira tarefa feita", true );
		
		
		
	}

@GetMapping
public Tarefa getListaDeTarefas() 



@PostMapping
public void cadastraTarefa (@RequestBody Tarefa tarefa) {
}
	class Tarefa {
		private long id;
		private String titulo;
		private String descricao;
		private boolean completa;
	
	}
	
}
