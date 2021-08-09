package com.desiree.advance.dto;

import com.desiree.advance.enums.FileType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

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
