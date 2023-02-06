package com.example.uitest.repository;

import com.example.uitest.entity.board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<board,Integer> {
}
