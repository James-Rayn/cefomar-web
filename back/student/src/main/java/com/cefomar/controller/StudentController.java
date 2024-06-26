package com.cefomar.controller;

import com.cefomar.dto.StudentRequest;
import com.cefomar.utils.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface StudentController {
    @PostMapping("add")
    ResponseEntity<Response> add(@RequestBody StudentRequest request);
    @PutMapping("update")
    ResponseEntity<Response> update(@RequestBody StudentRequest request);
    @GetMapping("get/{id}")
    ResponseEntity<Response> get(@PathVariable String id);
    @GetMapping("all")
    ResponseEntity<Response> all();
    @DeleteMapping("delete/{id}")
    ResponseEntity<Response> delete(@PathVariable String id);
}
