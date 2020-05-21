package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor

public class Film {
    private int id;
    private int productId;
    private String productName;

    public int getId() {
        return id;
    }

}
