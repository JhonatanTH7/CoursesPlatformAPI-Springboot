package com.Platform.Courses.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MessageSenderBasicResponse extends MessageBasicResponse {

    private UserBasicResponse receiver;
    private Long courseId;

}
