package uz.b.asaxiyuz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import uz.b.asaxiyuz.base.BaseEntityUUID;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")
public class Product extends BaseEntityUUID {

    private String productName;

    private Double price;
    private Long amount;

    private Boolean isDeleted = Boolean.FALSE;






    private String description;

//    private Category category;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
    @CreatedBy
    private UUID createdBy;

}
