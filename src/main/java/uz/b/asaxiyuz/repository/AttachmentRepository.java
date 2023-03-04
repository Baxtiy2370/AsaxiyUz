package uz.b.asaxiyuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.b.asaxiyuz.entity.Attachment;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
