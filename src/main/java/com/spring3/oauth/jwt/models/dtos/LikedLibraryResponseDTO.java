package com.spring3.oauth.jwt.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LikedLibraryResponseDTO {
    private Integer id;
    private Integer userId;
    private List<NovelResponseDTO> content;
}
