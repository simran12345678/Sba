package com.admin.AdminMicroServices;

import java.util.List;
import java.util.Optional;





public interface AdminService {
	
	public List<Admin> getAdmin();
	
	public List<Company> getCompany();	
	public Company createCompany(Company company);
	public Company updateCompany(Company company);
	
	public IPO createIPO(IPO ipo);
	public IPO updateIPO(IPO ipo);
	
	public List<Stock> getStocks();	
	public Stock createStock(Stock stock);
	public Stock updateStock(Stock stock);

}
