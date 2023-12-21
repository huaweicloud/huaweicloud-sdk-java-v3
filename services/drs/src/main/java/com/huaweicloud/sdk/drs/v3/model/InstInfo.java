package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 迁移实例信息体
 */
public class InstInfo {

    /**
     * 引擎类型
     */
    public static final class EngineTypeEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineTypeEnum MYSQL = new EngineTypeEnum("mysql");

        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final EngineTypeEnum MONGODB = new EngineTypeEnum("mongodb");

        /**
         * Enum CLOUDDATAGUARD_MYSQL for value: "cloudDataGuard-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL = new EngineTypeEnum("cloudDataGuard-mysql");

        /**
         * Enum GAUSSDBV5 for value: "gaussdbv5"
         */
        public static final EngineTypeEnum GAUSSDBV5 = new EngineTypeEnum("gaussdbv5");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EngineTypeEnum POSTGRESQL = new EngineTypeEnum("postgresql");

        /**
         * Enum MYSQL_TO_KAFKA for value: "mysql-to-kafka"
         */
        public static final EngineTypeEnum MYSQL_TO_KAFKA = new EngineTypeEnum("mysql-to-kafka");

        /**
         * Enum TAURUS_TO_KAFKA for value: "taurus-to-kafka"
         */
        public static final EngineTypeEnum TAURUS_TO_KAFKA = new EngineTypeEnum("taurus-to-kafka");

        /**
         * Enum GAUSSDBV5HA_TO_KAFKA for value: "gaussdbv5ha-to-kafka"
         */
        public static final EngineTypeEnum GAUSSDBV5HA_TO_KAFKA = new EngineTypeEnum("gaussdbv5ha-to-kafka");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
            map.put("cloudDataGuard-mysql", CLOUDDATAGUARD_MYSQL);
            map.put("gaussdbv5", GAUSSDBV5);
            map.put("postgresql", POSTGRESQL);
            map.put("mysql-to-kafka", MYSQL_TO_KAFKA);
            map.put("taurus-to-kafka", TAURUS_TO_KAFKA);
            map.put("gaussdbv5ha-to-kafka", GAUSSDBV5HA_TO_KAFKA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineTypeEnum(value));
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private EngineTypeEnum engineType;

    /**
     * 实例类型
     */
    public static final class InstTypeEnum {

        /**
         * Enum HIGH for value: "high"
         */
        public static final InstTypeEnum HIGH = new InstTypeEnum("high");

        private static final Map<String, InstTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstTypeEnum> createStaticFields() {
            Map<String, InstTypeEnum> map = new HashMap<>();
            map.put("high", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstTypeEnum(String value) {
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
        public static InstTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstTypeEnum(value));
        }

        public static InstTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstTypeEnum) {
                return this.value.equals(((InstTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_type")

    private InstTypeEnum instType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    /**
     * 迁移实例的状态
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("deleted", DELETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

    public InstInfo withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public InstInfo withInstType(InstTypeEnum instType) {
        this.instType = instType;
        return this;
    }

    /**
     * 实例类型
     * @return instType
     */
    public InstTypeEnum getInstType() {
        return instType;
    }

    public void setInstType(InstTypeEnum instType) {
        this.instType = instType;
    }

    public InstInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 迁移实例所在的私有IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public InstInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 迁移实例所在的公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public InstInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 迁移实例任务定时启动时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public InstInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 迁移实例的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public InstInfo withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 迁移实例的磁盘大小
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstInfo that = (InstInfo) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.instType, that.instType)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.volumeSize, that.volumeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, instType, ip, publicIp, startTime, status, volumeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstInfo {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    instType: ").append(toIndentedString(instType)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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
