package bouzhar.quiz.demo.question.dto;

import bouzhar.quiz.demo.level.dtos.LevelSimpleDto;
import bouzhar.quiz.demo.media.MediaDto;
import bouzhar.quiz.demo.question.enums.QuestionType;
import bouzhar.quiz.demo.subject.dto.SubjectDto;
import bouzhar.quiz.demo.validation.Dto.ValidationResQuestionDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestionResDto {

    private long id;
    private Integer answersCount;
    private Integer correctAnswersCount;
    private String text;
    private Float scorePoints;
    @Enumerated(EnumType.STRING)
    private QuestionType type;
    private List<ValidationResQuestionDto> validations;
    private List<MediaDto> medias;
    private LevelSimpleDto level;
    private SubjectDto subject;

}
