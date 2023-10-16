package com.ms.email.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{
    
}
