package com.waheedtechblog.lombok.model;

import lombok.*;

import java.io.Serializable;


/**
 * POJO class having Lombok Annotation
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserPrincipalWithLombok implements Serializable {

    private String username;
    private String password;
    private String roles;

}
