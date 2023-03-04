package uz.b.asaxiyuz.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import uz.b.asaxiyuz.enums.Category;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
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
    @NotNull
    private Timestamp createdAt;
    @NotNull
    private Timestamp updatedAt;
    @NotNull
    private UUID createdBy;
}
