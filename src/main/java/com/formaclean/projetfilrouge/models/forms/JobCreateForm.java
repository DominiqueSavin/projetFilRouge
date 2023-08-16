package com.formaclean.projetfilrouge.models.forms;

import jakarta.validation.constraints.NotBlank;

public record JobCreateForm(
        @NotBlank
        String date,
        String comment,
        @NotBlank
        String clientName
) {


}
