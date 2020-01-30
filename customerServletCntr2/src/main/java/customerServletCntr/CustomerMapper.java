package customerServletCntr;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class CustomerMapper implements CustomerDTOImpl {

	public Customer customerDtoToCustomer(CustomerDto dto) {
		
		if(dto==null)
		{
			return null;
		}
		else
		{
			Customer customer=new Customer();
			customer.setFirstName(dto.getFirstName());
			customer.setLastName(dto.getLastName());
			customer.setEmail(dto.getEmail());
			return customer;
		}
		
	}

	@Override
	public CustomerDto customerToCustomerDto(Customer customer) {
		if(customer==null)
		{
			return null;
		}
		else {
			CustomerDto cDto=new CustomerDto(); 
			cDto.setFirstName(customer.getFirstName());
			cDto.setLastName(customer.getLastName());
			cDto.setEmail(customer.getEmail());
			return cDto;
		}
		
		
}
	
}
