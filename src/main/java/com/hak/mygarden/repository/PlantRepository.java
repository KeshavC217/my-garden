package com.hak.mygarden.repository;

import com.hak.mygarden.models.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {
    Optional<Plant> findDistinctByCommonNameContains(String frag);
}
