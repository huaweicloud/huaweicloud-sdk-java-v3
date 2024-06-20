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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcServiceName")

    private String vpcServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<PermissionInfo> permissions = null;

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
     * 终端节点更新开关。 - true： 开启终端节点。 - false： 关闭终端节点。
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

    public ShowVpcepConnectionResponse withVpcServiceName(String vpcServiceName) {
        this.vpcServiceName = vpcServiceName;
        return this;
    }

    /**
     * 终端节点服务名称。
     * @return vpcServiceName
     */
    public String getVpcServiceName() {
        return vpcServiceName;
    }

    public void setVpcServiceName(String vpcServiceName) {
        this.vpcServiceName = vpcServiceName;
    }

    public ShowVpcepConnectionResponse withPermissions(List<PermissionInfo> permissions) {
        this.permissions = permissions;
        return this;
    }

    public ShowVpcepConnectionResponse addPermissionsItem(PermissionInfo permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public ShowVpcepConnectionResponse withPermissions(Consumer<List<PermissionInfo>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    public List<PermissionInfo> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionInfo> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVpcepConnectionResponse that = (ShowVpcepConnectionResponse) obj;
        return Objects.equals(this.connections, that.connections)
            && Objects.equals(this.vpcepUpdateSwitch, that.vpcepUpdateSwitch)
            && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.vpcServiceName, that.vpcServiceName)
            && Objects.equals(this.permissions, that.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connections, vpcepUpdateSwitch, totalCount, vpcServiceName, permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpcepConnectionResponse {\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    vpcepUpdateSwitch: ").append(toIndentedString(vpcepUpdateSwitch)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    vpcServiceName: ").append(toIndentedString(vpcServiceName)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
