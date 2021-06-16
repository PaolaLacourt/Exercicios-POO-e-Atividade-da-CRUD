package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Livro;
import com.example.service.LivroService;

@Controller
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	
	@GetMapping("/")
	   public String viewHomePage(Model model) {
	       return findPaginated(1, "nomeLivro", "asc", model);
	    }
	
	 @GetMapping("/showNewLivroForm")
	 public String showNewLivroForm(Model model) {
	     Livro livro = new Livro();
	     model.addAttribute("livro", livro);
	     return "new_livro";
	 }
	 
	 @PostMapping("/saveLivro")
	    public String saveLivro(@ModelAttribute("livro") Livro livros) {
	        livroService.saveLivro(livros);
	        return "redirect:/";
	    }
	 
	 @GetMapping("/showFormForUpdate/{id}")
	 public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
	  
	  Livro livro = livroService.getLivroById(id);
	  
	  model.addAttribute("livro", livro);
	  return "update_livro";
	 }
	 
	 @GetMapping("/deleteLivro/{id}")
	 public String deleteLivro(@PathVariable (value = "id") long id) {
	  
	  this.livroService.deleteLivroById(id);
	  return "redirect:/";
	 }
	 
	 @GetMapping("/page/{pageNo}")
	 public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
	     @RequestParam("sortField") String sortField,
	     @RequestParam("sortDir") String sortDir,
	     Model model) {
	     int pageSize = 5;

	     Page < Livro > page = livroService.findPaginated(pageNo, pageSize, sortField, sortDir);
	     List < Livro > listLivros = page.getContent();

	     model.addAttribute("currentPage", pageNo);
	     model.addAttribute("totalPages", page.getTotalPages());
	     model.addAttribute("totalItems", page.getTotalElements());

	     model.addAttribute("sortField", sortField);
	     model.addAttribute("sortDir", sortDir);
	     model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

	     model.addAttribute("listLivros", listLivros);
	     return "index";
	 }
	 


	 @RequestMapping(value="/search/{searchNomeLivro}")
	 	public ModelAndView Search(@PathVariable("nomeLivro") String nomeLivro) {
		 	ModelAndView mav = new ModelAndView("search");

		 	mav.addObject("searchTerm", nomeLivro);
		 	mav.addObject("searchResult", Livro.findLivroByNomeLivro(nomeLivro));      

		 	return mav;
}
	 

}
