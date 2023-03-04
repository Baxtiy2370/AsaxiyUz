package uz.b.asaxiyuz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uz.b.asaxiyuz.base.BaseEntityUUID;
import uz.b.asaxiyuz.enums.UserRole;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User extends BaseEntityUUID {

    private String fullName;

    private String phoneNumber;

    @Enumerated(value = EnumType.STRING)
    private UserRole role;
    @OneToOne
    private History history;

}
