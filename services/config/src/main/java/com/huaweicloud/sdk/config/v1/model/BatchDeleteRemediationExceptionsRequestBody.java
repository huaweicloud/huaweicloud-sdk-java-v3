package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除合规规则修正例外的详情。
 */
public class BatchDeleteRemediationExceptionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exceptions")

    private List<RemediationExceptionRequest> exceptions = null;

    public BatchDeleteRemediationExceptionsRequestBody withExceptions(List<RemediationExceptionRequest> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

    public BatchDeleteRemediationExceptionsRequestBody addExceptionsItem(RemediationExceptionRequest exceptionsItem) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<>();
        }
        this.exceptions.add(exceptionsItem);
        return this;
    }

    public BatchDeleteRemediationExceptionsRequestBody withExceptions(
        Consumer<List<RemediationExceptionRequest>> exceptionsSetter) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<>();
        }
        exceptionsSetter.accept(this.exceptions);
        return this;
    }

    /**
     * 批量删除合规规则修正例外的详情。
     * @return exceptions
     */
    public List<RemediationExceptionRequest> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<RemediationExceptionRequest> exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteRemediationExceptionsRequestBody that = (BatchDeleteRemediationExceptionsRequestBody) obj;
        return Objects.equals(this.exceptions, that.exceptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exceptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteRemediationExceptionsRequestBody {\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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
