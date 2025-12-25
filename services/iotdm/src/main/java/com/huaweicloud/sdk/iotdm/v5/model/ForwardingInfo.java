package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业版实例的SNAT配置信息。 
 */
public class ForwardingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private String eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_snat")

    private Boolean enableSnat;

    public ForwardingInfo withEip(String eip) {
        this.eip = eip;
        return this;
    }

    /**
     * **参数说明**：NAT网关绑定的EIP。 
     * @return eip
     */
    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public ForwardingInfo withEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
        return this;
    }

    /**
     * **参数说明**：是否启用SNAT配置。 **取值范围**： - true: SNAT配置已启用 - false: SNAT配置未启用 
     * @return enableSnat
     */
    public Boolean getEnableSnat() {
        return enableSnat;
    }

    public void setEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ForwardingInfo that = (ForwardingInfo) obj;
        return Objects.equals(this.eip, that.eip) && Objects.equals(this.enableSnat, that.enableSnat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip, enableSnat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForwardingInfo {\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
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
