package io.rajshah;

import java.util.*;

public class MainPart3 {
    /*
    * Question 3:
    * This is question you will use test.users and test.otherUsers arrays that include a list of users.
    * The goal is to print out the users that are exist in both the test.users and test.otherUsers.
    *  Two users are equal if all their attributes are equal.
    */

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        List <User> commonUsersList = new ArrayList<>();
        for (String str : Data.users) {
            String test[] = str.split(",");
            User user = new User(test[0],test[1],Integer.parseInt(test[2]),test[3],test[4],test[5],test[6]);
            users.add(user);
        }
        for (String str : Data.otherUsers) {
            String test[] = str.split(",");
            User user = new User(test[0],test[1],Integer.parseInt(test[2]),test[3],test[4],test[5],test[6]);
            if(users.contains(user)) {
                commonUsersList.add(user);
            }
        }
        System.out.println(commonUsersList.size());
    }

}