package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServerRoceNetworkRequest
 */
public class ServerRoceNetworkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_network")

    private String physicalNetwork;

    public ServerRoceNetworkRequest withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * **参数解释**：RoCE网络类型。 **约束限制**：不涉及。 **取值范围**：  - vxlan_roce  - roce_v2  **默认取值**：不涉及。
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public ServerRoceNetworkRequest withPhysicalNetwork(String physicalNetwork) {
        this.physicalNetwork = physicalNetwork;
        return this;
    }

    /**
     * **参数解释**：物理网络名称。 **约束限制**：^[-_.a-zA-Z0-9]{1,64}$。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return physicalNetwork
     */
    public String getPhysicalNetwork() {
        return physicalNetwork;
    }

    public void setPhysicalNetwork(String physicalNetwork) {
        this.physicalNetwork = physicalNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerRoceNetworkRequest that = (ServerRoceNetworkRequest) obj;
        return Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.physicalNetwork, that.physicalNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkType, physicalNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerRoceNetworkRequest {\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    physicalNetwork: ").append(toIndentedString(physicalNetwork)).append("\n");
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
