package com.example.Responseentityexception;


	import org.springframework.data.jpa.repository.JpaRepository;
	import com.org.RestfulusingResponseEntity.Entity.Customer;

	public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	}


