package com.demo.docker;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo")
public class DemoController {

    private final DemoRepository demoRepository;

    @GetMapping
    public List<DemoEntity> findAll() {
        return demoRepository.findAll();
    }

    @PostMapping
    public DemoEntity save(@RequestBody DemoEntity demoEntity) {
        return demoRepository.save(demoEntity);
    }

    @GetMapping("/{id}")
    public DemoEntity findById(@PathVariable Integer id) {
        return demoRepository.findById(id).orElse(null);
    }
}
