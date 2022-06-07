package Consumer;

import java.util.List;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@AllArgsConstructor
public class PoliticosController {
	

    private final PoliticosService politicosService;
    private final VereadoresService vereadoresService;
    private final GovernadoresService governadoresService;
    private final DepEstadualService depEstadualService;
    private final DepFederalService depFederalService;
    private final SenadoresService senadoresService ;
    private final MinistrosService ministrosService;
    private final PrefeitosService prefeitosService;
    private final PresidenteService presidenteService;
	

	@GetMapping()
	public List<Politicos> getPolitico(){
	return politicosService.buscaDepEst();
		
	}
	
	
	@GetMapping(value= "/vereadores", produces = MediaType.APPLICATION_JSON_VALUE)
	public Page <Politicos> getVereadores(@PageableDefault Pageable pageable) {
	 return  vereadoresService.getVereadores(pageable);
		
	}
	
	@GetMapping(value= "/governadores", produces = MediaType.APPLICATION_JSON_VALUE)
	public Page <Politicos> getGovernadores(@PageableDefault Pageable pageable) {
	 return  governadoresService.getGovernadores(pageable);
	}
	 
	 
	 
	 @GetMapping(value= "/deputadosestaduais", produces = MediaType.APPLICATION_JSON_VALUE)
		public Page <Politicos> getDepEstadual(@PageableDefault Pageable pageable) {
		 return depEstadualService.getDepEstadual(pageable);
	 }
	 
	 @GetMapping(value= "/deputadosfederais", produces = MediaType.APPLICATION_JSON_VALUE)
		public Page <Politicos> getDepFederais(@PageableDefault Pageable pageable) {
		 return depFederalService.getDepFederal(pageable);
	 }
	 
	 @GetMapping(value= "/senadores", produces = MediaType.APPLICATION_JSON_VALUE)
		public Page <Politicos> getSenadores(@PageableDefault Pageable pageable) {
		 return senadoresService.getSenadores(pageable);
	 }
	 
	 @GetMapping(value= "/ministros", produces = MediaType.APPLICATION_JSON_VALUE)
		public Page <Politicos> getministros(@PageableDefault Pageable pageable) {
		 return ministrosService.getMinistros(pageable);
	 }
	 
	 @GetMapping(value= "/prefeitos", produces = MediaType.APPLICATION_JSON_VALUE)
		public Page <Politicos> getPrefeitos(@PageableDefault Pageable pageable) {
		 return prefeitosService.getPrefeito(pageable);
	 }
	 
	 @GetMapping(value= "/presidente", produces = MediaType.APPLICATION_JSON_VALUE)
		public Page <Politicos> getPresidente(@PageableDefault Pageable pageable) {
		 return presidenteService.getPresidente(pageable);
	 }
	 
	 
	 
		
	}






