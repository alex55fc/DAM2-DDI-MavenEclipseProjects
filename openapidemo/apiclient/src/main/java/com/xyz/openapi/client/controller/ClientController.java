package com.xyz.openapi.client.controller;

import com.xyz.openapi.thinclient.api.OrganizationControlsApi;
import com.xyz.openapi.thinclient.model.EmployeeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired private OrganizationControlsApi organizationControlsApi;

    @GetMapping(value = "/employees")
    public EmployeeList getEmployees(@RequestParam(required = false) String deptId) {
        EmployeeList employees = organizationControlsApi.getAllEmployees(deptId);
        return employees;
    }
}
