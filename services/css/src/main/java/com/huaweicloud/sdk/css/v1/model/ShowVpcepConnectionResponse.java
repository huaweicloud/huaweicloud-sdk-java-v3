package com.huaweicloud.sdk.css.v1.model;

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
public class ShowVpcepConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private List<Connections> connections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcepUpdateSwitch")

    private Boolean vpcepUpdateSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowVpcepConnectionResponse withConnections(List<Connections> connections) {
        this.connections = connections;
        return this;
    }

    public ShowVpcepConnectionResponse addConnectionsItem(Connections connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public ShowVpcepConnectionResponse withConnections(Consumer<List<Connections>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /**
     * Get connections
     * @return connections
     */
    public List<Connections> getConnections() {
        return connections;
    }

    public void setConnections(List<Connections> connections) {
        this.connections = connections;
    }

    public ShowVpcepConnectionResponse withVpcepUpdateSwitch(Boolean vpcepUpdateSwitch) {
        this.vpcepUpdateSwitch = vpcepUpdateSwitch;
        return this;
    }

    /**
     * 终端节点更新开关。
     * @return vpcepUpdateSwitch
     */
    public Boolean getVpcepUpdateSwitch() {
        return vpcepUpdateSwitch;
    }

    public void setVpcepUpdateSwitch(Boolean vpcepUpdateSwitch) {
        this.vpcepUpdateSwitch = vpcepUpdateSwitch;
    }

    public ShowVpcepConnectionResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 终端节点数量。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVpcepConnectionResponse showVpcepConnectionResponse = (ShowVpcepConnectionResponse) o;
        return Objects.equals(this.connections, showVpcepConnectionResponse.connections)
            && Objects.equals(this.vpcepUpdateSwitch, showVpcepConnectionResponse.vpcepUpdateSwitch)
            && Objects.equals(this.totalCount, showVpcepConnectionResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connections, vpcepUpdateSwitch, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpcepConnectionResponse {\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    vpcepUpdateSwitch: ").append(toIndentedString(vpcepUpdateSwitch)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
