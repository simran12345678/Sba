package com.admin.AdminMicroServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	IPORepository ipoRepository;
	@Autowired
	StockRepository stockRepository;
	
	@Override
	public List<Admin> getAdmin() {
		return (List<Admin>) adminRepository.findAll();
	}

	@Override
	public List<Company> getCompany() {
		return (List<Company>) companyRepository.findAll();
	}

	@Override
	public Company createCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public Company updateCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public IPO createIPO(IPO ipo) {
		return ipoRepository.save(ipo);
	}

	@Override
	public IPO updateIPO(IPO ipo) {
		return ipoRepository.save(ipo);
	}
	
	@Override
	public List<Stock> getStocks() {
		return (List<Stock>) stockRepository.findAll();
	}

	@Override
	public Stock createStock(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock updateStock(Stock stock) {
		return stockRepository.save(stock);
	}



}
