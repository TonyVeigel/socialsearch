package com.socialsearch.commands;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by veigelto on 7/7/16.
 */
public class PersonCommand {

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
