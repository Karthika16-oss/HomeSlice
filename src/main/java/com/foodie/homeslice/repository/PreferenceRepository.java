package com.foodie.homeslice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodie.homeslice.entity.Preference;

public interface PreferenceRepository extends JpaRepository<Preference, Long> {

}
