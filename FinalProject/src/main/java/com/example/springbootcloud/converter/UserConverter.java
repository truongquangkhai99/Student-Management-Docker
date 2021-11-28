package com.example.springbootcloud.converter;

import com.example.springbootcloud.entity.UserEntity;
import com.example.springbootcloud.model.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity toEntity(UserDTO dto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFullname(dto.getFullname());
        userEntity.setGender(dto.getGender());
        userEntity.setAge(dto.getAge());
        userEntity.setEmail(dto.getEmail());
        userEntity.setPhone(dto.getPhone());
        return userEntity;
    }
    public UserDTO toDTO(UserEntity entity) {
        UserDTO dto = new UserDTO();
        dto.setFullname(entity.getFullname());
        dto.setGender(entity.getGender());
        dto.setAge(entity.getAge());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        return dto;
    }

    public UserEntity toExistingEntity(UserEntity entity, UserDTO dto) {
        entity.setFullname(dto.getFullname());
        entity.setGender(dto.getGender());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        return entity;
    }
}
