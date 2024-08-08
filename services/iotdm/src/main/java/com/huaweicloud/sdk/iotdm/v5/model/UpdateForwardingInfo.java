package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业版实例的SNAT配置，配置开启后，企业版实例可以在公共网络中进行外部通信。 约束：只有企业版实例支持修改流转配置。 
 */
public class UpdateForwardingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_snat")

    private Boolean enableSnat;

    public UpdateForwardingInfo withEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
        return this;
    }

    /**
     * **参数说明**：是否启用SNAT配置。企业版实例开启SNAT配置后，可以在公共网络中进行外部通信。 约束：只有企业版实例支持配置SNAT配置，SNAT配置开启后将不支持关闭 **取值范围**： - true: 启用SNAT配置 
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
        UpdateForwardingInfo that = (UpdateForwardingInfo) obj;
        return Objects.equals(this.enableSnat, that.enableSnat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableSnat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateForwardingInfo {\n");
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
