package com.huaweicloud.sdk.dli.v1.model;

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
public class ShowEnhancedConnectionResponse extends SdkResponse {

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
    @JsonProperty(value = "available_queue_info")

    private List<EnhancedConnectionResource> availableQueueInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pools")

    private List<EnhancedConnectionResource> elasticResourcePools = null;

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

    private List<EnhancedConnectionHost> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    public ShowEnhancedConnectionResponse withIsSuccess(Boolean isSuccess) {
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

    public ShowEnhancedConnectionResponse withMessage(String message) {
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

    public ShowEnhancedConnectionResponse withId(String id) {
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

    public ShowEnhancedConnectionResponse withName(String name) {
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

    public ShowEnhancedConnectionResponse withStatus(String status) {
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

    public ShowEnhancedConnectionResponse withAvailableQueueInfo(List<EnhancedConnectionResource> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
        return this;
    }

    public ShowEnhancedConnectionResponse addAvailableQueueInfoItem(EnhancedConnectionResource availableQueueInfoItem) {
        if (this.availableQueueInfo == null) {
            this.availableQueueInfo = new ArrayList<>();
        }
        this.availableQueueInfo.add(availableQueueInfoItem);
        return this;
    }

    public ShowEnhancedConnectionResponse withAvailableQueueInfo(
        Consumer<List<EnhancedConnectionResource>> availableQueueInfoSetter) {
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
    public List<EnhancedConnectionResource> getAvailableQueueInfo() {
        return availableQueueInfo;
    }

    public void setAvailableQueueInfo(List<EnhancedConnectionResource> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
    }

    public ShowEnhancedConnectionResponse withElasticResourcePools(
        List<EnhancedConnectionResource> elasticResourcePools) {
        this.elasticResourcePools = elasticResourcePools;
        return this;
    }

    public ShowEnhancedConnectionResponse addElasticResourcePoolsItem(
        EnhancedConnectionResource elasticResourcePoolsItem) {
        if (this.elasticResourcePools == null) {
            this.elasticResourcePools = new ArrayList<>();
        }
        this.elasticResourcePools.add(elasticResourcePoolsItem);
        return this;
    }

    public ShowEnhancedConnectionResponse withElasticResourcePools(
        Consumer<List<EnhancedConnectionResource>> elasticResourcePoolsSetter) {
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
    public List<EnhancedConnectionResource> getElasticResourcePools() {
        return elasticResourcePools;
    }

    public void setElasticResourcePools(List<EnhancedConnectionResource> elasticResourcePools) {
        this.elasticResourcePools = elasticResourcePools;
    }

    public ShowEnhancedConnectionResponse withDestVpcId(String destVpcId) {
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

    public ShowEnhancedConnectionResponse withDestNetworkId(String destNetworkId) {
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

    public ShowEnhancedConnectionResponse withCreateTime(Long createTime) {
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

    public ShowEnhancedConnectionResponse withHosts(List<EnhancedConnectionHost> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ShowEnhancedConnectionResponse addHostsItem(EnhancedConnectionHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ShowEnhancedConnectionResponse withHosts(Consumer<List<EnhancedConnectionHost>> hostsSetter) {
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
    public List<EnhancedConnectionHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<EnhancedConnectionHost> hosts) {
        this.hosts = hosts;
    }

    public ShowEnhancedConnectionResponse withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否启用IPv6
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEnhancedConnectionResponse that = (ShowEnhancedConnectionResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.availableQueueInfo, that.availableQueueInfo)
            && Objects.equals(this.elasticResourcePools, that.elasticResourcePools)
            && Objects.equals(this.destVpcId, that.destVpcId) && Objects.equals(this.destNetworkId, that.destNetworkId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess,
            message,
            id,
            name,
            status,
            availableQueueInfo,
            elasticResourcePools,
            destVpcId,
            destNetworkId,
            createTime,
            hosts,
            ipv6Enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnhancedConnectionResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availableQueueInfo: ").append(toIndentedString(availableQueueInfo)).append("\n");
        sb.append("    elasticResourcePools: ").append(toIndentedString(elasticResourcePools)).append("\n");
        sb.append("    destVpcId: ").append(toIndentedString(destVpcId)).append("\n");
        sb.append("    destNetworkId: ").append(toIndentedString(destNetworkId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
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
