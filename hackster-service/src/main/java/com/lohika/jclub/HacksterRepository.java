package com.lohika.jclub;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HacksterRepository extends JpaRepository<Hackster, Long> {
  Optional<Hackster> findByPhone(String phone);
}
