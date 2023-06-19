package com.cafein.backend.domain.viewedcafe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cafein.backend.domain.viewedcafe.entity.ViewedCafe;

public interface ViewedCafeRepository extends JpaRepository<ViewedCafe, Long> {

	@Query("SELECT v FROM ViewedCafe v WHERE v.member.memberId = :memberId")
	List<ViewedCafe> findAllByMemberId(Long memberId);
}
