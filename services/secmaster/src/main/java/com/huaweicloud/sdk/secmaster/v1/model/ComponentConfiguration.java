package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件配置定义简介
 */
public class ComponentConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    /**
     * **参数解释**: 节点配置状态 - UN_SAVED 待保存 - SAVE_AND_UN_APPLY 待应用 - MOVE_AND_UN_APPLY 待移除 - APPLYING 应用中 - FAIL_APPLY 应用失败 - APPLIED 应用完成  **约束限制** 不涉及 **取值范围**: - UN_SAVED - SAVE_AND_UN_APPLY - MOVE_AND_UN_APPLY - APPLYING - FAIL_APPLY - APPLIED  **默认值** 不涉及
     */
    public static final class ConfigStatusEnum {

        /**
         * Enum UN_SAVED for value: "UN_SAVED"
         */
        public static final ConfigStatusEnum UN_SAVED = new ConfigStatusEnum("UN_SAVED");

        /**
         * Enum SAVE_AND_UN_APPLY for value: "SAVE_AND_UN_APPLY"
         */
        public static final ConfigStatusEnum SAVE_AND_UN_APPLY = new ConfigStatusEnum("SAVE_AND_UN_APPLY");

        /**
         * Enum MOVE_AND_UN_APPLY for value: "MOVE_AND_UN_APPLY"
         */
        public static final ConfigStatusEnum MOVE_AND_UN_APPLY = new ConfigStatusEnum("MOVE_AND_UN_APPLY");

        /**
         * Enum APPLYING for value: "APPLYING"
         */
        public static final ConfigStatusEnum APPLYING = new ConfigStatusEnum("APPLYING");

        /**
         * Enum FAIL_APPLY for value: "FAIL_APPLY"
         */
        public static final ConfigStatusEnum FAIL_APPLY = new ConfigStatusEnum("FAIL_APPLY");

        /**
         * Enum APPLIED for value: "APPLIED"
         */
        public static final ConfigStatusEnum APPLIED = new ConfigStatusEnum("APPLIED");

        private static final Map<String, ConfigStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigStatusEnum> createStaticFields() {
            Map<String, ConfigStatusEnum> map = new HashMap<>();
            map.put("UN_SAVED", UN_SAVED);
            map.put("SAVE_AND_UN_APPLY", SAVE_AND_UN_APPLY);
            map.put("MOVE_AND_UN_APPLY", MOVE_AND_UN_APPLY);
            map.put("APPLYING", APPLYING);
            map.put("FAIL_APPLY", FAIL_APPLY);
            map.put("APPLIED", APPLIED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConfigStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfigStatusEnum(value));
        }

        public static ConfigStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfigStatusEnum) {
                return this.value.equals(((ConfigStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private ConfigStatusEnum configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_deploy_message")

    private String failDeployMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<ComponentConfigurationParam> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor")

    private Monitor monitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_apply_fail_enum")

    private NodeApplyFailEnum nodeApplyFailEnum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_expansion")

    private IsapNodeExpansion nodeExpansion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_address")

    private String vpcEndpointAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_id")

    private String vpcEndpointId;

    public ComponentConfiguration withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件id.
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ComponentConfiguration withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 组件名称
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ComponentConfiguration withConfigStatus(ConfigStatusEnum configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * **参数解释**: 节点配置状态 - UN_SAVED 待保存 - SAVE_AND_UN_APPLY 待应用 - MOVE_AND_UN_APPLY 待移除 - APPLYING 应用中 - FAIL_APPLY 应用失败 - APPLIED 应用完成  **约束限制** 不涉及 **取值范围**: - UN_SAVED - SAVE_AND_UN_APPLY - MOVE_AND_UN_APPLY - APPLYING - FAIL_APPLY - APPLIED  **默认值** 不涉及
     * @return configStatus
     */
    public ConfigStatusEnum getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(ConfigStatusEnum configStatus) {
        this.configStatus = configStatus;
    }

    public ComponentConfiguration withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 9223372036854775800
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ComponentConfiguration withFailDeployMessage(String failDeployMessage) {
        this.failDeployMessage = failDeployMessage;
        return this;
    }

    /**
     * 部署失败的消息
     * @return failDeployMessage
     */
    public String getFailDeployMessage() {
        return failDeployMessage;
    }

    public void setFailDeployMessage(String failDeployMessage) {
        this.failDeployMessage = failDeployMessage;
    }

    public ComponentConfiguration withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ComponentConfiguration withList(List<ComponentConfigurationParam> list) {
        this.list = list;
        return this;
    }

    public ComponentConfiguration addListItem(ComponentConfigurationParam listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ComponentConfiguration withList(Consumer<List<ComponentConfigurationParam>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 组件配置参数列表
     * @return list
     */
    public List<ComponentConfigurationParam> getList() {
        return list;
    }

    public void setList(List<ComponentConfigurationParam> list) {
        this.list = list;
    }

    public ComponentConfiguration withMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public ComponentConfiguration withMonitor(Consumer<Monitor> monitorSetter) {
        if (this.monitor == null) {
            this.monitor = new Monitor();
            monitorSetter.accept(this.monitor);
        }

        return this;
    }

    /**
     * Get monitor
     * @return monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ComponentConfiguration withNodeApplyFailEnum(NodeApplyFailEnum nodeApplyFailEnum) {
        this.nodeApplyFailEnum = nodeApplyFailEnum;
        return this;
    }

    /**
     * Get nodeApplyFailEnum
     * @return nodeApplyFailEnum
     */
    public NodeApplyFailEnum getNodeApplyFailEnum() {
        return nodeApplyFailEnum;
    }

    public void setNodeApplyFailEnum(NodeApplyFailEnum nodeApplyFailEnum) {
        this.nodeApplyFailEnum = nodeApplyFailEnum;
    }

    public ComponentConfiguration withNodeExpansion(IsapNodeExpansion nodeExpansion) {
        this.nodeExpansion = nodeExpansion;
        return this;
    }

    public ComponentConfiguration withNodeExpansion(Consumer<IsapNodeExpansion> nodeExpansionSetter) {
        if (this.nodeExpansion == null) {
            this.nodeExpansion = new IsapNodeExpansion();
            nodeExpansionSetter.accept(this.nodeExpansion);
        }

        return this;
    }

    /**
     * Get nodeExpansion
     * @return nodeExpansion
     */
    public IsapNodeExpansion getNodeExpansion() {
        return nodeExpansion;
    }

    public void setNodeExpansion(IsapNodeExpansion nodeExpansion) {
        this.nodeExpansion = nodeExpansion;
    }

    public ComponentConfiguration withNodeId(String nodeId) {
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

    public ComponentConfiguration withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ComponentConfiguration withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * IP地址
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public ComponentConfiguration withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地区
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ComponentConfiguration withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 规范
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ComponentConfiguration withVpcEndpointAddress(String vpcEndpointAddress) {
        this.vpcEndpointAddress = vpcEndpointAddress;
        return this;
    }

    /**
     * VPC端点地址
     * @return vpcEndpointAddress
     */
    public String getVpcEndpointAddress() {
        return vpcEndpointAddress;
    }

    public void setVpcEndpointAddress(String vpcEndpointAddress) {
        this.vpcEndpointAddress = vpcEndpointAddress;
    }

    public ComponentConfiguration withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * VPC端点ID
     * @return vpcEndpointId
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentConfiguration that = (ComponentConfiguration) obj;
        return Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.configStatus, that.configStatus) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.failDeployMessage, that.failDeployMessage)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.list, that.list)
            && Objects.equals(this.monitor, that.monitor)
            && Objects.equals(this.nodeApplyFailEnum, that.nodeApplyFailEnum)
            && Objects.equals(this.nodeExpansion, that.nodeExpansion) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress) && Objects.equals(this.region, that.region)
            && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.vpcEndpointAddress, that.vpcEndpointAddress)
            && Objects.equals(this.vpcEndpointId, that.vpcEndpointId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId,
            componentName,
            configStatus,
            createTime,
            failDeployMessage,
            ipAddress,
            list,
            monitor,
            nodeApplyFailEnum,
            nodeExpansion,
            nodeId,
            nodeName,
            privateIpAddress,
            region,
            specification,
            vpcEndpointAddress,
            vpcEndpointId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentConfiguration {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    failDeployMessage: ").append(toIndentedString(failDeployMessage)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
        sb.append("    nodeApplyFailEnum: ").append(toIndentedString(nodeApplyFailEnum)).append("\n");
        sb.append("    nodeExpansion: ").append(toIndentedString(nodeExpansion)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    vpcEndpointAddress: ").append(toIndentedString(vpcEndpointAddress)).append("\n");
        sb.append("    vpcEndpointId: ").append(toIndentedString(vpcEndpointId)).append("\n");
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
