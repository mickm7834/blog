package com.doranco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.blog.entity.PublicationMedia;

public interface PublicationMediaRepository extends JpaRepository<PublicationMedia, Long> {

}
