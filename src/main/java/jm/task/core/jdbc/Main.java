package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;



public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Олег", "Комолов", (byte) 27);
        userService.saveUser("Gordon", "Freeman", (byte) 34);
        userService.saveUser("Name3", "LastName3", (byte) 31);
        userService.saveUser("Name4", "LastName4", (byte) 35);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
