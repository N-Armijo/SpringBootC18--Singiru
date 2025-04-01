package com.miprimerspring.syntaxpelis.repository;

import com.miprimerspring.syntaxpelis.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {

}
