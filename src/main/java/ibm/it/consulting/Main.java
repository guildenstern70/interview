package ibm.it.consulting;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println();
        print("Hello, World!");
        System.out.println(Colors.ANSI_WHITE);

        // Get users
        var users = UsersService.getUsers();

        // *******************************************
        // Print users with password field hidden
        // *******************************************

    }

    public static void print(String message)
    {
        System.out.println(Colors.ANSI_YELLOW + message);
    }
}