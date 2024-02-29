package com.example.EmployeeAPI.controller;

import com.example.EmployeeAPI.model.EmployeeDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeedetails")
public class employeeDetailsAPIService {
    EmployeeDetails employeeDetails;
    @GetMapping
    public EmployeeDetails getEmployeeDetails(){
        return employeeDetails;
        //new EmployeeDetails("A1","Hema","Bengaluru","6206431213");

    }
    @GetMapping("{employeeId}")
    public EmployeeDetails getEmployeeDetails(String employeeId){
        return employeeDetails;
                //new EmployeeDetails("A1","Hema","Bengaluru","6206431213");

    }

    @PostMapping
    public String createEmployeeDetails(@RequestBody EmployeeDetails employeeDetails ){
        this.employeeDetails = employeeDetails;
        return "Employee Details Created Successfully";
    }

    @PutMapping
    public String updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails ){
        this.employeeDetails = employeeDetails;
        return "Employee Details updated Successfully";
    }

    @DeleteMapping("{employeeId}")
    public String deleteEmployeeDetails(@RequestBody EmployeeDetails employeeDetails ){
        this.employeeDetails = null;
        return "Employee Details Deleted Successfully";
    }

}
