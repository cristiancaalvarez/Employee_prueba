package com.employees.employees.repository;

import com.employees.employees.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGeneralRepository<T extends Base,ID> extends JpaRepository<T, ID> {

}