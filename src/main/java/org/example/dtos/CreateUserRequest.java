package org.example.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreateUserRequest {

    @Schema(description = "Имя пользователя", example = "Алексей")
    private String name;
    @Schema(description = "Email пользователя", example = "leshka.kovalev.02@gmail.com")
    private String email;
    @Schema(description = "Возраст пользователя", example = "23")
    private Integer age;
}
