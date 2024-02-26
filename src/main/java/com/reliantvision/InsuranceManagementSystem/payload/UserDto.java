package com.reliantvision.InsuranceManagementSystem.payload;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDto {
    @NotEmpty(message = "Please Enter the FirstName: ")
    private String firstName;
    @NotEmpty(message = "Please Enter the LastName: ")
    private String lastName;
    @NotEmpty(message = "Please Enter the Gender: ")
    private String gender;
    @NotEmpty(message = "Please Enter the Age: ")
    private int age;
    @NotEmpty(message = "Please Enter the Email: ")
    private String email;

}
