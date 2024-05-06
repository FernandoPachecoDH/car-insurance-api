package br.com.audast.insurance.repository;

import br.com.audast.insurance.domain.ClaimModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<ClaimModel, Long> {
}
