package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTrafficMirrorSessionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_id")

    private String trafficMirrorFilterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_target_id")

    private String trafficMirrorTargetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_target_type")

    private String trafficMirrorTargetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_network_id")

    private String virtualNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_length")

    private String packetLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private String enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ListTrafficMirrorSessionsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 使用镜像会话ID过滤或排序
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListTrafficMirrorSessionsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 使用镜像会话名称过滤或排序
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTrafficMirrorSessionsRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 使用镜像会话描述过滤
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListTrafficMirrorSessionsRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * 使用筛选条件ID过滤
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    public ListTrafficMirrorSessionsRequest withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }

    /**
     * 使用镜像目的ID过滤
     * @return trafficMirrorTargetId
     */
    public String getTrafficMirrorTargetId() {
        return trafficMirrorTargetId;
    }

    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    public ListTrafficMirrorSessionsRequest withTrafficMirrorTargetType(String trafficMirrorTargetType) {
        this.trafficMirrorTargetType = trafficMirrorTargetType;
        return this;
    }

    /**
     * 使用镜像目的类型过滤
     * @return trafficMirrorTargetType
     */
    public String getTrafficMirrorTargetType() {
        return trafficMirrorTargetType;
    }

    public void setTrafficMirrorTargetType(String trafficMirrorTargetType) {
        this.trafficMirrorTargetType = trafficMirrorTargetType;
    }

    public ListTrafficMirrorSessionsRequest withVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * 使用VNI过滤
     * @return virtualNetworkId
     */
    public String getVirtualNetworkId() {
        return virtualNetworkId;
    }

    public void setVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    public ListTrafficMirrorSessionsRequest withPacketLength(String packetLength) {
        this.packetLength = packetLength;
        return this;
    }

    /**
     * 使用最大传输单元MTU过滤
     * @return packetLength
     */
    public String getPacketLength() {
        return packetLength;
    }

    public void setPacketLength(String packetLength) {
        this.packetLength = packetLength;
    }

    public ListTrafficMirrorSessionsRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 使用镜像会话优先级过滤
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public ListTrafficMirrorSessionsRequest withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 使用enabled过滤
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public ListTrafficMirrorSessionsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 使用镜像源类型过滤
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListTrafficMirrorSessionsRequest withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 使用创建时间戳排序
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListTrafficMirrorSessionsRequest withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 使用更新时间戳排序
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrafficMirrorSessionsRequest that = (ListTrafficMirrorSessionsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.trafficMirrorFilterId, that.trafficMirrorFilterId)
            && Objects.equals(this.trafficMirrorTargetId, that.trafficMirrorTargetId)
            && Objects.equals(this.trafficMirrorTargetType, that.trafficMirrorTargetType)
            && Objects.equals(this.virtualNetworkId, that.virtualNetworkId)
            && Objects.equals(this.packetLength, that.packetLength) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.type, that.type)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            trafficMirrorFilterId,
            trafficMirrorTargetId,
            trafficMirrorTargetType,
            virtualNetworkId,
            packetLength,
            priority,
            enabled,
            type,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrafficMirrorSessionsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    trafficMirrorFilterId: ").append(toIndentedString(trafficMirrorFilterId)).append("\n");
        sb.append("    trafficMirrorTargetId: ").append(toIndentedString(trafficMirrorTargetId)).append("\n");
        sb.append("    trafficMirrorTargetType: ").append(toIndentedString(trafficMirrorTargetType)).append("\n");
        sb.append("    virtualNetworkId: ").append(toIndentedString(virtualNetworkId)).append("\n");
        sb.append("    packetLength: ").append(toIndentedString(packetLength)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
