package com.borchardt.cpfrandom;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class CpfRandomController {

    private final CpfRandomService service;

    @GetMapping("/{cpf}")
    public ResponseEntity<String> getAssembly(@PathVariable("cpf") Long cpf) {
        System.out.println("cpf " + cpf);
        return ResponseEntity.ok(service.verifyCpf(cpf));
    }
}
