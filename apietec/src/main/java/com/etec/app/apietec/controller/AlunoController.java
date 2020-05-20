package com.etec.app.apietec.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;



import com.etec.app.apietec.repository.AlunoRepository;
import com.etec.app.apietec.dto.AlunoDto;
import com.etec.app.apietec.entity.Aluno;


@RestController
public class AlunoController {
	@Autowired
	private AlunoRepository repository;
	private static final Logger log = LoggerFactory.getLogger(AlunoController.class);
	
	@RequestMapping("/listaralunos")
	public List<Aluno> listarAlunos(){		
		log.info("listando todos alunos do curos");
		List<Aluno> alunos = repository.findAll();		
		for (Aluno aluno : alunos) {
			log.debug("Aluno: " ,aluno.toString());
		}		
		return alunos;		
	}
	
	@PostMapping
	@RequestMapping("/cadastrar")
	public void cadastrarAluno(@RequestBody AlunoDto dto) {		
		Aluno aluno = this.toDtoEntity(dto);		
		repository.save(aluno);
	}
	
	//Mapping
	private Aluno toDtoEntity(AlunoDto dto) {
		log.info("Log.info ", dto.toString());
		log.debug("Log.debug ", dto.toString());
		Aluno aluno = new Aluno();
		aluno.setNome(dto.getNome());
			aluno.setRg(dto.getRg());
			aluno.setCpf(dto.getCpf());
			aluno.setEmail(dto.getEmail());
			aluno.setId_curso(dto.getId_curso());
			aluno.setData_nasc(dto.getData_nasc());
			return aluno;
		}

}
