package com.andrade.passin.dto.attendee;

public record AttendeeBadgeDTO(
        String id,
        String name,
        String email,
        String checkInUrl,
        String eventTitle
) {
}
