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
 * ConfigurationDetail
 */
public class ConfigurationDetail {

    /**
     * **参数解释**: 节点部署状态 - UN_SAVED 待保存 - SAVE_AND_UN_APPLY 待应用 - MOVE_AND_UN_APPLY 待移除 - APPLYING 应用中 - FAIL_APPLY 应用失败 - APPLIED 应用完成  **约束限制** 不涉及 **取值范围**: - UN_SAVED - SAVE_AND_UN_APPLY - MOVE_AND_UN_APPLY - APPLYING - FAIL_APPLY - APPLIED  **默认值** 不涉及
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
    @JsonProperty(value = "list")

    private List<FileConfiguration> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    public ConfigurationDetail withConfigStatus(ConfigStatusEnum configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * **参数解释**: 节点部署状态 - UN_SAVED 待保存 - SAVE_AND_UN_APPLY 待应用 - MOVE_AND_UN_APPLY 待移除 - APPLYING 应用中 - FAIL_APPLY 应用失败 - APPLIED 应用完成  **约束限制** 不涉及 **取值范围**: - UN_SAVED - SAVE_AND_UN_APPLY - MOVE_AND_UN_APPLY - APPLYING - FAIL_APPLY - APPLIED  **默认值** 不涉及
     * @return configStatus
     */
    public ConfigStatusEnum getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(ConfigStatusEnum configStatus) {
        this.configStatus = configStatus;
    }

    public ConfigurationDetail withList(List<FileConfiguration> list) {
        this.list = list;
        return this;
    }

    public ConfigurationDetail addListItem(FileConfiguration listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ConfigurationDetail withList(Consumer<List<FileConfiguration>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 文件配置列表
     * @return list
     */
    public List<FileConfiguration> getList() {
        return list;
    }

    public void setList(List<FileConfiguration> list) {
        this.list = list;
    }

    public ConfigurationDetail withNodeId(String nodeId) {
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

    public ConfigurationDetail withNodeName(String nodeName) {
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

    public ConfigurationDetail withSpecification(String specification) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationDetail that = (ConfigurationDetail) obj;
        return Objects.equals(this.configStatus, that.configStatus) && Objects.equals(this.list, that.list)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.specification, that.specification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configStatus, list, nodeId, nodeName, specification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationDetail {\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
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
