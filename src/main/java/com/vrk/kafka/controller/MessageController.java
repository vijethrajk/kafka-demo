package com.vrk.kafka.controller;

import com.vrk.kafka.service.SimpleProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final SimpleProducer simpleProducer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("msg") String message){
        try{
            simpleProducer.sendMessage(message);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return  "failed to send";
        }

    }
}
