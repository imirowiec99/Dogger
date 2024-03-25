package com.dogger.Dogger.dto;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillDto {
    private int account;
    private String interest;
}
