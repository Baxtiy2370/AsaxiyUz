package uz.b.asaxiyuz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import uz.b.asaxiyuz.base.BaseEntityUUID;
import uz.b.asaxiyuz.enums.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")
public class Product extends BaseEntityUUID {
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private Double price;

    private String description;
    @Column(nullable = false)
    private Long amount;
    @Column(nullable = false)
    private UUID attachmentId;

    private Boolean isDeleted = Boolean.FALSE;
    @Enumerated(value = EnumType.STRING)
    private Category category;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
    @CreatedBy
    private UUID createdBy;

}
