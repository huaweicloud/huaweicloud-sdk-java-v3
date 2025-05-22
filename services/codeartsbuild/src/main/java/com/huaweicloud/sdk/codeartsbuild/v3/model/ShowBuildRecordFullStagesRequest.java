package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBuildRecordFullStagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade")

    private Boolean cascade;

    public ShowBuildRecordFullStagesRequest withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 记录ID,36位数字、小写字母、'-'组组合。
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public ShowBuildRecordFullStagesRequest withCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    /**
     * 是否联级获取steps
     * @return cascade
     */
    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBuildRecordFullStagesRequest that = (ShowBuildRecordFullStagesRequest) obj;
        return Objects.equals(this.recordId, that.recordId) && Objects.equals(this.cascade, that.cascade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, cascade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBuildRecordFullStagesRequest {\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
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
