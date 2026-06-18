package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowNetworkAvailableIpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_name")

    private String networkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    public ShowNetworkAvailableIpRequest withNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * **参数解释**：网络ID。取值自网络详情的metadata.name字段。 **约束限制**：1 - 64字符，字母、数字和中划线。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return networkName
     */
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public ShowNetworkAvailableIpRequest withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * **参数解释**：子网ID。取值自网络详情status.subnets字段中的networkId字段。 **约束限制**：1 - 64字符，字母、数字和中划线。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
        ShowNetworkAvailableIpRequest that = (ShowNetworkAvailableIpRequest) obj;
        return Objects.equals(this.networkName, that.networkName) && Objects.equals(this.networkId, that.networkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkName, networkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNetworkAvailableIpRequest {\n");
        sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
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
