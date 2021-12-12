package com.doranco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.blog.entity.Adherer;

public interface AdhererRepository extends JpaRepository<Adherer, Long> {

}
