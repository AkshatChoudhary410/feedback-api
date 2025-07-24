package com.example.feedback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 10)
    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();

    public String getName() {
        return name;  // <-- this line was missing
    }

    public String getEmail() {
        return email;  // <-- this line was missing
    }

    public String getMessage() {
        return message;
    }

    // ✅ Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    // Getters and setters (use Lombok if preferred)
}

