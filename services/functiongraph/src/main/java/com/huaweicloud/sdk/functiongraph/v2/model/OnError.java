package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 错误处理策略详情
 */
public class OnError {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transition")

    private String transition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_ref")

    private String retryRef;

    public OnError withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * 错误匹配表达式，用来过滤需要处理的异常
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public OnError withTransition(String transition) {
        this.transition = transition;
        return this;
    }

    /**
     * 下一步骤节点ID
     * @return transition
     */
    public String getTransition() {
        return transition;
    }

    public void setTransition(String transition) {
        this.transition = transition;
    }

    public OnError withRetryRef(String retryRef) {
        this.retryRef = retryRef;
        return this;
    }

    /**
     * 重试策略名称
     * @return retryRef
     */
    public String getRetryRef() {
        return retryRef;
    }

    public void setRetryRef(String retryRef) {
        this.retryRef = retryRef;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OnError that = (OnError) obj;
        return Objects.equals(this.error, that.error) && Objects.equals(this.transition, that.transition)
            && Objects.equals(this.retryRef, that.retryRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, transition, retryRef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnError {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
        sb.append("    retryRef: ").append(toIndentedString(retryRef)).append("\n");
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
