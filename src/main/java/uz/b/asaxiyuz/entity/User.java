package uz.b.asaxiyuz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uz.b.asaxiyuz.base.BaseEntityUUID;

import javax.persistence.Entity;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User extends BaseEntityUUID {

    private String fullName;

    private String phoneNumber;


}
