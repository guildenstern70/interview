package ibm.it.consulting;

/**
 * EntityDto "hides" the password field of Entity.
 *
 * @param name
 * @param surname
 * @param username
 * @param password
 */
public record EntityDto(String name, String surname, String username, String password)
{
    public EntityDto
    {
        password = "***************";
    }

    @Override
    public String toString()
    {
        return "EntityDto {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
