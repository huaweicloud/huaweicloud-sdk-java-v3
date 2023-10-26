package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListCentralNetworkCapabilitiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capability")

    private List<CentralNetworkCapabilityEnum> capability = null;

    public ListCentralNetworkCapabilitiesRequest withCapability(List<CentralNetworkCapabilityEnum> capability) {
        this.capability = capability;
        return this;
    }

    public ListCentralNetworkCapabilitiesRequest addCapabilityItem(CentralNetworkCapabilityEnum capabilityItem) {
        if (this.capability == null) {
            this.capability = new ArrayList<>();
        }
        this.capability.add(capabilityItem);
        return this;
    }

    public ListCentralNetworkCapabilitiesRequest withCapability(
        Consumer<List<CentralNetworkCapabilityEnum>> capabilitySetter) {
        if (this.capability == null) {
            this.capability = new ArrayList<>();
        }
        capabilitySetter.accept(this.capability);
        return this;
    }

    /**
     * 根据租户能力名查询，可查询多个类型。
     * @return capability
     */
    public List<CentralNetworkCapabilityEnum> getCapability() {
        return capability;
    }

    public void setCapability(List<CentralNetworkCapabilityEnum> capability) {
        this.capability = capability;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkCapabilitiesRequest that = (ListCentralNetworkCapabilitiesRequest) obj;
        return Objects.equals(this.capability, that.capability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkCapabilitiesRequest {\n");
        sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
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
