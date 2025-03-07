package dev.xamacardoso.course_jpa_hibernate.repositories;

import dev.xamacardoso.course_jpa_hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
