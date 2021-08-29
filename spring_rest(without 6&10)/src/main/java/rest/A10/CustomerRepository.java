package rest.A9;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import capg.spring.rest.quest7.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
