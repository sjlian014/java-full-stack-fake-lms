package com.github.sjlian014.jlms.dao;

import com.github.sjlian014.jlms.model.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends JpaRepository<Major, Long> {

}
