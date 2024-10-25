package com.scorpion.sa.repository;

import com.scorpion.sa.entites.Sentiment;
import com.scorpion.sa.enums.TypeSentiment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SentimentRepository extends JpaRepository<Sentiment, Integer> {
    List<Sentiment> findByType(TypeSentiment type);
}
