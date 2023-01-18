package com.ojas.ohams.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ojas.ohams.model.PMO;


@Repository
public interface OhamsRepository extends JpaRepository<PMO, Integer> {

	Optional<PMO> findByEmployeeId(String eMPLOYEE_ID);

}
