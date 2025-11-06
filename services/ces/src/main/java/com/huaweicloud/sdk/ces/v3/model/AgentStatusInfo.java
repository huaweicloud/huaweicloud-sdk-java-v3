package com.huaweicloud.sdk.ces.v3.model;

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
 * AgentStatusInfo
 */
public class AgentStatusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * **参数解释**: uniagent运行状态 **取值范围**: - none: 未安装 - running: 运行中 - silent: 静默状态，用于大规模插件异常时，紧急规避的一种措施，现象是kill掉telescope，只保留uniagent的心跳功能 - unknown: 心跳故障，不上报心跳数据，属于连接丢失故障 
     */
    public static final class UniagentStatusEnum {

        /**
         * Enum NONE for value: "none"
         */
        public static final UniagentStatusEnum NONE = new UniagentStatusEnum("none");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final UniagentStatusEnum RUNNING = new UniagentStatusEnum("running");

        /**
         * Enum SILENT for value: "silent"
         */
        public static final UniagentStatusEnum SILENT = new UniagentStatusEnum("silent");

        /**
         * Enum UNKNOWN for value: "unknown"
         */
        public static final UniagentStatusEnum UNKNOWN = new UniagentStatusEnum("unknown");

        private static final Map<String, UniagentStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UniagentStatusEnum> createStaticFields() {
            Map<String, UniagentStatusEnum> map = new HashMap<>();
            map.put("none", NONE);
            map.put("running", RUNNING);
            map.put("silent", SILENT);
            map.put("unknown", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UniagentStatusEnum(String value) {
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
        public static UniagentStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UniagentStatusEnum(value));
        }

        public static UniagentStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UniagentStatusEnum) {
                return this.value.equals(((UniagentStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uniagent_status")

    private UniagentStatusEnum uniagentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensions")

    private List<ExtensionInfo> extensions = null;

    public AgentStatusInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 机器id **取值范围**: 1到64个字符的字符串，且只包含字母、数字和连字符 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AgentStatusInfo withUniagentStatus(UniagentStatusEnum uniagentStatus) {
        this.uniagentStatus = uniagentStatus;
        return this;
    }

    /**
     * **参数解释**: uniagent运行状态 **取值范围**: - none: 未安装 - running: 运行中 - silent: 静默状态，用于大规模插件异常时，紧急规避的一种措施，现象是kill掉telescope，只保留uniagent的心跳功能 - unknown: 心跳故障，不上报心跳数据，属于连接丢失故障 
     * @return uniagentStatus
     */
    public UniagentStatusEnum getUniagentStatus() {
        return uniagentStatus;
    }

    public void setUniagentStatus(UniagentStatusEnum uniagentStatus) {
        this.uniagentStatus = uniagentStatus;
    }

    public AgentStatusInfo withExtensions(List<ExtensionInfo> extensions) {
        this.extensions = extensions;
        return this;
    }

    public AgentStatusInfo addExtensionsItem(ExtensionInfo extensionsItem) {
        if (this.extensions == null) {
            this.extensions = new ArrayList<>();
        }
        this.extensions.add(extensionsItem);
        return this;
    }

    public AgentStatusInfo withExtensions(Consumer<List<ExtensionInfo>> extensionsSetter) {
        if (this.extensions == null) {
            this.extensions = new ArrayList<>();
        }
        extensionsSetter.accept(this.extensions);
        return this;
    }

    /**
     * **参数解释**: 插件信息列表 
     * @return extensions
     */
    public List<ExtensionInfo> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<ExtensionInfo> extensions) {
        this.extensions = extensions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentStatusInfo that = (AgentStatusInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.uniagentStatus, that.uniagentStatus)
            && Objects.equals(this.extensions, that.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, uniagentStatus, extensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentStatusInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    uniagentStatus: ").append(toIndentedString(uniagentStatus)).append("\n");
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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
