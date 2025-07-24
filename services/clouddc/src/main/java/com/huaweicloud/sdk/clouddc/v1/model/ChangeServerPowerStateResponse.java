package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ChangeServerPowerStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_servers")

    private List<ServersResponsePhysicalServers> physicalServers = null;

    public ChangeServerPowerStateResponse withPhysicalServers(List<ServersResponsePhysicalServers> physicalServers) {
        this.physicalServers = physicalServers;
        return this;
    }

    public ChangeServerPowerStateResponse addPhysicalServersItem(ServersResponsePhysicalServers physicalServersItem) {
        if (this.physicalServers == null) {
            this.physicalServers = new ArrayList<>();
        }
        this.physicalServers.add(physicalServersItem);
        return this;
    }

    public ChangeServerPowerStateResponse withPhysicalServers(
        Consumer<List<ServersResponsePhysicalServers>> physicalServersSetter) {
        if (this.physicalServers == null) {
            this.physicalServers = new ArrayList<>();
        }
        physicalServersSetter.accept(this.physicalServers);
        return this;
    }

    /**
     * 物理服务器返回信息
     * @return physicalServers
     */
    public List<ServersResponsePhysicalServers> getPhysicalServers() {
        return physicalServers;
    }

    public void setPhysicalServers(List<ServersResponsePhysicalServers> physicalServers) {
        this.physicalServers = physicalServers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeServerPowerStateResponse that = (ChangeServerPowerStateResponse) obj;
        return Objects.equals(this.physicalServers, that.physicalServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicalServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerPowerStateResponse {\n");
        sb.append("    physicalServers: ").append(toIndentedString(physicalServers)).append("\n");
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
