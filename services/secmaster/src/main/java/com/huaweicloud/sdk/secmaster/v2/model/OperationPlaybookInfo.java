package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * operation of playbook
 */
public class OperationPlaybookInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    public OperationPlaybookInfo withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 重试： RETRY  终止： TERMINATE
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperationPlaybookInfo operationPlaybookInfo = (OperationPlaybookInfo) o;
        return Objects.equals(this.operation, operationPlaybookInfo.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationPlaybookInfo {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
