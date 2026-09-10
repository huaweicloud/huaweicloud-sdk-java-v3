package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowDatasourceConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_cluster_info")

    private List<ConnectionClusterInfo> availableClusterInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_vpc_id")

    private String destVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_network_id")

    private String destNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<ConnectionsHost> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    private List<ConnectionsRoute> routes = null;

    public ShowDatasourceConnectionResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowDatasourceConnectionResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowDatasourceConnectionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 连接ID，用于标识资源组网络连接的UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDatasourceConnectionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建连接时，用户自定义的连接名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDatasourceConnectionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 连接状态，包括以下两种状态： ACTIVE：已激活 DELETED：已删除
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDatasourceConnectionResponse withAvailableClusterInfo(List<ConnectionClusterInfo> availableClusterInfo) {
        this.availableClusterInfo = availableClusterInfo;
        return this;
    }

    public ShowDatasourceConnectionResponse addAvailableClusterInfoItem(
        ConnectionClusterInfo availableClusterInfoItem) {
        if (this.availableClusterInfo == null) {
            this.availableClusterInfo = new ArrayList<>();
        }
        this.availableClusterInfo.add(availableClusterInfoItem);
        return this;
    }

    public ShowDatasourceConnectionResponse withAvailableClusterInfo(
        Consumer<List<ConnectionClusterInfo>> availableClusterInfoSetter) {
        if (this.availableClusterInfo == null) {
            this.availableClusterInfo = new ArrayList<>();
        }
        availableClusterInfoSetter.accept(this.availableClusterInfo);
        return this;
    }

    /**
     * 各个集群创建对等连接的信息。
     * @return availableClusterInfo
     */
    public List<ConnectionClusterInfo> getAvailableClusterInfo() {
        return availableClusterInfo;
    }

    public void setAvailableClusterInfo(List<ConnectionClusterInfo> availableClusterInfo) {
        this.availableClusterInfo = availableClusterInfo;
    }

    public ShowDatasourceConnectionResponse withDestVpcId(String destVpcId) {
        this.destVpcId = destVpcId;
        return this;
    }

    /**
     * 对应服务的虚拟私有云标识。
     * @return destVpcId
     */
    public String getDestVpcId() {
        return destVpcId;
    }

    public void setDestVpcId(String destVpcId) {
        this.destVpcId = destVpcId;
    }

    public ShowDatasourceConnectionResponse withDestNetworkId(String destNetworkId) {
        this.destNetworkId = destNetworkId;
        return this;
    }

    /**
     * 对应服务的子网网络标识。
     * @return destNetworkId
     */
    public String getDestNetworkId() {
        return destNetworkId;
    }

    public void setDestNetworkId(String destNetworkId) {
        this.destNetworkId = destNetworkId;
    }

    public ShowDatasourceConnectionResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建连接的时间。为UTC的时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowDatasourceConnectionResponse withHosts(List<ConnectionsHost> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ShowDatasourceConnectionResponse addHostsItem(ConnectionsHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ShowDatasourceConnectionResponse withHosts(Consumer<List<ConnectionsHost>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 用户自定义主机信息。
     * @return hosts
     */
    public List<ConnectionsHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<ConnectionsHost> hosts) {
        this.hosts = hosts;
    }

    public ShowDatasourceConnectionResponse withRoutes(List<ConnectionsRoute> routes) {
        this.routes = routes;
        return this;
    }

    public ShowDatasourceConnectionResponse addRoutesItem(ConnectionsRoute routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public ShowDatasourceConnectionResponse withRoutes(Consumer<List<ConnectionsRoute>> routesSetter) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 用户添加的路由信息。
     * @return routes
     */
    public List<ConnectionsRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<ConnectionsRoute> routes) {
        this.routes = routes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatasourceConnectionResponse that = (ShowDatasourceConnectionResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.availableClusterInfo, that.availableClusterInfo)
            && Objects.equals(this.destVpcId, that.destVpcId) && Objects.equals(this.destNetworkId, that.destNetworkId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.routes, that.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess,
            message,
            id,
            name,
            status,
            availableClusterInfo,
            destVpcId,
            destNetworkId,
            createTime,
            hosts,
            routes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatasourceConnectionResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availableClusterInfo: ").append(toIndentedString(availableClusterInfo)).append("\n");
        sb.append("    destVpcId: ").append(toIndentedString(destVpcId)).append("\n");
        sb.append("    destNetworkId: ").append(toIndentedString(destNetworkId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
