package com.tahauddin.syed.repo;

import com.tahauddin.syed.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {
}
