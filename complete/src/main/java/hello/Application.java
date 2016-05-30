package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


@Entity
class UserData {

    @Id
    @GeneratedValue
    private  Long id;
    private String userName;
    private String userAddress;
    private String userBirthday;

    public UserData(String userName) {
        super();
        this.userName = userName;
        this.userAddress = userAddress;
        this.userBirthday = userBirthday;
    }

    public UserData(){
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserBirthday() {
        return userBirthday;
    }
}
