package dkg.metric.demo.DTOs;

import dkg.metric.demo.Entities.Users;

public record SearchContentDTO(String content, String totalResults, Double SearchTime, Long user_id) {
}
