package com.alustad.alustad.Controller;

import com.alustad.alustad.Model.EmailModel;
import com.alustad.alustad.Services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sendEmail")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping()
    public String sendEmail(@RequestBody EmailModel emailRequest) {
        emailService.sendSimpleMessage(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
        return "Email sent successfully";
    }
}

