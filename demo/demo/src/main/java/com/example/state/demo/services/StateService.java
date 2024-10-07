package com.example.state.demo.services;
import com.example.state.demo.repositories.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.state.demo.entities.State;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class StateService {

    @Autowired
    private StateRepo stateRepo;

    public State updateOrCreateState(String id, State newState) {
        Optional<State> existingState = stateRepo.findById(id);

        if (existingState.isPresent()) {
            State state = existingState.get();
            state.setName(newState.getName());
            state.setCode(newState.getCode());
            return stateRepo.save(state);
        } else {
            return stateRepo.save(newState);
        }
    }
    public State createState(State newState) {
        return stateRepo.save(newState);
    }

}