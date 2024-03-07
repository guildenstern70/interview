package ibm.it.consulting;

public class User
{

    public String name;

    public String surname;

    public String username;

    public String password;

    public User(String name, String surname, String username, String password)
    {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public UserDto toDto()
    {
        return new UserDto(this.name, this.surname, this.username, this.password);
    }
}

