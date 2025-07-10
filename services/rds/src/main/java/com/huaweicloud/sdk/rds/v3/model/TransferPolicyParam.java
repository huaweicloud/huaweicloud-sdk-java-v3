package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 转储策略信息
 */
public class TransferPolicyParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    /**
     * 转储备份类型， db:自动备份 log:增量备份, snapshot:手动备份 snapshot:手动备份 db:自动备份 log:日志备份
     */
    public static final class BackupTypeEnum {

        /**
         * Enum DB for value: "db"
         */
        public static final BackupTypeEnum DB = new BackupTypeEnum("db");

        /**
         * Enum LOG for value: "log"
         */
        public static final BackupTypeEnum LOG = new BackupTypeEnum("log");

        private static final Map<String, BackupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupTypeEnum> createStaticFields() {
            Map<String, BackupTypeEnum> map = new HashMap<>();
            map.put("db", DB);
            map.put("log", LOG);
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

    public TransferPolicyParam withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 转储目标前缀
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public TransferPolicyParam withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 转储目标桶
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TransferPolicyParam withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 自动转储周期
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public TransferPolicyParam withBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * 转储备份类型， db:自动备份 log:增量备份, snapshot:手动备份 snapshot:手动备份 db:自动备份 log:日志备份
     * @return backupType
     */
    public BackupTypeEnum getBackupType() {
        return backupType;
    }

    public void setBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferPolicyParam that = (TransferPolicyParam) obj;
        return Objects.equals(this.prefix, that.prefix) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.period, that.period) && Objects.equals(this.backupType, that.backupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, destination, period, backupType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferPolicyParam {\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
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
