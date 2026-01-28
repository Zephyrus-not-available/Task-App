package com.kyaw.task.domain;

import com.kyaw.task.domain.entity.TaskPriority;
import java.time.LocalDate;

public record CreateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority
) {
}
