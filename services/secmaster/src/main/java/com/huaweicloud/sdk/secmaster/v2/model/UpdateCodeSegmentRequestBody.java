package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateCodeSegmentRequestBody
 */
public class UpdateCodeSegmentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_segment_name")

    private String codeSegmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public UpdateCodeSegmentRequestBody withCodeSegmentName(String codeSegmentName) {
        this.codeSegmentName = codeSegmentName;
        return this;
    }

    /**
     * 代码段名称
     * @return codeSegmentName
     */
    public String getCodeSegmentName() {
        return codeSegmentName;
    }

    public void setCodeSegmentName(String codeSegmentName) {
        this.codeSegmentName = codeSegmentName;
    }

    public UpdateCodeSegmentRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 代码段描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCodeSegmentRequestBody withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 代码片段
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCodeSegmentRequestBody that = (UpdateCodeSegmentRequestBody) obj;
        return Objects.equals(this.codeSegmentName, that.codeSegmentName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeSegmentName, description, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCodeSegmentRequestBody {\n");
        sb.append("    codeSegmentName: ").append(toIndentedString(codeSegmentName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
