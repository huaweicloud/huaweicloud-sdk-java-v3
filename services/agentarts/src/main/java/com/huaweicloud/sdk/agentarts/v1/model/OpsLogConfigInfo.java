package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OpsLogConfigInfo
 */
public class OpsLogConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * **参数解释：** 日志存储方式。  **约束限制：** 不涉及  **取值范围：** prefabricate：预制，customize：自定义。  **默认取值：** 无
     */
    public static final class StorageModeEnum {

        /**
         * Enum PREFABRICATE for value: "prefabricate"
         */
        public static final StorageModeEnum PREFABRICATE = new StorageModeEnum("prefabricate");

        /**
         * Enum CUSTOMIZE for value: "customize"
         */
        public static final StorageModeEnum CUSTOMIZE = new StorageModeEnum("customize");

        private static final Map<String, StorageModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageModeEnum> createStaticFields() {
            Map<String, StorageModeEnum> map = new HashMap<>();
            map.put("prefabricate", PREFABRICATE);
            map.put("customize", CUSTOMIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageModeEnum(String value) {
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
        public static StorageModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageModeEnum(value));
        }

        public static StorageModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageModeEnum) {
                return this.value.equals(((StorageModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mode")

    private StorageModeEnum storageMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    public OpsLogConfigInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启日志采集。  **约束限制：** 不涉及  **取值范围：** true或false。  **默认取值：** false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public OpsLogConfigInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目ID。  **约束限制：** 不涉及  **取值范围：** 长度为 0 - 64 个字符。  **默认取值：** 无
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public OpsLogConfigInfo withStorageMode(StorageModeEnum storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * **参数解释：** 日志存储方式。  **约束限制：** 不涉及  **取值范围：** prefabricate：预制，customize：自定义。  **默认取值：** 无
     * @return storageMode
     */
    public StorageModeEnum getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(StorageModeEnum storageMode) {
        this.storageMode = storageMode;
    }

    public OpsLogConfigInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 日志组ID，可以通过LTS的控制台页面或者LTS日志组查询接口获取。日志组ID和日志流ID都没有指定时，使用默认的日志组和日志流。  **约束限制：** 不涉及  **取值范围：** 长度为 0 - 64 个字符。  **默认取值：** 无
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public OpsLogConfigInfo withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * **参数解释：** 日志流ID，可以通过LTS的控制台页面或者LTS日志流查询接口获取。  **约束限制：** 日志组ID指定时，日志流ID必填。  **取值范围：** 长度为 0 - 64 个字符。  **默认取值：** 无
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsLogConfigInfo that = (OpsLogConfigInfo) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.storageMode, that.storageMode) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.streamId, that.streamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, projectId, storageMode, groupId, streamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsLogConfigInfo {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
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
