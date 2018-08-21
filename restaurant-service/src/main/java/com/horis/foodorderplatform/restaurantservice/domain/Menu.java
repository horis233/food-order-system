package com.horis.foodorderplatform.restaurantservice.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Document
public class Menu {
    @Id
    String id;

    private String restaurantId;
    private String name;
    private String description;
    private int price;
}
