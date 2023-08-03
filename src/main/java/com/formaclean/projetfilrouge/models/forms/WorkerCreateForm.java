package com.formaclean.projetfilrouge.models.forms;

import jakarta.validation.constraints.NotBlank;

public record WorkerCreateForm(
        String firstName,
        @NotBlank
        String lastName
) {
}
