package me.hlion.book.dto;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // Given
        String name = "test";
        int amount = 1000;

        // When
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // Then
        assertEquals(name, dto.getName());
        assertEquals(amount, dto.getAmount());
        org.assertj.core.api.Assertions.assertThat(dto.getName()).isEqualTo(name);
        org.assertj.core.api.Assertions.assertThat(dto.getAmount()).isEqualTo(amount);

    }
}