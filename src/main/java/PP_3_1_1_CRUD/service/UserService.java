package PP_3_1_1_CRUD.service;

import PP_3_1_1_CRUD.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
}
