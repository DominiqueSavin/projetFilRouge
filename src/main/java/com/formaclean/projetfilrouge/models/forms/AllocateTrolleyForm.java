package com.formaclean.projetfilrouge.models.forms;

import jakarta.validation.constraints.NotBlank;

public record AllocateTrolleyForm(@NotBlank long jobId, @NotBlank int trolleyId) {
}
