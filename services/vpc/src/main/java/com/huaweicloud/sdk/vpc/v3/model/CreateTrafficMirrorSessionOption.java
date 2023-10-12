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
public class CreateTrafficMirrorSessionOption {

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

    private String virtualNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_length")

    private String packetLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private String enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CreateTrafficMirrorSessionOption withName(String name) {
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

    public CreateTrafficMirrorSessionOption withDescription(String description) {
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

    public CreateTrafficMirrorSessionOption withTrafficMirrorFilterId(String trafficMirrorFilterId) {
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

    public CreateTrafficMirrorSessionOption withTrafficMirrorSources(List<String> trafficMirrorSources) {
        this.trafficMirrorSources = trafficMirrorSources;
        return this;
    }

    public CreateTrafficMirrorSessionOption addTrafficMirrorSourcesItem(String trafficMirrorSourcesItem) {
        if (this.trafficMirrorSources == null) {
            this.trafficMirrorSources = new ArrayList<>();
        }
        this.trafficMirrorSources.add(trafficMirrorSourcesItem);
        return this;
    }

    public CreateTrafficMirrorSessionOption withTrafficMirrorSources(
        Consumer<List<String>> trafficMirrorSourcesSetter) {
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

    public CreateTrafficMirrorSessionOption withTrafficMirrorTargetId(String trafficMirrorTargetId) {
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

    public CreateTrafficMirrorSessionOption withTrafficMirrorTargetType(String trafficMirrorTargetType) {
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

    public CreateTrafficMirrorSessionOption withVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * 功能说明：指定VNI，用于区分不同会话的镜像流量 取值范围：0~16777215 默认值：1
     * @return virtualNetworkId
     */
    public String getVirtualNetworkId() {
        return virtualNetworkId;
    }

    public void setVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    public CreateTrafficMirrorSessionOption withPacketLength(String packetLength) {
        this.packetLength = packetLength;
        return this;
    }

    /**
     * 功能说明：最大传输单元MTU 取值范围：1~1460 默认值：96
     * @return packetLength
     */
    public String getPacketLength() {
        return packetLength;
    }

    public void setPacketLength(String packetLength) {
        this.packetLength = packetLength;
    }

    public CreateTrafficMirrorSessionOption withPriority(Integer priority) {
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

    public CreateTrafficMirrorSessionOption withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 功能说明：是否开启会话 取值范围：true、false 默认值：false
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public CreateTrafficMirrorSessionOption withType(String type) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrafficMirrorSessionOption that = (CreateTrafficMirrorSessionOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.trafficMirrorFilterId, that.trafficMirrorFilterId)
            && Objects.equals(this.trafficMirrorSources, that.trafficMirrorSources)
            && Objects.equals(this.trafficMirrorTargetId, that.trafficMirrorTargetId)
            && Objects.equals(this.trafficMirrorTargetType, that.trafficMirrorTargetType)
            && Objects.equals(this.virtualNetworkId, that.virtualNetworkId)
            && Objects.equals(this.packetLength, that.packetLength) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            trafficMirrorFilterId,
            trafficMirrorSources,
            trafficMirrorTargetId,
            trafficMirrorTargetType,
            virtualNetworkId,
            packetLength,
            priority,
            enabled,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrafficMirrorSessionOption {\n");
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
