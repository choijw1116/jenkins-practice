package com.example.k8spractice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @RequestMapping(method= RequestMethod.GET, value="/create")
    public ResponseEntity<String> test(){
        Test response = new Test("new",1);
        testRepository.save(response);
        return ResponseEntity.ok("okokok");
    }

}
