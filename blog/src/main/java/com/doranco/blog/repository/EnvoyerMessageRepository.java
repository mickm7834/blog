package com.doranco.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.blog.entity.EnvoyerMessage;

public interface EnvoyerMessageRepository extends JpaRepository<EnvoyerMessage, Long> {

}
