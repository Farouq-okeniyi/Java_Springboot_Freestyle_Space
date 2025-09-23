package com.eazybyte.faz_school.model;
import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Data
public class Contact {
    @NotBlank(message = "Name cannot be Blank")
    @Size(min=3, message = "Name but be less than 3 characters")
    private String name;

    @NotBlank(message = "Email can not be Blank")
    @Email(message = "Please provide a valid gmail")
    private String email;

    @NotBlank(message = "Mobile Number can not be Blank")
    @Pattern(regexp = "(^$|[0-9]{10}))")
    private String mobileNum;

    @NotBlank(message="Subject Field Cannot be Blank")
    @Size(min=5, message = "Subject should be less than 4 characters long")
    private String subject;

    @NotBlank(message ="Message field cannot be blank")
    @Size(min=8, message = "Subject should be less than 8 characters ")
    @Size(max=40, message = "Subject should be more than 40 characters ")
    private String message;

}
// 08160500846
