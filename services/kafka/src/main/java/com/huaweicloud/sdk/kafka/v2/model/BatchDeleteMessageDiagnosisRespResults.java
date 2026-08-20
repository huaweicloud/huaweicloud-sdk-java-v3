package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchDeleteMessageDiagnosisRespResults
 */
public class BatchDeleteMessageDiagnosisRespResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public BatchDeleteMessageDiagnosisRespResults withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 报告删除结果
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public BatchDeleteMessageDiagnosisRespResults withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 报告ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteMessageDiagnosisRespResults that = (BatchDeleteMessageDiagnosisRespResults) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMessageDiagnosisRespResults {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
