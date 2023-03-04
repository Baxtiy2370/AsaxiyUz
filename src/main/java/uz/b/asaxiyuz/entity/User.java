package uz.b.asaxiyuz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uz.b.asaxiyuz.base.BaseEntityUUID;
import uz.b.asaxiyuz.enums.UserRole;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User extends BaseEntityUUID {
    @Column(nullable = false)
    private String fullName;
    @Column(unique = true)
    private String phoneNumber;

    @Enumerated(value = EnumType.STRING)
    private UserRole role;
//    @OneToOne
//    private History history;

    @Column(nullable = false, unique = true)
    private Long card;
    @Column(nullable = false)
    private Integer date;
    @Column(nullable = false)
    private Integer month;
    @Column(nullable = false, unique = true)
    private UUID attachmentId;
}
