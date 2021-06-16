package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.model.Livro;
import com.example.repository.LivroRepository;

@Service
public class LivroServiceImpl implements LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Override
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}
	
	 @Override
	    public void saveLivro(Livro livro) {
	        this.livroRepository.save(livro);
	 }

	 @Override
	 public Livro getLivroById(long id) {
	     Optional < Livro > optional = livroRepository.findById(id);
	     Livro livro = null;
	     if (optional.isPresent()) {
	         livro = optional.get();
	     } else {
	         throw new RuntimeException(" Livro not found for id :: " + id);
	     }
	     return livro;
	 }
	 
	@Override
	 public void deleteLivroById(long id) {
	  this.livroRepository.deleteById(id);
	 }

	 @Override
	    public Page < Livro > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
	        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
	            Sort.by(sortField).descending();

	        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
	        return this.livroRepository.findAll(pageable);
	    }

	@Override
	public List<Livro> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livro> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livro> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Livro> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Livro> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Livro> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Livro getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Livro> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Livro> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Livro> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Livro> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Livro> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Livro entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Livro> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Livro> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Livro> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Livro> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Livro> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	 
	 
	
	 
}
