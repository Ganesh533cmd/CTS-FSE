package customerServletCntr;

import java.util.List;
import customerServletCntr.CustomerDAO;
import customerServletCntr.CustomerDAOImpl;
import customerServletCntr.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		return dao.createCustomer(customer);
	}
	@Override
	public List<Customer> getAllCustomer() {
		return dao.getAllCustomer();
	}
	
	@Override
	public void update(Customer customer) {
		 dao.update(customer);
		
	}
	@Override
	public Customer findBuyId(int id) {
		 return dao.findBuyId(id);
	}
	@Override
	public void delete(Customer customer) {
		dao.delete(customer);
	}
}




	


