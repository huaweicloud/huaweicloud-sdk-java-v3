package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeRunInfoInnerError
 */
public class NodeRunInfoInnerError {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_body")

    private NodeRunInfoInnerErrorErrorBody errorBody;

    public NodeRunInfoInnerError withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public NodeRunInfoInnerError withErrorBody(NodeRunInfoInnerErrorErrorBody errorBody) {
        this.errorBody = errorBody;
        return this;
    }

    public NodeRunInfoInnerError withErrorBody(Consumer<NodeRunInfoInnerErrorErrorBody> errorBodySetter) {
        if (this.errorBody == null) {
            this.errorBody = new NodeRunInfoInnerErrorErrorBody();
            errorBodySetter.accept(this.errorBody);
        }

        return this;
    }

    /**
     * Get errorBody
     * @return errorBody
     */
    public NodeRunInfoInnerErrorErrorBody getErrorBody() {
        return errorBody;
    }

    public void setErrorBody(NodeRunInfoInnerErrorErrorBody errorBody) {
        this.errorBody = errorBody;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeRunInfoInnerError that = (NodeRunInfoInnerError) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.errorBody, that.errorBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, errorBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeRunInfoInnerError {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    errorBody: ").append(toIndentedString(errorBody)).append("\n");
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
