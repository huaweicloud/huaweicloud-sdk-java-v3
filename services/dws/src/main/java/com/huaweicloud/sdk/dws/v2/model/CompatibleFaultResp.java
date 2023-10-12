package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompatibleFaultResp
 */
public class CompatibleFaultResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private String details;

    public CompatibleFaultResp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CompatibleFaultResp withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建者
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CompatibleFaultResp withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * 详细
     * @return details
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompatibleFaultResp that = (CompatibleFaultResp) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.created, that.created)
            && Objects.equals(this.details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, created, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompatibleFaultResp {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
