package com.example.crud.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of = "id")

public class Product {
}
