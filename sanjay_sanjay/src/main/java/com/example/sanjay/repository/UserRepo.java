package com.example.sanjay.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sanjay.modal.UserModal;

public interface UserRepo extends JpaRepository< UserModal, Long> {
	UserModal findByEmail(String email);

}
