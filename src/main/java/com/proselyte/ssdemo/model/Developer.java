package com.proselyte.ssdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {

    private Long id;

    private String firstName;

    private String lastName;
}
