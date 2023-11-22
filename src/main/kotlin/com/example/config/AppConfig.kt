package com.example.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.modelmapper.ModelMapper

/*
* https://velog.io/@hyunsdb/KotlinSpring%EC%9C%BC%EB%A1%9C-%EA%B0%84%EB%8B%A8%ED%95%9C-CRUD-%ED%95%B4%EB%B3%B4%EA%B8%B0-2
* */
@Configuration
class AppConfig{

    @Bean
    fun modelMapper(): ModelMapper {
        val modelMapper = ModelMapper()
        modelMapper.configuration.isFieldMatchingEnabled = true
        return modelMapper
    }
}