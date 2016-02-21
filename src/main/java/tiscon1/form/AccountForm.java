package tiscon1.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import tiscon1.model.Prefecture;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author kawasima
 */
@Data
public class AccountForm implements Serializable {
    @Size(min = 1, max = 100)
    @NotEmpty
    private String name;


    @NotEmpty
    private String email;

    @Size(min = 6,max = 20)
    @NotEmpty
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,20}$")
    private String password;

    @Size(min = 1, max = 100)
    private String firstName;

    @Size(min = 1, max = 100)
    private String lastName;

    @Size(min = 1, max = 100)
    private String company;

    @Size(min = 1, max = 100)
    private String telephoneNumber;

    private String prefectureCd;

    @Size(min = 1, max = 100)
    private String address;

}
