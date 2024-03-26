package com.dogger.Dogger.dto;


import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {
    private DogDto dogDto;
    private List<InterestDto> interestDto;

}
