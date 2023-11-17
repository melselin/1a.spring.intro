package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;


// ORM => Object Relation Mapping
@Table(name = "cars")
@Entity
public class Car {
    @Id
    @Column(name="id") // name = kolon adı
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // class'ın içindeki alanın adı

    @Column(name="model_year")
    private int modelYear;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "color")
    private String color;

    @Column(name = "status")
    private String status;

    //TODO: İlişkisen Brand tablosunun alanlarını eklemek.

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
