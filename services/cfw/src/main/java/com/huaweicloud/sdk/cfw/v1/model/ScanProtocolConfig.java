package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScanProtocolConfig
 */
public class ScanProtocolConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private Integer action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private Integer protocolType;

    public ScanProtocolConfig withAction(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * 反病毒动作，0：观察 1：拦截 2：禁用
     * minimum: 0
     * maximum: 2
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public ScanProtocolConfig withProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * 协议类型
     * minimum: 0
     * maximum: 7
     * @return protocolType
     */
    public Integer getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanProtocolConfig that = (ScanProtocolConfig) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.protocolType, that.protocolType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, protocolType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanProtocolConfig {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
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
