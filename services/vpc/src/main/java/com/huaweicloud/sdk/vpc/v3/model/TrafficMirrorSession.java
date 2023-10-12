package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class TrafficMirrorSession {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

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
    @JsonProperty(value = "traffic_mirror_sources")

    private List<String> trafficMirrorSources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_target_id")

    private String trafficMirrorTargetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_target_type")

    private String trafficMirrorTargetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_network_id")

    private Integer virtualNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_length")

    private Integer packetLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public TrafficMirrorSession withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：流量镜像会话ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrafficMirrorSession withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TrafficMirrorSession withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：流量镜像会话名称 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrafficMirrorSession withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：流量镜像会话的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TrafficMirrorSession withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * 功能说明：流量镜像筛选条件ID
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    public TrafficMirrorSession withTrafficMirrorSources(List<String> trafficMirrorSources) {
        this.trafficMirrorSources = trafficMirrorSources;
        return this;
    }

    public TrafficMirrorSession addTrafficMirrorSourcesItem(String trafficMirrorSourcesItem) {
        if (this.trafficMirrorSources == null) {
            this.trafficMirrorSources = new ArrayList<>();
        }
        this.trafficMirrorSources.add(trafficMirrorSourcesItem);
        return this;
    }

    public TrafficMirrorSession withTrafficMirrorSources(Consumer<List<String>> trafficMirrorSourcesSetter) {
        if (this.trafficMirrorSources == null) {
            this.trafficMirrorSources = new ArrayList<>();
        }
        trafficMirrorSourcesSetter.accept(this.trafficMirrorSources);
        return this;
    }

    /**
     * 功能说明：镜像源ID列表，支持弹性网卡作为镜像源。 约束：一个镜像会话默认最大支持10个镜像源。
     * @return trafficMirrorSources
     */
    public List<String> getTrafficMirrorSources() {
        return trafficMirrorSources;
    }

    public void setTrafficMirrorSources(List<String> trafficMirrorSources) {
        this.trafficMirrorSources = trafficMirrorSources;
    }

    public TrafficMirrorSession withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }

    /**
     * 功能说明：镜像目的ID
     * @return trafficMirrorTargetId
     */
    public String getTrafficMirrorTargetId() {
        return trafficMirrorTargetId;
    }

    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    public TrafficMirrorSession withTrafficMirrorTargetType(String trafficMirrorTargetType) {
        this.trafficMirrorTargetType = trafficMirrorTargetType;
        return this;
    }

    /**
     * 功能说明：镜像目的类型 取值范围：     eni：弹性网卡     elb：私网弹性负载均衡
     * @return trafficMirrorTargetType
     */
    public String getTrafficMirrorTargetType() {
        return trafficMirrorTargetType;
    }

    public void setTrafficMirrorTargetType(String trafficMirrorTargetType) {
        this.trafficMirrorTargetType = trafficMirrorTargetType;
    }

    public TrafficMirrorSession withVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * 功能说明：指定VNI，用于区分不同会话的镜像流量 取值范围：0~16777215 默认值：1
     * @return virtualNetworkId
     */
    public Integer getVirtualNetworkId() {
        return virtualNetworkId;
    }

    public void setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    public TrafficMirrorSession withPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
        return this;
    }

    /**
     * 功能说明：最大传输单元MTU 取值范围：1~1460 默认值：96
     * @return packetLength
     */
    public Integer getPacketLength() {
        return packetLength;
    }

    public void setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
    }

    public TrafficMirrorSession withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 功能说明：会话优先级 取值范围：1~32766
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public TrafficMirrorSession withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 功能说明：是否开启会话 取值范围：true、false 默认值：false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public TrafficMirrorSession withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 功能说明：支持的镜像源类型 取值范围：     eni：弹性网卡
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TrafficMirrorSession withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：创建时间戳
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TrafficMirrorSession withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 功能说明：更新时间戳
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
        TrafficMirrorSession that = (TrafficMirrorSession) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.trafficMirrorFilterId, that.trafficMirrorFilterId)
            && Objects.equals(this.trafficMirrorSources, that.trafficMirrorSources)
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
            projectId,
            name,
            description,
            trafficMirrorFilterId,
            trafficMirrorSources,
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
        sb.append("class TrafficMirrorSession {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    trafficMirrorFilterId: ").append(toIndentedString(trafficMirrorFilterId)).append("\n");
        sb.append("    trafficMirrorSources: ").append(toIndentedString(trafficMirrorSources)).append("\n");
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
