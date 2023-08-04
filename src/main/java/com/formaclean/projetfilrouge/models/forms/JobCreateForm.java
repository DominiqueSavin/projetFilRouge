package com.formaclean.projetfilrouge.models.forms;

import com.formaclean.projetfilrouge.entities.Client;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record JobCreateForm(
        @NotBlank
        String date,
        String comment,
        @NotBlank
        String client
) {


}
