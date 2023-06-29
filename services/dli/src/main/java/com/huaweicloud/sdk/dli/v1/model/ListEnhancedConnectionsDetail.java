package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 跨源连接信息列表的连接具体信息。
 */
public class ListEnhancedConnectionsDetail {

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
    @JsonProperty(value = "available_queue_info")

    private List<EnhancedConnectionResourceInfo> availableQueueInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pools")

    private List<EnhancedConnectionResourceInfo> elasticResourcePools = null;

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

    private List<EnhancedConnectionsHost> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isPrivis")

    private Boolean isPrivis;

    public ListEnhancedConnectionsDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 连接ID，用于标识跨源连接的UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListEnhancedConnectionsDetail withName(String name) {
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

    public ListEnhancedConnectionsDetail withStatus(String status) {
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

    public ListEnhancedConnectionsDetail withAvailableQueueInfo(
        List<EnhancedConnectionResourceInfo> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
        return this;
    }

    public ListEnhancedConnectionsDetail addAvailableQueueInfoItem(
        EnhancedConnectionResourceInfo availableQueueInfoItem) {
        if (this.availableQueueInfo == null) {
            this.availableQueueInfo = new ArrayList<>();
        }
        this.availableQueueInfo.add(availableQueueInfoItem);
        return this;
    }

    public ListEnhancedConnectionsDetail withAvailableQueueInfo(
        Consumer<List<EnhancedConnectionResourceInfo>> availableQueueInfoSetter) {
        if (this.availableQueueInfo == null) {
            this.availableQueueInfo = new ArrayList<>();
        }
        availableQueueInfoSetter.accept(this.availableQueueInfo);
        return this;
    }

    /**
     * 各个队列创建对等连接的信息。
     * @return availableQueueInfo
     */
    public List<EnhancedConnectionResourceInfo> getAvailableQueueInfo() {
        return availableQueueInfo;
    }

    public void setAvailableQueueInfo(List<EnhancedConnectionResourceInfo> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
    }

    public ListEnhancedConnectionsDetail withElasticResourcePools(
        List<EnhancedConnectionResourceInfo> elasticResourcePools) {
        this.elasticResourcePools = elasticResourcePools;
        return this;
    }

    public ListEnhancedConnectionsDetail addElasticResourcePoolsItem(
        EnhancedConnectionResourceInfo elasticResourcePoolsItem) {
        if (this.elasticResourcePools == null) {
            this.elasticResourcePools = new ArrayList<>();
        }
        this.elasticResourcePools.add(elasticResourcePoolsItem);
        return this;
    }

    public ListEnhancedConnectionsDetail withElasticResourcePools(
        Consumer<List<EnhancedConnectionResourceInfo>> elasticResourcePoolsSetter) {
        if (this.elasticResourcePools == null) {
            this.elasticResourcePools = new ArrayList<>();
        }
        elasticResourcePoolsSetter.accept(this.elasticResourcePools);
        return this;
    }

    /**
     * 各个弹性资源池创建对等连接的信息。
     * @return elasticResourcePools
     */
    public List<EnhancedConnectionResourceInfo> getElasticResourcePools() {
        return elasticResourcePools;
    }

    public void setElasticResourcePools(List<EnhancedConnectionResourceInfo> elasticResourcePools) {
        this.elasticResourcePools = elasticResourcePools;
    }

    public ListEnhancedConnectionsDetail withDestVpcId(String destVpcId) {
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

    public ListEnhancedConnectionsDetail withDestNetworkId(String destNetworkId) {
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

    public ListEnhancedConnectionsDetail withCreateTime(Long createTime) {
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

    public ListEnhancedConnectionsDetail withHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListEnhancedConnectionsDetail addHostsItem(EnhancedConnectionsHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListEnhancedConnectionsDetail withHosts(Consumer<List<EnhancedConnectionsHost>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 用户自定义主机信息
     * @return hosts
     */
    public List<EnhancedConnectionsHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
    }

    public ListEnhancedConnectionsDetail withIsPrivis(Boolean isPrivis) {
        this.isPrivis = isPrivis;
        return this;
    }

    /**
     * 该增强跨源连接如果做过项目赋权，则该字段是\"false\"，否则为\"true\"。
     * @return isPrivis
     */
    public Boolean getIsPrivis() {
        return isPrivis;
    }

    public void setIsPrivis(Boolean isPrivis) {
        this.isPrivis = isPrivis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnhancedConnectionsDetail that = (ListEnhancedConnectionsDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.availableQueueInfo, that.availableQueueInfo)
            && Objects.equals(this.elasticResourcePools, that.elasticResourcePools)
            && Objects.equals(this.destVpcId, that.destVpcId) && Objects.equals(this.destNetworkId, that.destNetworkId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.isPrivis, that.isPrivis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            availableQueueInfo,
            elasticResourcePools,
            destVpcId,
            destNetworkId,
            createTime,
            hosts,
            isPrivis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnhancedConnectionsDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availableQueueInfo: ").append(toIndentedString(availableQueueInfo)).append("\n");
        sb.append("    elasticResourcePools: ").append(toIndentedString(elasticResourcePools)).append("\n");
        sb.append("    destVpcId: ").append(toIndentedString(destVpcId)).append("\n");
        sb.append("    destNetworkId: ").append(toIndentedString(destNetworkId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    isPrivis: ").append(toIndentedString(isPrivis)).append("\n");
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
