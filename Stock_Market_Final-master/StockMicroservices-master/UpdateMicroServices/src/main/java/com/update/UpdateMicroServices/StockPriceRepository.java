package com.update.UpdateMicroServices;

import java.util.List;

import org.springframework.data.repository.CrudRepository;





public interface StockPriceRepository extends CrudRepository<StockPrice, Long>{

	public List<StockPrice> getByCompanyId(long companyId);
}
