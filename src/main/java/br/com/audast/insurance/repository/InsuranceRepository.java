package br.com.audast.insurance.repository;

import br.com.audast.insurance.domain.InsuranceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InsuranceRepository extends JpaRepository<InsuranceModel, Long> {
}