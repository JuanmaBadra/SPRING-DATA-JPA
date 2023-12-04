package com.example.restfulApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data ///genera SETTERS Y GETTERS LOMBOOK
@AllArgsConstructor
@NoArgsConstructor
public class Gretting {

    private Long id;
    private String content;
}
