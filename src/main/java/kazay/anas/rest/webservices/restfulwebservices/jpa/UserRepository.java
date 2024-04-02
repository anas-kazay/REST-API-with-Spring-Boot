package kazay.anas.rest.webservices.restfulwebservices.jpa;

import kazay.anas.rest.webservices.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
