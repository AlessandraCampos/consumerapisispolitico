package Consumer;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.PageJacksonModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8080/api/presidente/asc", name = "presidenteService")
public interface PresidenteService {

	@RequestMapping(value = "", method = RequestMethod.GET)
	Page<Politicos> getPresidente(@RequestParam(name = "pageable", required = false) Pageable pageable);

	@Configuration
	public class FeignDecodeConfiguration {

		@Bean
		public PageJacksonModule pagePresidentes() {
			return new PageJacksonModule();
		}
	}

}
