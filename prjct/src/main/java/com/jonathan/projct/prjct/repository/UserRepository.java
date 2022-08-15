package com.jonathan.projct.prjct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonathan.projct.prjct.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{
}
