package Consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient(url="http://localhost:8080/api/politicos" , name = "politicosService")
public interface PoliticosService {
	
	   @RequestMapping(value = "/", method = RequestMethod.GET)
	   List<Politicos> buscaDepEst();
	   
	 

}


