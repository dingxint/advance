package com.desiree.advance.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookDto {

    private String name;

    private BigDecimal value;

    private String description;
}
