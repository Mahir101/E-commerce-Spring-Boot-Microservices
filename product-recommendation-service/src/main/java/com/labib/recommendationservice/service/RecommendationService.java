package com.labib.recommendationservice.service;

import com.labib.recommendationservice.model.Recommendation;
import java.util.List;

public interface RecommendationService {
	Recommendation getRecommendationById(Long recommendationId);
    Recommendation saveRecommendation(Recommendation recommendation);
    List<Recommendation> getAllRecommendationByProductName(String productName);
    void deleteRecommendation(Long id);
}
