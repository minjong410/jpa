package com.ebs.jpa.dto;

import com.ebs.jpa.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void test2() {
        String name = "test";
        int amount = 1000;
        
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // 검증 메서드
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}
