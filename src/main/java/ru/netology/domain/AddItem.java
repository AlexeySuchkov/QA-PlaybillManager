package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor

public class AddItem {
    private int id;
    private int productId;
    private String productName;
}
