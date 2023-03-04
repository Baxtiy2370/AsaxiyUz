package uz.b.asaxiyuz.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.b.asaxiyuz.enums.Category;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDTO {
    @NotNull
    private String productName;
    @NotNull
    private Double price;
    @NotNull
    private String description;
    @NotNull
    private Long amount;
    @NotNull
    private UUID attachmentId;
    @NotNull
    private Category category;

}
