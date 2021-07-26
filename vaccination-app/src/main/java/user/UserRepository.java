package user;

import user.User;

public interface UserRepository {
    boolean exists(String nombre);
}
