package org.example.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto extends RepresentationModel<UserDto> {

    @Schema(description = "Уникальный код пользователя(Создаётся автоматически)", example = "1")
    private Integer id;
    @Schema(description = "Имя пользователя", example = "Алексей")
    private String name;
    @Schema(description = "Email пользователя", example = "leshkaa.kovalev.02@gmail.com")
    private String email;
    @Schema(description = "Возраст пользователя", example = "23")
    private Integer age;
    @Schema(description = "Дата создания пользователя в БД(Создаётся автоматически)", example = "2025-08-31")
    private LocalDate createdAt;
}
