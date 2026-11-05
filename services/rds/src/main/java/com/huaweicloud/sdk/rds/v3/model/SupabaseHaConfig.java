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
 * HA配置。
 */
public class SupabaseHaConfig {

    /**
     * Gets or Sets mode
     */
    public static final class ModeEnum {

        /**
         * Enum HA for value: "Ha"
         */
        public static final ModeEnum HA = new ModeEnum("Ha");

        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ModeEnum SINGLE = new ModeEnum("Single");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Ha", HA);
            map.put("Single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    /**
     * Gets or Sets replicationMode
     */
    public static final class ReplicationModeEnum {

        /**
         * Enum ASYNC for value: "async"
         */
        public static final ReplicationModeEnum ASYNC = new ReplicationModeEnum("async");

        /**
         * Enum SYNC for value: "sync"
         */
        public static final ReplicationModeEnum SYNC = new ReplicationModeEnum("sync");

        private static final Map<String, ReplicationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicationModeEnum> createStaticFields() {
            Map<String, ReplicationModeEnum> map = new HashMap<>();
            map.put("async", ASYNC);
            map.put("sync", SYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplicationModeEnum(String value) {
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
        public static ReplicationModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplicationModeEnum(value));
        }

        public static ReplicationModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplicationModeEnum) {
                return this.value.equals(((ReplicationModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_mode")

    private ReplicationModeEnum replicationMode;

    public SupabaseHaConfig withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public SupabaseHaConfig withReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    /**
     * Get replicationMode
     * @return replicationMode
     */
    public ReplicationModeEnum getReplicationMode() {
        return replicationMode;
    }

    public void setReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupabaseHaConfig that = (SupabaseHaConfig) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.replicationMode, that.replicationMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, replicationMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseHaConfig {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
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
