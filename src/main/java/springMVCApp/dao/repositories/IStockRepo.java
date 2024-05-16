package springMVCApp.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springMVCApp.dao.entities.Stock;

public interface IStockRepo extends JpaRepository<Stock, Integer> {

}
