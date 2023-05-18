package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 智能压缩。
 */
public class Compress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    public Compress withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 智能压缩开关（on：开启，off：关闭）。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Compress withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 智能压缩类型（gzip：gzip压缩，br：br压缩）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Compress withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 压缩格式，内容总长度不可超过200个字符， 使用\",\"分隔，每组内容不可超过50个字符， 开启状态下，首次传空时默认值为.js,.html,.css,.xml,.json,.shtml,.htm，否则为上次设置的结果。
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Compress compress = (Compress) o;
        return Objects.equals(this.status, compress.status) && Objects.equals(this.type, compress.type)
            && Objects.equals(this.fileType, compress.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, fileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Compress {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
