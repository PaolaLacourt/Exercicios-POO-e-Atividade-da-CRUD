package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Livro;

public interface LivroService extends JpaRepository<Livro, Long>{

	List<Livro> getAllLivros();
	void saveLivro(Livro livro);
	Livro getLivroById(long id);
	void deleteLivroById(long id);
	Page<Livro> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
