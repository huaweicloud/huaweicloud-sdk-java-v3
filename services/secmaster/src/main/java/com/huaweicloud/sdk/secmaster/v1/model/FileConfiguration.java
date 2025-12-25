package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FileConfiguration
 */
public class FileConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private FileType fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private Map<String, String> param = null;

    /**
     * **参数解释**: 配置类型 - HISTORY 历史版本 - CURRENT_SAVE 当前保存 - CURRENT_APPLY 当前使用  **约束限制** 不涉及 **取值范围**: - HISTORY - CURRENT_SAVE - CURRENT_APPLY  **默认值** 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum HISTORY for value: "HISTORY"
         */
        public static final TypeEnum HISTORY = new TypeEnum("HISTORY");

        /**
         * Enum CURRENT_SAVE for value: "CURRENT_SAVE"
         */
        public static final TypeEnum CURRENT_SAVE = new TypeEnum("CURRENT_SAVE");

        /**
         * Enum CURRENT_APPLY for value: "CURRENT_APPLY"
         */
        public static final TypeEnum CURRENT_APPLY = new TypeEnum("CURRENT_APPLY");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("HISTORY", HISTORY);
            map.put("CURRENT_SAVE", CURRENT_SAVE);
            map.put("CURRENT_APPLY", CURRENT_APPLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public FileConfiguration withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileConfiguration withFileType(FileType fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get fileType
     * @return fileType
     */
    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public FileConfiguration withNodeId(String nodeId) {
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

    public FileConfiguration withParam(Map<String, String> param) {
        this.param = param;
        return this;
    }

    public FileConfiguration putParamItem(String key, String paramItem) {
        if (this.param == null) {
            this.param = new HashMap<>();
        }
        this.param.put(key, paramItem);
        return this;
    }

    public FileConfiguration withParam(Consumer<Map<String, String>> paramSetter) {
        if (this.param == null) {
            this.param = new HashMap<>();
        }
        paramSetter.accept(this.param);
        return this;
    }

    /**
     * 参数
     * @return param
     */
    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    public FileConfiguration withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 配置类型 - HISTORY 历史版本 - CURRENT_SAVE 当前保存 - CURRENT_APPLY 当前使用  **约束限制** 不涉及 **取值范围**: - HISTORY - CURRENT_SAVE - CURRENT_APPLY  **默认值** 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
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
        FileConfiguration that = (FileConfiguration) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.param, that.param)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileType, nodeId, param, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileConfiguration {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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
