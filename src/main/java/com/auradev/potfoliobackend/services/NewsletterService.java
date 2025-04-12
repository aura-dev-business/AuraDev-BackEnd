package com.auradev.potfoliobackend.services;

import com.auradev.potfoliobackend.models.Newsletter;
import com.auradev.potfoliobackend.repositories.NewsletterRepository;
import org.springframework.stereotype.Service;

@Service
public class NewsletterService {
    private final NewsletterRepository newsletterRepository;

    public NewsletterService(NewsletterRepository newsletterRepository) {
        this.newsletterRepository = newsletterRepository;
    }

    public Newsletter saveSubscription(Newsletter newsletter) {
        return newsletterRepository.save(newsletter);
    }
}