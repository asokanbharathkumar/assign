package rest.A3;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	List<Address> list= Arrays.asList(
			new Address("Hyderabad", "Telangana", "India", 500055),
			new Address("Chennai", "Tamil Nadu", "India", 606301),
			new Address("Benguluru", "Karnataka", "India", 404819)
			);
	
	@RequestMapping("/rest/address/{zip}")
	public Address dsiplayAddress(@PathVariable("zip") int zip) {
		for(Address add: list) {
			if(add.getZipcode()==zip) {
				return add;
			}
		}
		return null;
	}
}
