package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    public Employer(){

    }

    @OneToMany
    @JoinColumn
    List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Location is required")
    @Size(min=1, max = 500, message = "Location must be between 1 and 500 characters")
    private String location;
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
