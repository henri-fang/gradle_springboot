package com.tw.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DiagnosisController {

    @GetMapping("/diagnosis")
    public ResponseEntity diagnosis() {
        final String result = "";
        return ResponseEntity.ok(result);
    }
}
