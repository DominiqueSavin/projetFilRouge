package com.formaclean.projetfilrouge.models.forms;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record SupplyCreateForm(
        @NotBlank
        String name,
        String description,
        String serialNumber,
        LocalDate purchaseDate
) {
}
