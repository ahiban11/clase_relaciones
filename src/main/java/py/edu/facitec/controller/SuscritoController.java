package py.edu.facitec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.model.Suscrito;
import py.edu.facitec.repository.SuscritoRepository;


//Aplicar la Arquitectura rest
//Representational State Transfer
//Solicitudes sin alm. de estado.
@RestController
@RequestMapping("/api")
//api afecta a todos los métodos de la clase.
public class SuscritoController {
	
	//Autowired de Suscrito Repository
	@Autowired
	private SuscritoRepository suscritoRepository;
	
	//api
	
	@GetMapping("/suscritos")
public ResponseEntity<List<Suscrito>> getSuscritos(){
		
	List<Suscrito> suscritos=new ArrayList<>();
								//buscar todos
	suscritos =suscritoRepository.findAll();
	
return new ResponseEntity<List<Suscrito>>(suscritos, HttpStatus.OK);
	
	
	}

}
