package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 配置参数body
 */
public class ConfigBody {

    /**
     * 配置类型 MIGRATE_EXCLUDE_DIR: 迁移时设定的不迁移目录 SYNC_EXCLUDE_DIR: 同步时设定的不同步目录 ONLY_SYNC_DIR: 同步时设定的同步目录 CONSISTENCY_DIR: 一致性校验的目录 CONSISTENCY_DIR_ILLEGAL: 一致性校验后非法目录 LINUX_BLOCK_COMPRESS_THREAD_NUM: linux块迁移压缩线程个数 MIGRATE_DST_IP: 迁移目的ip LINUX_BLOCK_CACHE_SIZE: linux块迁移缓存大小 LINUX_CPU_LIMIT: linux的cpu限制 LINUX_MEM_LIMIT: linux的内存限制 LINUX_IO_LIMIT: linux的IO限制 NUM_PROCESS_MIGRATE: 迁移进程数 NUM_PROCESS_SYNC: 同步进程数 CONSISTENCY_RECHECK: 一致性校验再检 CONSISTENCY_MODE: 一致性校验模式 DYNAMIC_PORT: 动态端口
     */
    public static final class ConfigKeyEnum {

        /**
         * Enum MIGRATE_EXCLUDE_DIR for value: "MIGRATE_EXCLUDE_DIR"
         */
        public static final ConfigKeyEnum MIGRATE_EXCLUDE_DIR = new ConfigKeyEnum("MIGRATE_EXCLUDE_DIR");

        /**
         * Enum SYNC_EXCLUDE_DIR for value: "SYNC_EXCLUDE_DIR"
         */
        public static final ConfigKeyEnum SYNC_EXCLUDE_DIR = new ConfigKeyEnum("SYNC_EXCLUDE_DIR");

        /**
         * Enum ONLY_SYNC_DIR for value: "ONLY_SYNC_DIR"
         */
        public static final ConfigKeyEnum ONLY_SYNC_DIR = new ConfigKeyEnum("ONLY_SYNC_DIR");

        /**
         * Enum CONSISTENCY_DIR for value: "CONSISTENCY_DIR"
         */
        public static final ConfigKeyEnum CONSISTENCY_DIR = new ConfigKeyEnum("CONSISTENCY_DIR");

        /**
         * Enum CONSISTENCY_DIR_ILLEGAL for value: "CONSISTENCY_DIR_ILLEGAL"
         */
        public static final ConfigKeyEnum CONSISTENCY_DIR_ILLEGAL = new ConfigKeyEnum("CONSISTENCY_DIR_ILLEGAL");

        /**
         * Enum LINUX_BLOCK_COMPRESS_THREAD_NUM for value: "LINUX_BLOCK_COMPRESS_THREAD_NUM"
         */
        public static final ConfigKeyEnum LINUX_BLOCK_COMPRESS_THREAD_NUM =
            new ConfigKeyEnum("LINUX_BLOCK_COMPRESS_THREAD_NUM");

        /**
         * Enum MIGRATE_DST_IP for value: "MIGRATE_DST_IP"
         */
        public static final ConfigKeyEnum MIGRATE_DST_IP = new ConfigKeyEnum("MIGRATE_DST_IP");

        /**
         * Enum LINUX_BLOCK_CACHE_SIZE for value: "LINUX_BLOCK_CACHE_SIZE"
         */
        public static final ConfigKeyEnum LINUX_BLOCK_CACHE_SIZE = new ConfigKeyEnum("LINUX_BLOCK_CACHE_SIZE");

        /**
         * Enum LINUX_CPU_LIMIT for value: "LINUX_CPU_LIMIT"
         */
        public static final ConfigKeyEnum LINUX_CPU_LIMIT = new ConfigKeyEnum("LINUX_CPU_LIMIT");

        /**
         * Enum LINUX_MEM_LIMIT for value: "LINUX_MEM_LIMIT"
         */
        public static final ConfigKeyEnum LINUX_MEM_LIMIT = new ConfigKeyEnum("LINUX_MEM_LIMIT");

        /**
         * Enum LINUX_IO_LIMIT for value: "LINUX_IO_LIMIT"
         */
        public static final ConfigKeyEnum LINUX_IO_LIMIT = new ConfigKeyEnum("LINUX_IO_LIMIT");

        /**
         * Enum NUM_PROCESS_MIGRATE for value: "NUM_PROCESS_MIGRATE"
         */
        public static final ConfigKeyEnum NUM_PROCESS_MIGRATE = new ConfigKeyEnum("NUM_PROCESS_MIGRATE");

        /**
         * Enum NUM_PROCESS_SYNC for value: "NUM_PROCESS_SYNC"
         */
        public static final ConfigKeyEnum NUM_PROCESS_SYNC = new ConfigKeyEnum("NUM_PROCESS_SYNC");

