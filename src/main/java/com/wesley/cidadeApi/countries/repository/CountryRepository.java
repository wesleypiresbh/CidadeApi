package com.wesley.cidadeApi.countries.repository;

import com.wesley.cidadeApi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CountryRepository extends JpaRepository <Country,Long> {
}
