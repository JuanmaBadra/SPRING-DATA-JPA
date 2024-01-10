package com.FanaQuimica.BackendAPI.repository;

import com.FanaQuimica.BackendAPI.model.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRubroRepository extends JpaRepository<Rubro,Long> {
}

