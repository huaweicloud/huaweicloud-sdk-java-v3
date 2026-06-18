package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNetworkAvailableIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkId")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetIpAvailability")

    private List<SubnetIpAvailability> subnetIpAvailability = null;

    public ShowNetworkAvailableIpResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：子网的名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNetworkAvailableIpResponse withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * **参数解释**：子网的ID。 **取值范围**：不涉及。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public ShowNetworkAvailableIpResponse withSubnetIpAvailability(List<SubnetIpAvailability> subnetIpAvailability) {
        this.subnetIpAvailability = subnetIpAvailability;
        return this;
    }

    public ShowNetworkAvailableIpResponse addSubnetIpAvailabilityItem(SubnetIpAvailability subnetIpAvailabilityItem) {
        if (this.subnetIpAvailability == null) {
            this.subnetIpAvailability = new ArrayList<>();
        }
        this.subnetIpAvailability.add(subnetIpAvailabilityItem);
        return this;
    }

    public ShowNetworkAvailableIpResponse withSubnetIpAvailability(
        Consumer<List<SubnetIpAvailability>> subnetIpAvailabilitySetter) {
        if (this.subnetIpAvailability == null) {
            this.subnetIpAvailability = new ArrayList<>();
        }
        subnetIpAvailabilitySetter.accept(this.subnetIpAvailability);
        return this;
    }

    /**
     * **参数解释**：子网可用的网络IP数量。
     * @return subnetIpAvailability
     */
    public List<SubnetIpAvailability> getSubnetIpAvailability() {
        return subnetIpAvailability;
    }

    public void setSubnetIpAvailability(List<SubnetIpAvailability> subnetIpAvailability) {
        this.subnetIpAvailability = subnetIpAvailability;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNetworkAvailableIpResponse that = (ShowNetworkAvailableIpResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.networkId, that.networkId)
            && Objects.equals(this.subnetIpAvailability, that.subnetIpAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, networkId, subnetIpAvailability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNetworkAvailableIpResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    subnetIpAvailability: ").append(toIndentedString(subnetIpAvailability)).append("\n");
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
