package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateClientNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allotted_time")

    private String allottedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronized_time")

    private String synchronizedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronized_status")

    private Boolean synchronizedStatus;

    public CreateClientNodeResponse withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 推送通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public CreateClientNodeResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CreateClientNodeResponse withAllottedTime(String allottedTime) {
        this.allottedTime = allottedTime;
        return this;
    }

    /**
     * 路由分配到节点的时间
     * @return allottedTime
     */
    public String getAllottedTime() {
        return allottedTime;
    }

    public void setAllottedTime(String allottedTime) {
        this.allottedTime = allottedTime;
    }

    public CreateClientNodeResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 节点实例化后通道的连接和推送信息的修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CreateClientNodeResponse withSynchronizedTime(String synchronizedTime) {
        this.synchronizedTime = synchronizedTime;
        return this;
    }

    /**
     * 下发时间，表示通道是否已经同步到了节点
     * @return synchronizedTime
     */
    public String getSynchronizedTime() {
        return synchronizedTime;
    }

    public void setSynchronizedTime(String synchronizedTime) {
        this.synchronizedTime = synchronizedTime;
    }

    public CreateClientNodeResponse withSynchronizedStatus(Boolean synchronizedStatus) {
        this.synchronizedStatus = synchronizedStatus;
        return this;
    }

    /**
     * 下发状态，表示是否已同步到了节点
     * @return synchronizedStatus
     */
    public Boolean getSynchronizedStatus() {
        return synchronizedStatus;
    }

    public void setSynchronizedStatus(Boolean synchronizedStatus) {
        this.synchronizedStatus = synchronizedStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClientNodeResponse that = (CreateClientNodeResponse) obj;
        return Objects.equals(this.channelId, that.channelId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.allottedTime, that.allottedTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.synchronizedTime, that.synchronizedTime)
            && Objects.equals(this.synchronizedStatus, that.synchronizedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, nodeId, allottedTime, updateTime, synchronizedTime, synchronizedStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClientNodeResponse {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    allottedTime: ").append(toIndentedString(allottedTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    synchronizedTime: ").append(toIndentedString(synchronizedTime)).append("\n");
        sb.append("    synchronizedStatus: ").append(toIndentedString(synchronizedStatus)).append("\n");
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
