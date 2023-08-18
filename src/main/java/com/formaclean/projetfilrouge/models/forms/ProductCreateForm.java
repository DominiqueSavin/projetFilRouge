package com.formaclean.projetfilrouge.models.forms;

import com.formaclean.projetfilrouge.dal.entities.Trolley;

import java.time.LocalDate;

public record ProductCreateForm(
        String name,
        String description,
        String serialNumber,
        Trolley trolley,
        LocalDate purchaseDate) {
}
