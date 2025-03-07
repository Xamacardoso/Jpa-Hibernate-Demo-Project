package dev.xamacardoso.course_jpa_hibernate.repositories;

import dev.xamacardoso.course_jpa_hibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
