package kazay.anas.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static{
        users.add(new User(1,"Anas", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Sami", LocalDate.now().minusYears(24)));
        users.add(new User(3,"Walid", LocalDate.now().minusYears(19)));
    }

    public List<User> findAll(){
        return users;
    }
    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id){
        return users.stream().filter(user -> user.getId()==id).findFirst().orElse(null);
    }

    public void deleteById(int id){
        users.removeIf(user -> user.getId()==id);
    }
}
