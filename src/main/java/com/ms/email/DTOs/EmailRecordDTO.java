package com.ms.email.DTOs;

import java.util.UUID;

public record EmailRecordDTO(UUID userId,
                             String emailTo,
                             String subject,
                             String text){

}
