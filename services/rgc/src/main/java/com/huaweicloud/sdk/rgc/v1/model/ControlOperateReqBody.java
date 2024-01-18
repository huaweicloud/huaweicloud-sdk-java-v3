package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作控制策略的请求体。
 */
public class ControlOperateReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_identifier")

    private String targetIdentifier;

    public ControlOperateReqBody withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 控制策略ID。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ControlOperateReqBody withTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
        return this;
    }

    /**
     * 组织单元的ID信息。
     * @return targetIdentifier
     */
    public String getTargetIdentifier() {
        return targetIdentifier;
    }

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ControlOperateReqBody that = (ControlOperateReqBody) obj;
        return Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.targetIdentifier, that.targetIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, targetIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ControlOperateReqBody {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    targetIdentifier: ").append(toIndentedString(targetIdentifier)).append("\n");
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
