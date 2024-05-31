package com.Platform.Courses.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentInCourseResponse {

    private Long idEnrollment;
    private LocalDate enrollmentDate;
    private UserBasicResponse student;

}
