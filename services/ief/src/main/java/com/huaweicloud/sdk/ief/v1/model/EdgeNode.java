package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 边缘节点参数 */
public class EdgeNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_gpu")

    private Boolean enableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfigs> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_infos")

    private List<DeviceInfos> deviceInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_npu")

    private Boolean enableNpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<Attributes> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_docker")

    private Boolean enableDocker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<NodeResTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_config")

    private EdgeNodeMqttConfig mqttConfig;

    public EdgeNode withName(String name) {
        this.name = name;
        return this;
    }

    /** 边缘节点名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64 Name为必填字段，且本帐号中唯一。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeNode withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 边缘节点描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeNode withEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
        return this;
    }

    /** 边缘节点是否开启GPU，默认为false
     * 
     * @return enableGpu */
    public Boolean getEnableGpu() {
        return enableGpu;
    }

    public void setEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
    }

    public EdgeNode withLogConfigs(List<LogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public EdgeNode addLogConfigsItem(LogConfigs logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public EdgeNode withLogConfigs(Consumer<List<LogConfigs>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /** 边缘节点日志配置
     * 
     * @return logConfigs */
    public List<LogConfigs> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public EdgeNode withDeviceInfos(List<DeviceInfos> deviceInfos) {
        this.deviceInfos = deviceInfos;
        return this;
    }

    public EdgeNode addDeviceInfosItem(DeviceInfos deviceInfosItem) {
        if (this.deviceInfos == null) {
            this.deviceInfos = new ArrayList<>();
        }
        this.deviceInfos.add(deviceInfosItem);
        return this;
    }

    public EdgeNode withDeviceInfos(Consumer<List<DeviceInfos>> deviceInfosSetter) {
        if (this.deviceInfos == null) {
            this.deviceInfos = new ArrayList<>();
        }
        deviceInfosSetter.accept(this.deviceInfos);
        return this;
    }

    /** 关联设备信息
     * 
     * @return deviceInfos */
    public List<DeviceInfos> getDeviceInfos() {
        return deviceInfos;
    }

    public void setDeviceInfos(List<DeviceInfos> deviceInfos) {
        this.deviceInfos = deviceInfos;
    }

    public EdgeNode withEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
        return this;
    }

    /** 边缘节点是否开启NPU，true表示开启，false表示不开启，默认为false
     * 
     * @return enableNpu */
    public Boolean getEnableNpu() {
        return enableNpu;
    }

    public void setEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
    }

    public EdgeNode withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /** npu类型，支持D310类型和D910类型。 - D310表示D310类型。 - D910表示D910类型。 - 不填表示为D310类型。
     * 
     * @return npuType */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    public EdgeNode withAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public EdgeNode addAttributesItem(Attributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public EdgeNode withAttributes(Consumer<List<Attributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /** 边缘节点属性，关联属性个数最多为32个
     * 
     * @return attributes */
    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public EdgeNode withEnableDocker(Boolean enableDocker) {
        this.enableDocker = enableDocker;
        return this;
    }

    /** 边缘节点启用Docker，默认为true
     * 
     * @return enableDocker */
    public Boolean getEnableDocker() {
        return enableDocker;
    }

    public void setEnableDocker(Boolean enableDocker) {
        this.enableDocker = enableDocker;
    }

    public EdgeNode withTags(List<NodeResTag> tags) {
        this.tags = tags;
        return this;
    }

    public EdgeNode addTagsItem(NodeResTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public EdgeNode withTags(Consumer<List<NodeResTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 边缘节点标签，标签个数最多为20个
     * 
     * @return tags */
    public List<NodeResTag> getTags() {
        return tags;
    }

    public void setTags(List<NodeResTag> tags) {
        this.tags = tags;
    }

    public EdgeNode withMqttConfig(EdgeNodeMqttConfig mqttConfig) {
        this.mqttConfig = mqttConfig;
        return this;
    }

    public EdgeNode withMqttConfig(Consumer<EdgeNodeMqttConfig> mqttConfigSetter) {
        if (this.mqttConfig == null) {
            this.mqttConfig = new EdgeNodeMqttConfig();
            mqttConfigSetter.accept(this.mqttConfig);
        }

        return this;
    }

    /** Get mqttConfig
     * 
     * @return mqttConfig */
    public EdgeNodeMqttConfig getMqttConfig() {
        return mqttConfig;
    }

    public void setMqttConfig(EdgeNodeMqttConfig mqttConfig) {
        this.mqttConfig = mqttConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeNode edgeNode = (EdgeNode) o;
        return Objects.equals(this.name, edgeNode.name) && Objects.equals(this.description, edgeNode.description)
            && Objects.equals(this.enableGpu, edgeNode.enableGpu)
            && Objects.equals(this.logConfigs, edgeNode.logConfigs)
            && Objects.equals(this.deviceInfos, edgeNode.deviceInfos)
            && Objects.equals(this.enableNpu, edgeNode.enableNpu) && Objects.equals(this.npuType, edgeNode.npuType)
            && Objects.equals(this.attributes, edgeNode.attributes)
            && Objects.equals(this.enableDocker, edgeNode.enableDocker) && Objects.equals(this.tags, edgeNode.tags)
            && Objects.equals(this.mqttConfig, edgeNode.mqttConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            enableGpu,
            logConfigs,
            deviceInfos,
            enableNpu,
            npuType,
            attributes,
            enableDocker,
            tags,
            mqttConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNode {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableGpu: ").append(toIndentedString(enableGpu)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    deviceInfos: ").append(toIndentedString(deviceInfos)).append("\n");
        sb.append("    enableNpu: ").append(toIndentedString(enableNpu)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    enableDocker: ").append(toIndentedString(enableDocker)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    mqttConfig: ").append(toIndentedString(mqttConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
