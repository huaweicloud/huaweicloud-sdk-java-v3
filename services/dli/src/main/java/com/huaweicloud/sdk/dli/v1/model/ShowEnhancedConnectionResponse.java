package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_queue_info")

    @JacksonXmlProperty(localName = "available_queue_info")

    private List<EnhancedConnectionQueueInfo> availableQueueInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_vpc_id")

    @JacksonXmlProperty(localName = "dest_vpc_id")

    private String destVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_network_id")

    @JacksonXmlProperty(localName = "dest_network_id")

    private String destNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    @JacksonXmlProperty(localName = "hosts")

    private List<EnhancedConnectionsHost> hosts = null;

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

    public ShowEnhancedConnectionResponse withAvailableQueueInfo(List<EnhancedConnectionQueueInfo> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
        return this;
    }

    public ShowEnhancedConnectionResponse addAvailableQueueInfoItem(
        EnhancedConnectionQueueInfo availableQueueInfoItem) {
        if (this.availableQueueInfo == null) {
            this.availableQueueInfo = new ArrayList<>();
        }
        this.availableQueueInfo.add(availableQueueInfoItem);
        return this;
    }

    public ShowEnhancedConnectionResponse withAvailableQueueInfo(
        Consumer<List<EnhancedConnectionQueueInfo>> availableQueueInfoSetter) {
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
    public List<EnhancedConnectionQueueInfo> getAvailableQueueInfo() {
        return availableQueueInfo;
    }

    public void setAvailableQueueInfo(List<EnhancedConnectionQueueInfo> availableQueueInfo) {
        this.availableQueueInfo = availableQueueInfo;
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

    public ShowEnhancedConnectionResponse withHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ShowEnhancedConnectionResponse addHostsItem(EnhancedConnectionsHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ShowEnhancedConnectionResponse withHosts(Consumer<List<EnhancedConnectionsHost>> hostsSetter) {
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
    public List<EnhancedConnectionsHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEnhancedConnectionResponse showEnhancedConnectionResponse = (ShowEnhancedConnectionResponse) o;
        return Objects.equals(this.isSuccess, showEnhancedConnectionResponse.isSuccess)
            && Objects.equals(this.message, showEnhancedConnectionResponse.message)
            && Objects.equals(this.id, showEnhancedConnectionResponse.id)
            && Objects.equals(this.name, showEnhancedConnectionResponse.name)
            && Objects.equals(this.status, showEnhancedConnectionResponse.status)
            && Objects.equals(this.availableQueueInfo, showEnhancedConnectionResponse.availableQueueInfo)
            && Objects.equals(this.destVpcId, showEnhancedConnectionResponse.destVpcId)
            && Objects.equals(this.destNetworkId, showEnhancedConnectionResponse.destNetworkId)
            && Objects.equals(this.createTime, showEnhancedConnectionResponse.createTime)
            && Objects.equals(this.hosts, showEnhancedConnectionResponse.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess,
            message,
            id,
            name,
            status,
            availableQueueInfo,
            destVpcId,
            destNetworkId,
            createTime,
            hosts);
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
        sb.append("    destVpcId: ").append(toIndentedString(destVpcId)).append("\n");
        sb.append("    destNetworkId: ").append(toIndentedString(destNetworkId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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
