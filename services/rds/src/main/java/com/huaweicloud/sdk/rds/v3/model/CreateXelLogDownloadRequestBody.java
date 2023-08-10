package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateXelLogDownloadRequestBody
 */
public class CreateXelLogDownloadRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    public CreateXelLogDownloadRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名。取值范围：不为null和空字符串，只为大小写字母，数字和下划线，以“.xel”结尾
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateXelLogDownloadRequestBody that = (CreateXelLogDownloadRequestBody) obj;
        return Objects.equals(this.fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateXelLogDownloadRequestBody {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