        /**
         * Enum CONSISTENCY_RECHECK for value: "CONSISTENCY_RECHECK"
         */
        public static final ConfigKeyEnum CONSISTENCY_RECHECK = new ConfigKeyEnum("CONSISTENCY_RECHECK");

        /**
         * Enum CONSISTENCY_MODE for value: "CONSISTENCY_MODE"
         */
        public static final ConfigKeyEnum CONSISTENCY_MODE = new ConfigKeyEnum("CONSISTENCY_MODE");

        /**
         * Enum DYNAMIC_PORT for value: "DYNAMIC_PORT"
         */
        public static final ConfigKeyEnum DYNAMIC_PORT = new ConfigKeyEnum("DYNAMIC_PORT");

        private static final Map<String, ConfigKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigKeyEnum> createStaticFields() {
            Map<String, ConfigKeyEnum> map = new HashMap<>();
            map.put("MIGRATE_EXCLUDE_DIR", MIGRATE_EXCLUDE_DIR);
            map.put("SYNC_EXCLUDE_DIR", SYNC_EXCLUDE_DIR);
            map.put("ONLY_SYNC_DIR", ONLY_SYNC_DIR);
            map.put("CONSISTENCY_DIR", CONSISTENCY_DIR);
            map.put("CONSISTENCY_DIR_ILLEGAL", CONSISTENCY_DIR_ILLEGAL);
            map.put("LINUX_BLOCK_COMPRESS_THREAD_NUM", LINUX_BLOCK_COMPRESS_THREAD_NUM);
            map.put("MIGRATE_DST_IP", MIGRATE_DST_IP);
            map.put("LINUX_BLOCK_CACHE_SIZE", LINUX_BLOCK_CACHE_SIZE);
            map.put("LINUX_CPU_LIMIT", LINUX_CPU_LIMIT);
            map.put("LINUX_MEM_LIMIT", LINUX_MEM_LIMIT);
            map.put("LINUX_IO_LIMIT", LINUX_IO_LIMIT);
            map.put("NUM_PROCESS_MIGRATE", NUM_PROCESS_MIGRATE);
            map.put("NUM_PROCESS_SYNC", NUM_PROCESS_SYNC);
            map.put("CONSISTENCY_RECHECK", CONSISTENCY_RECHECK);
            map.put("CONSISTENCY_MODE", CONSISTENCY_MODE);
            map.put("DYNAMIC_PORT", DYNAMIC_PORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigKeyEnum(String value) {
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
        public static ConfigKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfigKeyEnum(value));
        }

        public static ConfigKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfigKeyEnum) {
                return this.value.equals(((ConfigKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_key")

    private ConfigKeyEnum configKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private String configStatus;

    public ConfigBody withConfigKey(ConfigKeyEnum configKey) {
        this.configKey = configKey;
        return this;
    }

    /**
     * 配置类型 MIGRATE_EXCLUDE_DIR: 迁移时设定的不迁移目录 SYNC_EXCLUDE_DIR: 同步时设定的不同步目录 ONLY_SYNC_DIR: 同步时设定的同步目录 CONSISTENCY_DIR: 一致性校验的目录 CONSISTENCY_DIR_ILLEGAL: 一致性校验后非法目录 LINUX_BLOCK_COMPRESS_THREAD_NUM: linux块迁移压缩线程个数 MIGRATE_DST_IP: 迁移目的ip LINUX_BLOCK_CACHE_SIZE: linux块迁移缓存大小 LINUX_CPU_LIMIT: linux的cpu限制 LINUX_MEM_LIMIT: linux的内存限制 LINUX_IO_LIMIT: linux的IO限制 NUM_PROCESS_MIGRATE: 迁移进程数 NUM_PROCESS_SYNC: 同步进程数 CONSISTENCY_RECHECK: 一致性校验再检 CONSISTENCY_MODE: 一致性校验模式 DYNAMIC_PORT: 动态端口
     * @return configKey
     */
    public ConfigKeyEnum getConfigKey() {
        return configKey;
    }

    public void setConfigKey(ConfigKeyEnum configKey) {
        this.configKey = configKey;
    }

    public ConfigBody withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 具体配置参数字段，保存于数据库，最终在agent端进行解析
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public ConfigBody withConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * 描述配置状态的保留字段
     * @return configStatus
     */
    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigBody that = (ConfigBody) obj;
        return Objects.equals(this.configKey, that.configKey) && Objects.equals(this.configValue, that.configValue)
            && Objects.equals(this.configStatus, that.configStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configKey, configValue, configStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigBody {\n");
        sb.append("    configKey: ").append(toIndentedString(configKey)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
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
