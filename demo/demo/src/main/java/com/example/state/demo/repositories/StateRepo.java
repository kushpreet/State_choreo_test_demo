package com.example.state.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.state.demo.entities.State;


public interface StateRepo extends JpaRepository<State,String> {
}
