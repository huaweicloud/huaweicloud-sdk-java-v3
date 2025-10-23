package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DbOffsiteBackupPolicyBody
 */
public class DbOffsiteBackupPolicyBody {

    /**
     * 指定备份的类型。取值如下：auto：自动全量备份。incremental：自动增量备份。all：同时设置所有备份类型。Db: 数据库。Log：日志
     */
    public static final class BackupTypeEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final BackupTypeEnum AUTO = new BackupTypeEnum("auto");

        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final BackupTypeEnum INCREMENTAL = new BackupTypeEnum("incremental");

        /**
         * Enum ALL for value: "all"
         */
        public static final BackupTypeEnum ALL = new BackupTypeEnum("all");

        /**
         * Enum DB for value: "Db"
         */
        public static final BackupTypeEnum DB = new BackupTypeEnum("Db");

        /**
         * Enum LOG for value: "Log"
         */
        public static final BackupTypeEnum LOG = new BackupTypeEnum("Log");

        private static final Map<String, BackupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupTypeEnum> createStaticFields() {
            Map<String, BackupTypeEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("incremental", INCREMENTAL);
            map.put("all", ALL);
            map.put("Db", DB);
            map.put("Log", LOG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupTypeEnum(String value) {
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
        public static BackupTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BackupTypeEnum(value));
        }

        public static BackupTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupTypeEnum) {
                return this.value.equals(((BackupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_type")

    private BackupTypeEnum backupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    public DbOffsiteBackupPolicyBody withBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * 指定备份的类型。取值如下：auto：自动全量备份。incremental：自动增量备份。all：同时设置所有备份类型。Db: 数据库。Log：日志
     * @return backupType
     */
    public BackupTypeEnum getBackupType() {
        return backupType;
    }

    public void setBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
    }

    public DbOffsiteBackupPolicyBody withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 指定已生成的备份文件可以保存的天数。取值范围：0～1825。保存天数设置为0时，表示关闭跨区域备份策略。
     * minimum: 0
     * maximum: 1825
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public DbOffsiteBackupPolicyBody withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 设置跨区域备份策略的目标区域ID。
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public DbOffsiteBackupPolicyBody withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /**
     * 设置跨区域备份策略的目标project ID。
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbOffsiteBackupPolicyBody that = (DbOffsiteBackupPolicyBody) obj;
        return Objects.equals(this.backupType, that.backupType) && Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupType, keepDays, destinationRegion, destinationProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbOffsiteBackupPolicyBody {\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
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
