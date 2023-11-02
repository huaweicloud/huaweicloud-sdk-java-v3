package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作详情
 */
public class Operations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support")

    private Boolean isSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cause_id")

    private String causeId;

    public Operations withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作信息
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Operations withIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
        return this;
    }

    /**
     * 是否支持该操作
     * @return isSupport
     */
    public Boolean getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
    }

    public Operations withCauseId(String causeId) {
        this.causeId = causeId;
        return this;
    }

    /**
     * 不支持该操作的原因ID，仅在is_support为false时返回
     * @return causeId
     */
    public String getCauseId() {
        return causeId;
    }

    public void setCauseId(String causeId) {
        this.causeId = causeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operations that = (Operations) obj;
        return Objects.equals(this.operation, that.operation) && Objects.equals(this.isSupport, that.isSupport)
            && Objects.equals(this.causeId, that.causeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, isSupport, causeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Operations {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    isSupport: ").append(toIndentedString(isSupport)).append("\n");
        sb.append("    causeId: ").append(toIndentedString(causeId)).append("\n");
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
