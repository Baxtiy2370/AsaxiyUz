package uz.b.asaxiyuz.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.b.asaxiyuz.enums.UserRole;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotNull
    private String fullName;
    @NotNull
    private String phoneNumber;
    @NotNull
    private UserRole role;
    @NotNull
    private Long card;
    @NotNull
    private Integer date;
    @NotNull
    private Integer month;
    @NotNull
    private UUID attachmentId;
}
