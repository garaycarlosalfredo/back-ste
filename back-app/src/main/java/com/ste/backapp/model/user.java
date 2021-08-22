package com.ste.backapp.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class user {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@NonNull
@Email
private String email;

private String name;
private String lastName;

@NotNull
private int dni;
}
