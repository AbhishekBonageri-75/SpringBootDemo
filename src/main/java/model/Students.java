package model;

import lombok.Data;

@Data
//@Entity
public class Students {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String country;
}
