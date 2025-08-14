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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_min_length")

    private Long compressMinLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_max_length")

    private Long compressMaxLength;

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
     * 智能压缩类型（gzip：gzip压缩，br：brotli压缩）。
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
     * 压缩格式，内容总长度不可超过200个字符，  多种格式用“,”分割，每组内容不可超过50个字符， 开启状态下，首次传空时默认值为.js,.html,.css,.xml,.json,.shtml,.htm，否则为上次设置的结果。
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Compress withCompressMinLength(Long compressMinLength) {
        this.compressMinLength = compressMinLength;
        return this;
    }

    /**
     * 压缩区间最小范围
     * minimum: 0
     * maximum: 31457280
     * @return compressMinLength
     */
    public Long getCompressMinLength() {
        return compressMinLength;
    }

    public void setCompressMinLength(Long compressMinLength) {
        this.compressMinLength = compressMinLength;
    }

    public Compress withCompressMaxLength(Long compressMaxLength) {
        this.compressMaxLength = compressMaxLength;
        return this;
    }

    /**
     * 压缩区间最大范围
     * minimum: 0
     * maximum: 31457280
     * @return compressMaxLength
     */
    public Long getCompressMaxLength() {
        return compressMaxLength;
    }

    public void setCompressMaxLength(Long compressMaxLength) {
        this.compressMaxLength = compressMaxLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Compress that = (Compress) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.compressMinLength, that.compressMinLength)
            && Objects.equals(this.compressMaxLength, that.compressMaxLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, fileType, compressMinLength, compressMaxLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Compress {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    compressMinLength: ").append(toIndentedString(compressMinLength)).append("\n");
        sb.append("    compressMaxLength: ").append(toIndentedString(compressMaxLength)).append("\n");
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
