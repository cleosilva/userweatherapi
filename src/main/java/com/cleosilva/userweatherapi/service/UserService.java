package com.cleosilva.userweatherapi.service;

import com.cleosilva.userweatherapi.dto.ClimateDTO;
import com.cleosilva.userweatherapi.dto.UserWithClimateDTO;
import com.cleosilva.userweatherapi.model.UserModel;
import com.cleosilva.userweatherapi.repository.UserRepository;
import com.cleosilva.userweatherapi.service.facade.ClimateFacade;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ClimateFacade climateFacade;

    public UserService(UserRepository userRepository, ClimateFacade climateFacade) {
        this.userRepository = userRepository;
        this.climateFacade = climateFacade;
    }

    public UserWithClimateDTO findUserWithClimate(Long id){
        UserModel user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(("User not found!")));

        System.out.println("user City" + user.getCity());

        ClimateDTO climate = climateFacade.getClimate(user.getCity());

        System.out.println("climate " + climate.getDescription());

        UserWithClimateDTO dto = new UserWithClimateDTO();
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setCity(user.getCity());
        dto.setClimateDTO(climate);

        return dto;
    }

    public UserModel save(UserModel user){
        return userRepository.save(user);
    }
}
