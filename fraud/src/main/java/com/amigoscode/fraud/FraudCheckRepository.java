package com.amigoscode.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory,Integer> {

}
