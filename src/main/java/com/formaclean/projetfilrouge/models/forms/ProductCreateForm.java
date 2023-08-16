package com.formaclean.projetfilrouge.models.forms;

import com.formaclean.projetfilrouge.entity.Trolley;

import java.time.LocalDate;

public record ProductCreateForm(
        String name,
        String description,
        String serialNumber,
        Trolley trolley,
        LocalDate purchaseDate) {
}
