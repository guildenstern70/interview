package ibm.it.consulting;

public class Entity
{

    public String name;

    public String surname;

    public String username;

    public String password;

    public Entity(String name, String surname, String username, String password)
    {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public EntityDto toDto()
    {
        return new EntityDto(this.name, this.surname, this.username, this.password);
    }
}

