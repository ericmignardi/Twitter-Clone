package org.ac.cst8277.mignardi.eric.messageservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserHasRole {
    private int users_id;
    private int roles_id;
}