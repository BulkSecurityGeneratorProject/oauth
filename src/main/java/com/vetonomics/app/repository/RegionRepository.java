package com.vetonomics.app.repository;

import com.vetonomics.app.domain.Region;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Region entity.
 */
@SuppressWarnings("unused")
public interface RegionRepository extends JpaRepository<Region,Long> {

}
