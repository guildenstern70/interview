package ibm.it.consulting;

public class Solution
{
    public static void solution() {
        // Get users
        var users = UsersService.getUsers();

        // Print users with password field hidden
        users.stream()
                .map(User::toDto)
                .forEach(UsersService::printUser);
    }
}
