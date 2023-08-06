package com.ductam.sdr.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
  @Id
  private String id;
  private String fullName;
  private String email;
  private int age;
  private String address;
}
