package org.ac.cst8277.mignardi.eric.usermanagementservice.model;

import lombok.*;

@NoArgsConstructor
@Data
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
}