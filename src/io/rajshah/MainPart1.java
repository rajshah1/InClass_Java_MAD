package io.rajshah;

import java.util.*;

public class MainPart1 {
    /*
    * Question 1:
    * - In this question you will use the Data.users array that includes
    * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
    * - Create a User class that should parse all the parameters for each user.
    * - Insert each of the users in a list.
    * - Print out the TOP 10 oldest users.
    * */

    public static void main(String[] args) {
        String[] test=new String[6];
        List<User> listOfUsers = new ArrayList<User>();
        for (String str : Data.users) {
            test = str.split(",");
            User userTest = new User(test[0], test[1], Integer.parseInt(test[2]), test[3], test[4], test[5], test[6]);
            listOfUsers.add(userTest);
        }
        Arrays.stream(test).forEach(System.out::println);
        Collections.sort(listOfUsers, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(listOfUsers.get(i).toString());
        }
    }

}