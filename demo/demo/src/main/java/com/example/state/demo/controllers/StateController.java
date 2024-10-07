package com.example.state.demo.controllers;


import com.example.state.demo.mapper.StateMapper;
import com.example.state.demo.request_response.StateResponse;
import com.example.state.demo.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.state.demo.entities.State;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PutMapping("/{id}")
    public ResponseEntity<StateResponse> updateOrCreateState(@PathVariable String id, @RequestBody State state) {
        State updatedState = stateService.updateOrCreateState(id, state);
        StateResponse stateResponse = StateMapper.mapStateToStateResponse(updatedState);
        return ResponseEntity.ok(stateResponse);
    }
    @PostMapping
    public ResponseEntity<StateResponse> createState(@RequestBody State state) {
        State newState = stateService.createState(state);
        StateResponse stateResponse = StateMapper.mapStateToStateResponse(newState);
        return ResponseEntity.ok(stateResponse);
    }

}