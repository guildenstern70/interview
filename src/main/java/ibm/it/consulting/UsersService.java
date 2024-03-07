package ibm.it.consulting;

import java.util.List;

public class UsersService
{
    public static List<User> getUsers() {
        return List.of(
                new User("John", "Doe", "john.doe", "password"),
                new User("Jane", "Doe", "jane.doe", "password"),
                new User("Alice", "Smith", "alice.smith", "password"),
                new User("Bob", "Smith", "bob.smith", "password"),
                new User("Charlie", "Brown", "charlie.brown", "password")
        );
    }

    public static void printUser(UserDto user)
    {
        Main.print(user.toString());
    }
}
