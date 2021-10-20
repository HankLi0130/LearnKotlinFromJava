package app.hankdev.lkfj07.java;

import app.hankdev.lkfj07.Role;
import app.hankdev.lkfj07.SuperUser;
import app.hankdev.lkfj07.User;

public class JavaTest07 {
    public static void main(String[] args) {
//        Role role = new User();
        Role role = new SuperUser();
        cast(role);
    }

    static void cast(Role role) {
        if (role instanceof User) {
            User user = (User) role;
            user.doAction();
        } else if (role instanceof SuperUser) {
            SuperUser superUser = (SuperUser) role;
            superUser.doSuperAction();
        } else {
            System.out.println("No such role...");
        }
    }
}
