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
 * ListAgentStatusRequestBody
 */
public class ListAgentStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    /**
     * uniagent运行状态，不传查所有状态,none无，running运行中，silent静默中，unknown故障
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

    /**
     * 插件名称，不传查所有插件，目前仅支持telescope
     */
    public static final class ExtensionNameEnum {

        /**
         * Enum TELESCOPE for value: "telescope"
         */
        public static final ExtensionNameEnum TELESCOPE = new ExtensionNameEnum("telescope");

        private static final Map<String, ExtensionNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExtensionNameEnum> createStaticFields() {
            Map<String, ExtensionNameEnum> map = new HashMap<>();
            map.put("telescope", TELESCOPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExtensionNameEnum(String value) {
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
        public static ExtensionNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExtensionNameEnum(value));
        }

        public static ExtensionNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExtensionNameEnum) {
                return this.value.equals(((ExtensionNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_name")

    private ExtensionNameEnum extensionName;

    /**
     * 插件状态，不传查所有状态, none未安装，running运行中，stopped已停止，fault故障（进程异常），unknown故障（连接异常）
     */
    public static final class ExtensionStatusEnum {

        /**
         * Enum NONE for value: "none"
         */
        public static final ExtensionStatusEnum NONE = new ExtensionStatusEnum("none");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final ExtensionStatusEnum RUNNING = new ExtensionStatusEnum("running");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final ExtensionStatusEnum STOPPED = new ExtensionStatusEnum("stopped");

        /**
         * Enum FAULT for value: "fault"
         */
        public static final ExtensionStatusEnum FAULT = new ExtensionStatusEnum("fault");

        /**
         * Enum UNKNOWN for value: "unknown"
         */
        public static final ExtensionStatusEnum UNKNOWN = new ExtensionStatusEnum("unknown");

        private static final Map<String, ExtensionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExtensionStatusEnum> createStaticFields() {
            Map<String, ExtensionStatusEnum> map = new HashMap<>();
            map.put("none", NONE);
            map.put("running", RUNNING);
            map.put("stopped", STOPPED);
            map.put("fault", FAULT);
            map.put("unknown", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExtensionStatusEnum(String value) {
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
        public static ExtensionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExtensionStatusEnum(value));
        }

        public static ExtensionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExtensionStatusEnum) {
                return this.value.equals(((ExtensionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_status")

    private ExtensionStatusEnum extensionStatus;

    public ListAgentStatusRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public ListAgentStatusRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public ListAgentStatusRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 机器实例id列表
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public ListAgentStatusRequestBody withUniagentStatus(UniagentStatusEnum uniagentStatus) {
        this.uniagentStatus = uniagentStatus;
        return this;
    }

    /**
     * uniagent运行状态，不传查所有状态,none无，running运行中，silent静默中，unknown故障
     * @return uniagentStatus
     */
    public UniagentStatusEnum getUniagentStatus() {
        return uniagentStatus;
    }

    public void setUniagentStatus(UniagentStatusEnum uniagentStatus) {
        this.uniagentStatus = uniagentStatus;
    }

    public ListAgentStatusRequestBody withExtensionName(ExtensionNameEnum extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * 插件名称，不传查所有插件，目前仅支持telescope
     * @return extensionName
     */
    public ExtensionNameEnum getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(ExtensionNameEnum extensionName) {
        this.extensionName = extensionName;
    }

    public ListAgentStatusRequestBody withExtensionStatus(ExtensionStatusEnum extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }

    /**
     * 插件状态，不传查所有状态, none未安装，running运行中，stopped已停止，fault故障（进程异常），unknown故障（连接异常）
     * @return extensionStatus
     */
    public ExtensionStatusEnum getExtensionStatus() {
        return extensionStatus;
    }

    public void setExtensionStatus(ExtensionStatusEnum extensionStatus) {
        this.extensionStatus = extensionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentStatusRequestBody that = (ListAgentStatusRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.uniagentStatus, that.uniagentStatus)
            && Objects.equals(this.extensionName, that.extensionName)
            && Objects.equals(this.extensionStatus, that.extensionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, uniagentStatus, extensionName, extensionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentStatusRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    uniagentStatus: ").append(toIndentedString(uniagentStatus)).append("\n");
        sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
        sb.append("    extensionStatus: ").append(toIndentedString(extensionStatus)).append("\n");
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
