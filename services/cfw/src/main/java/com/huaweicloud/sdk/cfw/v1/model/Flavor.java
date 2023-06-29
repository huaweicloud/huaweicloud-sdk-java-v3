package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Flavor
 */
public class Flavor {

    /**
     * 防火墙版本，0：标准版，1：专业版，2：铂金版，3：基础版
     */
    public static final class VersionEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final VersionEnum NUMBER_0 = new VersionEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final VersionEnum NUMBER_1 = new VersionEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final VersionEnum NUMBER_2 = new VersionEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final VersionEnum NUMBER_3 = new VersionEnum(3);

        private static final Map<Integer, VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, VersionEnum> createStaticFields() {
            Map<Integer, VersionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        VersionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionEnum(value));
        }

        public static VersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionEnum) {
                return this.value.equals(((VersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private VersionEnum version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_count")

    private Integer eipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_count")

    private Integer vpcCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_storage")

    private Integer logStorage;

    public Flavor withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    /**
     * 防火墙版本，0：标准版，1：专业版，2：铂金版，3：基础版
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public Flavor withEipCount(Integer eipCount) {
        this.eipCount = eipCount;
        return this;
    }

    /**
     * eip数量
     * minimum: 1
     * @return eipCount
     */
    public Integer getEipCount() {
        return eipCount;
    }

    public void setEipCount(Integer eipCount) {
        this.eipCount = eipCount;
    }

    public Flavor withVpcCount(Integer vpcCount) {
        this.vpcCount = vpcCount;
        return this;
    }

    /**
     * vpc数量
     * minimum: 1
     * @return vpcCount
     */
    public Integer getVpcCount() {
        return vpcCount;
    }

    public void setVpcCount(Integer vpcCount) {
        this.vpcCount = vpcCount;
    }

    public Flavor withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 带宽
     * minimum: 1
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Flavor withLogStorage(Integer logStorage) {
        this.logStorage = logStorage;
        return this;
    }

    /**
     * 日志存储
     * @return logStorage
     */
    public Integer getLogStorage() {
        return logStorage;
    }

    public void setLogStorage(Integer logStorage) {
        this.logStorage = logStorage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.eipCount, that.eipCount)
            && Objects.equals(this.vpcCount, that.vpcCount) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.logStorage, that.logStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, eipCount, vpcCount, bandwidth, logStorage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    eipCount: ").append(toIndentedString(eipCount)).append("\n");
        sb.append("    vpcCount: ").append(toIndentedString(vpcCount)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    logStorage: ").append(toIndentedString(logStorage)).append("\n");
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
