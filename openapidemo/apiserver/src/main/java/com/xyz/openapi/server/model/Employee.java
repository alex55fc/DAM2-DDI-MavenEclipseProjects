package com.xyz.openapi.server.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@class")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RegularEmployee.class, name = "RegularEmployee"),
        @JsonSubTypes.Type(value = ContractEmployee.class, name = "ContractEmployee")
})
public interface Employee {

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    Department getDepartment();

    void setDepartment(Department department);
}
