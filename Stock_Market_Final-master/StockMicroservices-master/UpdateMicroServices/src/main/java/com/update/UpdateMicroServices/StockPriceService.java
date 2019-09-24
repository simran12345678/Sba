package com.update.UpdateMicroServices;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;





public interface StockPriceService {

	public List<StockPrice> getStockPrices();

	public StockPrice createStockPrice(StockPrice stockPrice);

	public Optional<StockPrice> getStockPriceById(Long id);

	public List<StockPrice> getStockPricesbyCompanyId(long id);

	public void exportExcel(MultipartFile file);

	public List<StockPrice> getStockPricesCompare1(long companyId, long stockExchangeId, String periodicity);
}
