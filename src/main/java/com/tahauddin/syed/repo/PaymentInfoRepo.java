package com.tahauddin.syed.repo;

import com.tahauddin.syed.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, String> {
}
