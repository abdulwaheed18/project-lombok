package com.waheedtechblog.lombok.model;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * Simple POJO class but with some expception with Lombok like what if we have to remove some entry from ToString or don't want to create setter for specific function.`
 */

//“getters” would have the same method name as the properties: getUsername() simply becomes username().
@Accessors(fluent = true) @Getter
@ToString
@EqualsAndHashCode
public class UserPrincipalWithCustomLombok {

    //fine grained @Setter
    private @Setter(AccessLevel.PROTECTED)String username;

    //password cannot be null here
    // password will be excluded from toString method.
    // password will be excluded from Equal and hashcode method
    @EqualsAndHashCode.Exclude  @ToString.Exclude private @NonNull String password;
    private String roles;
}
