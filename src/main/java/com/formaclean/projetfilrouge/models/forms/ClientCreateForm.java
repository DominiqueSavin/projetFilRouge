package com.formaclean.projetfilrouge.models.forms;

import jakarta.validation.constraints.NotBlank;

public record ClientCreateForm(
        @NotBlank String name
) {
}
