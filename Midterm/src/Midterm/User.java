package Midterm;

import java.util.List;

public class User {
    private String userneme;
    private UserStatus status;

    public User(String userneme, UserStatus status) {
        this.userneme = userneme;
        this.status = status;
    }

    public String getUserneme() {
        return userneme;
    }

    public UserStatus getStatus() {
        return status;
    }
}

class Test {
    public static void main(String[] args) {
        User u1 = new User("Username 1" , UserStatus.ACTIVE);
        User u2 = new User("Username 2" , UserStatus.INACTIVE);
        User u3 = new User("Username 3" , UserStatus.valueOf("BLOCKED"));

        System.out.println(u1.getStatus() == UserStatus.valueOf("ACTIVE") ? u1.getUserneme() : "");
        System.out.println(u2.getStatus() == UserStatus.valueOf("ACTIVE") ? u2.getUserneme() : "");
        System.out.println(u3.getStatus() == UserStatus.valueOf("ACTIVE") ? u3.getUserneme() : "");
    }
}
