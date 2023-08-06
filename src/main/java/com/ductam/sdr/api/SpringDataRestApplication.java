package com.ductam.sdr.api;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {

  @Autowired
  private AppUserRepository userRepository;

  @PostConstruct
  public void init() {
    userRepository.saveAll(Stream.of(
        new AppUser("64cf50ce97ed745134659d07",
            "Mandy Scott",
            "carter_logan@gmail.edu",
            53,
            "79 Flatbush Avenue, Coalmont, Arizona"),
        new AppUser("64cf545f926f69fa1e285529",
            "Moreno Gaines",
            "moreno_gaines@gmail.edu",
            49,
            "3 Clinton Street, Trinway, Iowa"),
        new AppUser("64cf545f84e97cd861651c57",
            "Fischer Price",
            "fischer_price@gmail.edu",
            78,
            "13 Reeve Place, Juntura, Tennessee")
    ).collect(Collectors.toList()));
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDataRestApplication.class, args);
  }

}
