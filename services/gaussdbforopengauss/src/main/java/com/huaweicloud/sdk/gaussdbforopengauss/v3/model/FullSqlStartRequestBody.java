package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * **参数解释**: 开启全量SQL请求体。 **取值范围**: 不涉及。
 */
public class FullSqlStartRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_days")

    private Integer saveDays;

    /**
     * **参数解释**: 存储类型。 **约束限制**: 公有云场景，只支持LTS云日志服务存储。 **取值范围**: - LTS：LTS云日志服务。  **默认取值**: 不涉及。
     */
    public static final class StorageModeEnum {

        /**
         * Enum LTS for value: "LTS"
         */
        public static final StorageModeEnum LTS = new StorageModeEnum("LTS");

        private static final Map<String, StorageModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageModeEnum> createStaticFields() {
            Map<String, StorageModeEnum> map = new HashMap<>();
            map.put("LTS", LTS);
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
    @JsonProperty(value = "is_exclude_sys_user")

    private Boolean isExcludeSysUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_config")

    private LtsInfoOption ltsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type_range")

    private List<SqlTypeConfigOption> sqlTypeRange = null;

    public FullSqlStartRequestBody withSaveDays(Integer saveDays) {
        this.saveDays = saveDays;
        return this;
    }

    /**
     * **参数解释**: 全量SQL采集数据最大保留天数。 **约束限制**: 不涉及。 **取值范围**: [1, 30] **默认取值**: 不涉及。
     * minimum: 1
     * maximum: 30
     * @return saveDays
     */
    public Integer getSaveDays() {
        return saveDays;
    }

    public void setSaveDays(Integer saveDays) {
        this.saveDays = saveDays;
    }

    public FullSqlStartRequestBody withStorageMode(StorageModeEnum storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * **参数解释**: 存储类型。 **约束限制**: 公有云场景，只支持LTS云日志服务存储。 **取值范围**: - LTS：LTS云日志服务。  **默认取值**: 不涉及。
     * @return storageMode
     */
    public StorageModeEnum getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(StorageModeEnum storageMode) {
        this.storageMode = storageMode;
    }

    public FullSqlStartRequestBody withIsExcludeSysUser(Boolean isExcludeSysUser) {
        this.isExcludeSysUser = isExcludeSysUser;
        return this;
    }

    /**
     * **参数解释**: 是否过滤系统用户。 **约束限制**: 不涉及。 **取值范围**: - true：过滤系统用户。 - false：不过滤系统用户。  **默认取值**: 不涉及。
     * @return isExcludeSysUser
     */
    public Boolean getIsExcludeSysUser() {
        return isExcludeSysUser;
    }

    public void setIsExcludeSysUser(Boolean isExcludeSysUser) {
        this.isExcludeSysUser = isExcludeSysUser;
    }

    public FullSqlStartRequestBody withLtsConfig(LtsInfoOption ltsConfig) {
        this.ltsConfig = ltsConfig;
        return this;
    }

    public FullSqlStartRequestBody withLtsConfig(Consumer<LtsInfoOption> ltsConfigSetter) {
        if (this.ltsConfig == null) {
            this.ltsConfig = new LtsInfoOption();
            ltsConfigSetter.accept(this.ltsConfig);
        }

        return this;
    }

    /**
     * Get ltsConfig
     * @return ltsConfig
     */
    public LtsInfoOption getLtsConfig() {
        return ltsConfig;
    }

    public void setLtsConfig(LtsInfoOption ltsConfig) {
        this.ltsConfig = ltsConfig;
    }

    public FullSqlStartRequestBody withSqlTypeRange(List<SqlTypeConfigOption> sqlTypeRange) {
        this.sqlTypeRange = sqlTypeRange;
        return this;
    }

    public FullSqlStartRequestBody addSqlTypeRangeItem(SqlTypeConfigOption sqlTypeRangeItem) {
        if (this.sqlTypeRange == null) {
            this.sqlTypeRange = new ArrayList<>();
        }
        this.sqlTypeRange.add(sqlTypeRangeItem);
        return this;
    }

    public FullSqlStartRequestBody withSqlTypeRange(Consumer<List<SqlTypeConfigOption>> sqlTypeRangeSetter) {
        if (this.sqlTypeRange == null) {
            this.sqlTypeRange = new ArrayList<>();
        }
        sqlTypeRangeSetter.accept(this.sqlTypeRange);
        return this;
    }

    /**
     * **参数解释**: SQL采集类型列表。默认取值[]，表示采集所有SQL语句。 **约束限制**: 不涉及。
     * @return sqlTypeRange
     */
    public List<SqlTypeConfigOption> getSqlTypeRange() {
        return sqlTypeRange;
    }

    public void setSqlTypeRange(List<SqlTypeConfigOption> sqlTypeRange) {
        this.sqlTypeRange = sqlTypeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlStartRequestBody that = (FullSqlStartRequestBody) obj;
        return Objects.equals(this.saveDays, that.saveDays) && Objects.equals(this.storageMode, that.storageMode)
            && Objects.equals(this.isExcludeSysUser, that.isExcludeSysUser)
            && Objects.equals(this.ltsConfig, that.ltsConfig) && Objects.equals(this.sqlTypeRange, that.sqlTypeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saveDays, storageMode, isExcludeSysUser, ltsConfig, sqlTypeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlStartRequestBody {\n");
        sb.append("    saveDays: ").append(toIndentedString(saveDays)).append("\n");
        sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
        sb.append("    isExcludeSysUser: ").append(toIndentedString(isExcludeSysUser)).append("\n");
        sb.append("    ltsConfig: ").append(toIndentedString(ltsConfig)).append("\n");
        sb.append("    sqlTypeRange: ").append(toIndentedString(sqlTypeRange)).append("\n");
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
