package com.library.managment_system.repository;

import com.library.managment_system.entity.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BorrowingRepository extends JpaRepository<Borrowing, UUID> {
}
