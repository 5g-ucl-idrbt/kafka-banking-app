package com.idrbt.repository;

import com.idrbt.entity.BankData;
import com.idrbt.payload.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingDataRepository extends JpaRepository<User, Integer> {

}
