package com.reliantvision.InsuranceManagementSystem.repository;

import com.reliantvision.InsuranceManagementSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
