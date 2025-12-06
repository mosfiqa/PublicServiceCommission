package mosfiqa;

import java.io.Serializable;
import java.time.LocalDate;

public class AccountCreation implements Serializable {
    private String name,email,nid,password;
    private LocalDate dob;

    public AccountCreation(String name, String email, String nid, String password, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.nid = nid;
        this.password = password;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "goal9{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", nid='" + nid + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                '}';
    }
}
