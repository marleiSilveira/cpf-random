package com.borchardt.cpfrandom;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@RequiredArgsConstructor
@Service
public class CpfRandomService {
    public String verifyCpf(Long cpf) {
        Random random = new Random();
        StatusCpfEnum status = StatusCpfEnum.values()[random.nextInt(2)];
        return status.name();
    }
}
