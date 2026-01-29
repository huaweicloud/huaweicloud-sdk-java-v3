package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentInfoOperationHistory
 */
public class ComponentInfoOperationHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_name")

    private String operationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time")

    private String operationTime;

    public ComponentInfoOperationHistory withOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * 操作
     * @return operationName
     */
    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public ComponentInfoOperationHistory withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    /**
     * 时间点
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentInfoOperationHistory that = (ComponentInfoOperationHistory) obj;
        return Objects.equals(this.operationName, that.operationName)
            && Objects.equals(this.operationTime, that.operationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationName, operationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentInfoOperationHistory {\n");
        sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
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
