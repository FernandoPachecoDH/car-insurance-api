package br.com.audast.insurance.repository;

import br.com.audast.insurance.domain.DriverModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<DriverModel, Long> {
}
