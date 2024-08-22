package com.filterSearch.SearchBar.Repository;

import com.filterSearch.SearchBar.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface LocationRepository extends JpaRepository<Location, UUID> {
    public Optional<Location> findByCountry(String country);
}
