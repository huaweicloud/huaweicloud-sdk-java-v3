package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 备份实例请求体 */
public class BackupInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    /** 备份缓存实例的格式。 */
    public static final class BackupFormatEnum {

        /** Enum AOF for value: "aof" */
        public static final BackupFormatEnum AOF = new BackupFormatEnum("aof");

        /** Enum RDB for value: "rdb" */
        public static final BackupFormatEnum RDB = new BackupFormatEnum("rdb");

        private static final Map<String, BackupFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupFormatEnum> createStaticFields() {
            Map<String, BackupFormatEnum> map = new HashMap<>();
            map.put("aof", AOF);
            map.put("rdb", RDB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupFormatEnum(String value) {
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
        public static BackupFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BackupFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackupFormatEnum(value);
            }
            return result;
        }

        public static BackupFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BackupFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupFormatEnum) {
                return this.value.equals(((BackupFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_format")

    private BackupFormatEnum backupFormat;

    public BackupInstanceBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 备份缓存实例的备注信息。
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BackupInstanceBody withBackupFormat(BackupFormatEnum backupFormat) {
        this.backupFormat = backupFormat;
        return this;
    }

    /** 备份缓存实例的格式。
     * 
     * @return backupFormat */
    public BackupFormatEnum getBackupFormat() {
        return backupFormat;
    }

    public void setBackupFormat(BackupFormatEnum backupFormat) {
        this.backupFormat = backupFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupInstanceBody backupInstanceBody = (BackupInstanceBody) o;
        return Objects.equals(this.remark, backupInstanceBody.remark)
            && Objects.equals(this.backupFormat, backupInstanceBody.backupFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remark, backupFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupInstanceBody {\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    backupFormat: ").append(toIndentedString(backupFormat)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
