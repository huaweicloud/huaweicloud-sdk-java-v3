package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ExportCertificateRequestBody */
public class ExportCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_compressed")

    private String isCompressed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ExportCertificateRequestBody withIsCompressed(String isCompressed) {
        this.isCompressed = isCompressed;
        return this;
    }

    /** 是否压缩
     * 
     * @return isCompressed */
    public String getIsCompressed() {
        return isCompressed;
    }

    public void setIsCompressed(String isCompressed) {
        this.isCompressed = isCompressed;
    }

    public ExportCertificateRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /** 导出类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportCertificateRequestBody exportCertificateRequestBody = (ExportCertificateRequestBody) o;
        return Objects.equals(this.isCompressed, exportCertificateRequestBody.isCompressed)
            && Objects.equals(this.type, exportCertificateRequestBody.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCompressed, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCertificateRequestBody {\n");
        sb.append("    isCompressed: ").append(toIndentedString(isCompressed)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
