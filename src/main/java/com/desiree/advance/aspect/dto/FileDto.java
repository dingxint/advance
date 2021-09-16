package com.desiree.advance.aspect.dto;

import com.desiree.advance.aspect.enums.FileType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class FileDto {

    private String id;

    private String filePath;

    @ApiModelProperty
    private FileType type;

    public String getFilePath() {
        return filePath;
    }
}
