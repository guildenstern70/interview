package ibm.it.consulting;

import java.util.List;

public class UsersService
{
    public static List<Entity> getUsers() {
        return List.of(
                new Entity("John", "Doe", "john.doe", "password"),
                new Entity("Jane", "Doe", "jane.doe", "password"),
                new Entity("Alice", "Smith", "alice.smith", "password"),
                new Entity("Bob", "Smith", "bob.smith", "password"),
                new Entity("Charlie", "Brown", "charlie.brown", "password")
        );
    }

    public static void printUser(EntityDto user)
    {
        Main.print(user.toString());
    }
}
