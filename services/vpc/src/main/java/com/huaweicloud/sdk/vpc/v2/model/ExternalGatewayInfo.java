package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ExternalGatewayInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_snat")

    private Boolean enableSnat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    public ExternalGatewayInfo withEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
        return this;
    }

    /**
     * 功能说明：是否启用SNAT 取值范围：true、false；默认为false。
     * @return enableSnat
     */
    public Boolean getEnableSnat() {
        return enableSnat;
    }

    public void setEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
    }

    public ExternalGatewayInfo withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 外部网络的ID。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalGatewayInfo that = (ExternalGatewayInfo) obj;
        return Objects.equals(this.enableSnat, that.enableSnat) && Objects.equals(this.networkId, that.networkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableSnat, networkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalGatewayInfo {\n");
        sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
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
