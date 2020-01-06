package com.example.springbootmultipledatasource.springbootmultipledatasource.repository.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootmultipledatasource.springbootmultipledatasource.entity.school.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {

}
