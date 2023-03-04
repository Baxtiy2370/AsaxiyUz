package uz.b.asaxiyuz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.b.asaxiyuz.entity.Product;
import uz.b.asaxiyuz.entity.User;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
