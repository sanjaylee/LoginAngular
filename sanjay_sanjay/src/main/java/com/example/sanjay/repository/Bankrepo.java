package com.example.sanjay.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sanjay.modal.Bank;

@Repository
public interface Bankrepo extends JpaRepository<Bank, Integer> {

	@Query(value="SELECT * FROM Bank sa where sa.account_name='sanjay'",nativeQuery=true)
   List<Bank>FindAllSortByName();
	@Query(value="SELECT * FROM Bank sa where sa.account_id='3'",nativeQuery=true)
	   List<Bank>findSortById();
	
}
