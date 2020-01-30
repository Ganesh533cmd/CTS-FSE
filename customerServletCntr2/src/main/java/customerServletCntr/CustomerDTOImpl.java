package customerServletCntr;
import org.mapstruct.Mapper;

import customerServletCntr.Customer;
import customerServletCntr.CustomerDto;
@Mapper
public interface CustomerDTOImpl {
	public Customer customerDtoToCustomer(CustomerDto cDto);
	public CustomerDto customerToCustomerDto(Customer customer);
	
}
