package com.formaclean.projetfilrouge.models.forms;

import com.formaclean.projetfilrouge.entities.Client;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record JobCreateForm(
        @NotBlank
        LocalDate date,

        String comment,
        Client client
) {


}
