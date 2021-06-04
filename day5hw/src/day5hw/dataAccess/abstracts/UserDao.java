package day5hw.dataAccess.abstracts;

import java.util.List;

import day5hw.entities.User;

public interface UserDao {
	void register(User user);
    void login(User user);
    void update(User user);
    void deleted(User user);
    User getUser(String _eMail);
    boolean existUser(User user);
    List<User> getAll();
}


