package com.zhang.springboot2.repository;

import com.zhang.springboot2.entity.CaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseItemRepository extends JpaRepository<CaseItem,Integer> {
}
