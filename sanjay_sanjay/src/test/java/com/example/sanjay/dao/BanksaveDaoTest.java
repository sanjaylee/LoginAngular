package com.example.sanjay.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.sanjay.modal.Bank;
import com.example.sanjay.repository.Bankrepo;
import com.example.sanjay.service.Bankservice;

@ExtendWith(SpringExtension.class)
public class BanksaveDaoTest {
	
	@Mock
	private Bankrepo Barepo;
	
	@InjectMocks
	private Bankservice Baser;
	
	
	@Test
	public void SaveBankTest() {
		Bank newBan= new Bank( 2,"sanjay","2345654","chennai");
		
		doReturn(newBan).when(Barepo).save(newBan);
		
		Bank getservi=Baser.saveBa(newBan);
		
		assertEquals(2,getservi.getId());
	}
     
}
