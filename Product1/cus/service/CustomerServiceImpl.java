package cus.service;

public class CustomerServiceImpl {

	implements CustomerService {
		private CustomerDAO dao;
		{
			dao=new CustomerDAOImpl();
		}

		@Override
		public Customer createCustomer(Customer customer) {
			
			return dao.createCustomer(customer);
		}

	}
}
