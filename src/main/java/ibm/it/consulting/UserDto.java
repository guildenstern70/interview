package ibm.it.consulting;

/**
 * EntityDto "hides" the password field of Entity.
 *
 * @param name
 * @param surname
 * @param username
 * @param password
 */
public record UserDto(String name, String surname, String username, String password)
{
    public UserDto
    {
        password = "***************";
    }

    @Override
    public String toString()
    {
        return "USER {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
