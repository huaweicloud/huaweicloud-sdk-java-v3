package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConfigSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 迁移类型 WINDOWS_MIGRATE_BLOCK: windows块级迁移 LINUX_MIGRATE_FILE: linux文件级迁移 LINUX_MIGRATE_BLOCK: linux块级迁移
     */
    public static final class MigrateTypeEnum {

        /**
         * Enum WINDOWS_MIGRATE_BLOCK for value: "WINDOWS_MIGRATE_BLOCK"
         */
        public static final MigrateTypeEnum WINDOWS_MIGRATE_BLOCK = new MigrateTypeEnum("WINDOWS_MIGRATE_BLOCK");

        /**
         * Enum LINUX_MIGRATE_FILE for value: "LINUX_MIGRATE_FILE"
         */
        public static final MigrateTypeEnum LINUX_MIGRATE_FILE = new MigrateTypeEnum("LINUX_MIGRATE_FILE");

        /**
         * Enum LINUX_MIGRATE_BLOCK for value: "LINUX_MIGRATE_BLOCK"
         */
        public static final MigrateTypeEnum LINUX_MIGRATE_BLOCK = new MigrateTypeEnum("LINUX_MIGRATE_BLOCK");

        private static final Map<String, MigrateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrateTypeEnum> createStaticFields() {
            Map<String, MigrateTypeEnum> map = new HashMap<>();
            map.put("WINDOWS_MIGRATE_BLOCK", WINDOWS_MIGRATE_BLOCK);
            map.put("LINUX_MIGRATE_FILE", LINUX_MIGRATE_FILE);
            map.put("LINUX_MIGRATE_BLOCK", LINUX_MIGRATE_BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrateTypeEnum(String value) {
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
        public static MigrateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MigrateTypeEnum(value));
        }

        public static MigrateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrateTypeEnum) {
                return this.value.equals(((MigrateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_type")

    private MigrateTypeEnum migrateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ConfigBody> configurations = null;

    public ShowConfigSettingResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowConfigSettingResponse withMigrateType(MigrateTypeEnum migrateType) {
        this.migrateType = migrateType;
        return this;
    }

    /**
     * 迁移类型 WINDOWS_MIGRATE_BLOCK: windows块级迁移 LINUX_MIGRATE_FILE: linux文件级迁移 LINUX_MIGRATE_BLOCK: linux块级迁移
     * @return migrateType
     */
    public MigrateTypeEnum getMigrateType() {
        return migrateType;
    }

    public void setMigrateType(MigrateTypeEnum migrateType) {
        this.migrateType = migrateType;
    }

    public ShowConfigSettingResponse withConfigurations(List<ConfigBody> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ShowConfigSettingResponse addConfigurationsItem(ConfigBody configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ShowConfigSettingResponse withConfigurations(Consumer<List<ConfigBody>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 配置项的具体配置信息
     * @return configurations
     */
    public List<ConfigBody> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigBody> configurations) {
        this.configurations = configurations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConfigSettingResponse that = (ShowConfigSettingResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.migrateType, that.migrateType)
            && Objects.equals(this.configurations, that.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, migrateType, configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigSettingResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    migrateType: ").append(toIndentedString(migrateType)).append("\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
