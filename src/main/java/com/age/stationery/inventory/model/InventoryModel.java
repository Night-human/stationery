package com.age.stationery.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Entity
@Repository
@Getter
@Setter
@NoArgsConstructor
public class InventoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
