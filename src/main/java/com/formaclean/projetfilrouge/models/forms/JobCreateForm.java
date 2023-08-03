package com.formaclean.projetfilrouge.models.forms;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record JobCreateForm() {

    @NotBlank
    LocalDate date;

}
