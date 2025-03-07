package dev.xamacardoso.course_jpa_hibernate.repositories;

import dev.xamacardoso.course_jpa_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
