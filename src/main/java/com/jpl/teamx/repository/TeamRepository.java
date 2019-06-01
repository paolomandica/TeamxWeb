package com.jpl.teamx.repository;

import java.util.List;

import com.jpl.teamx.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    public Team findByName(String name);

    @Override
    public List<Team> findAll();

}