package com.auradev.potfoliobackend.controllers;

import com.auradev.potfoliobackend.models.Newsletter;
import com.auradev.potfoliobackend.services.NewsletterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/newsletter")
@CrossOrigin(origins = "http://localhost:5173") // Adjust the origin as per your frontend URL
public class NewsletterController {
    private final NewsletterService newsletterService;

    public NewsletterController(NewsletterService newsletterService) {
        this.newsletterService = newsletterService;
    }

    @PostMapping
    public ResponseEntity<Newsletter> subscribe(@RequestBody Newsletter newsletter) {
        Newsletter savedSubscription = newsletterService.saveSubscription(newsletter);
        return ResponseEntity.ok(savedSubscription);
    }
}