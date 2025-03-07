package dev.xamacardoso.course_jpa_hibernate.services;

import dev.xamacardoso.course_jpa_hibernate.entities.User;
import dev.xamacardoso.course_jpa_hibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);

        return user.get();
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id, User user) {
        // Picks only the reference of a user in database, to allow changes in this object.
        User entity = userRepository.getOne(id);
        updateData(entity, user);
        return userRepository.save(entity);
    }

    // Updating just some fields
    private void updateData(User savedEntity, User updatedEntity) {
        savedEntity.setName(updatedEntity.getName());
        savedEntity.setEmail(updatedEntity.getEmail());
        savedEntity.setPhone(updatedEntity.getPhone());
    }
}
