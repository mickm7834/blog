package com.doranco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.blog.entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {

}
