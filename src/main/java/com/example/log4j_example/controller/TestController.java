package com.example.log4j_example.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class TestController {

    //private static final Logger LOGGER = LogManager.getLogger(TestController.class);

    private static final Logger logger = Logger.getLogger(TestController.class.getName());


    @GetMapping("/")
    public String testLogger() {
        logger.info("Проверяем работу логгера ");
        return "Ok";
    }
}
