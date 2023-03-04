package uz.b.asaxiyuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.b.asaxiyuz.entity.Attachment;
import uz.b.asaxiyuz.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
