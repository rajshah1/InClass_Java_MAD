package io.rajshah;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainPart2 {
    /*
    * Question 2:
    * - In this question you will use the Data.users array that includes
    * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
    * - Create a User class that should parse all the parameters for each user.
    * - The goal is to count the number of users living each state.
    * - Print out the list of State, Count order in ascending order by count.
    * */

    public static void main(String[] args) {
        String[] test = new String[6];
        List<User> listOfUsers = new ArrayList<User>();
        for (String str : Data.users) {
            test = str.split(",");
            User userTest = new User(test[0], test[1], Integer.parseInt(test[2]), test[3], test[4], test[5], test[6]);
            listOfUsers.add(userTest);
        }
        Map<String, List<User>> personByCity = listOfUsers.stream().collect(Collectors.groupingBy(User::getState));

        for(Map.Entry<String,List<User>> entry:personByCity.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue().size());
        }
    }
}