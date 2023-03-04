package uz.b.asaxiyuz.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.b.asaxiyuz.enums.UserRole;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDTO {
    @NotNull
    private String fullName;
    @NotNull
    private String phoneNumber;
    @NotNull
    private UserRole role;
    @NotNull
    private Long card;
    @NotNull
    private Integer cardDate;
    @NotNull
    private Integer cardMonth;
    @NotNull
    private UUID attachmentId;
}
