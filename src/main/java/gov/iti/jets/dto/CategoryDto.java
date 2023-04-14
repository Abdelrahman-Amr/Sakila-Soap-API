package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link gov.iti.jets.entity.Category} entity
 */
@Data
@NoArgsConstructor
public class CategoryDto extends BaseDto {
    private  Short categoryId;
    private  String name;

}
