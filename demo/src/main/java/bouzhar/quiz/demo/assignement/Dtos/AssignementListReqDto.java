package bouzhar.quiz.demo.assignement.Dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AssignementListReqDto {
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Integer chance;

    private boolean result;

    private Float obtainedScore;

    @NotNull
    private Long test_id;

    @NotNull
    private List<Long> student_ids;
}
