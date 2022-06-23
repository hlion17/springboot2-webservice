package me.hlion.book.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // Given
        String name = "test";
        int amount = 1000;

        // When
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // Then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}