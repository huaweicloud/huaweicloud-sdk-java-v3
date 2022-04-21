package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompressRules
 */
public class CompressRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_type")

    private String compressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_file_type")

    private String compressFileType;

    public CompressRules withCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }

    /**
     * GZIP压缩类型（目前只支持 gzip）
     * @return compressType
     */
    public String getCompressType() {
        return compressType;
    }

    public void setCompressType(String compressType) {
        this.compressType = compressType;
    }

    public CompressRules withCompressFileType(String compressFileType) {
        this.compressFileType = compressFileType;
        return this;
    }

    /**
     * GZIP压缩文件类型（文件后缀竖线分割，如：.js|.html|.css|.xml）
     * @return compressFileType
     */
    public String getCompressFileType() {
        return compressFileType;
    }

    public void setCompressFileType(String compressFileType) {
        this.compressFileType = compressFileType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompressRules compressRules = (CompressRules) o;
        return Objects.equals(this.compressType, compressRules.compressType)
            && Objects.equals(this.compressFileType, compressRules.compressFileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compressType, compressFileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompressRules {\n");
        sb.append("    compressType: ").append(toIndentedString(compressType)).append("\n");
        sb.append("    compressFileType: ").append(toIndentedString(compressFileType)).append("\n");
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
